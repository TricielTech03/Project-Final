
package org.finalled.com.conrtoller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.finalled.com.entity.Test;
import org.finalled.com.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


@RestController
public class TestController 
{
		
	     @Autowired
	     private TestService testService;
	    		
		//Rest api method to get all trucks details
		/*@RequestMapping("/getTrucks")
		public List<Truck> getTrucks() 
		      {
				return truckService.getTrucks();
		      }*/
	     @RequestMapping("/test_list.php")
		public Map<String, List<Test>> getTrucks() throws JsonProcessingException 
		{
		 Map<String, List<Test>> usersMap = new HashMap<String, List<Test>>();
		  List<Test> tests = testService.getTests();
		  usersMap.put("result", tests);
		  ObjectMapper mapper = new ObjectMapper();
		  System.out.println(mapper.writeValueAsString(usersMap));

		  return usersMap;
		
		}
		
		
		
		
		//Rest api method to get particular truck based on id
		@RequestMapping("/getTest/{id}")
		public Optional<Test> getTest(@PathVariable Long id) 
		      {
			    return testService.getTest(id);
		      }
		
		//Rest api method to create a new truck
		@RequestMapping(value="/createTest", method=RequestMethod.PUT,consumes = {"multipart/form-data"})
		public void createTest(@RequestPart ("Test") Test test,@RequestPart("file") MultipartFile file) 
		      {
			
			File uploadedFile = new File("/home/rajesh/Documents", file.getOriginalFilename());
	        String filepath=uploadedFile.getAbsolutePath();
	        System.out.println(filepath);
	        test.setTruckMainImg(filepath);
	        try {
	            uploadedFile.createNewFile();
	            FileOutputStream fileOutputStream = new FileOutputStream(uploadedFile);
	            fileOutputStream.write(file.getBytes());
	            fileOutputStream.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
			
	        
			       testService.createTest(test);	
			       
			  
		      }
		
		//Rest api method to get an update of existing truck
		@RequestMapping(value ="/updateTest", method=RequestMethod.POST)
		public void updateTest(@RequestBody Test test) 
		      {
			       testService.updateTest(test);
		      }
		
		//Rest api method to delete  a truck based on id 
		@RequestMapping("/deleteTest/{id}")
		public void deleteTest(@PathVariable Long id) 
		    {
			testService.deleteTest(id);
	    	}


}
