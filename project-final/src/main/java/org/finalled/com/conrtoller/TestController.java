package org.finalled.com.conrtoller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;

import org.finalled.com.entity.Test;
import org.finalled.com.repository.TestRepository;
import org.finalled.com.repository.userDetailsDTO;
import org.finalled.com.service.TestService;
import org.finalled.com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.UrlResource;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.web.firewall.DefaultHttpFirewall;
import org.springframework.security.web.firewall.HttpFirewall;
import org.springframework.security.web.firewall.StrictHttpFirewall;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.core.io.Resource;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.file.Path;

@RestController
public class TestController 
{
	@Autowired
	 private TestRepository testRepository;
	     @Autowired
	     private TestService testService;
	    		
	     
		//Rest api method to get all trucks details
		/*@RequestMapping("/getTrucks")
		public List<Truck> getTrucks() 
		      {
				return truckService.getTrucks();
		      }*/
	
	  @RequestMapping("/plus_list.php")
	  
	  @ResponseBody public Map<String, List<Test>> getTrucks() throws
	  JsonProcessingException { Map<String, List<Test>> usersMap = new
	  HashMap<String, List<Test>>(); List<Test> tests = testService.getTests();
	  usersMap.put("result", tests); ObjectMapper mapper = new ObjectMapper();
	  System.out.println(mapper.writeValueAsString(usersMap));
	  
	  return usersMap;
	  
	  }
	 
		
		
		
		
	
	  //Rest api method to get particular truck based on id
	  
	  @RequestMapping("/plus_list.php/{id}") public Optional<Test>
	  getTest(@PathVariable Long id) { return testService.getTest(id); }
	 

	
	 
		
		 @RequestMapping(value= {"/plus_list.php/"}, method=RequestMethod.GET)
			
	public Map<String, List<Test>> findByTruckType(
			/* @PathVariable Long id, */@Param(value = "truckType") String truckType) throws JsonProcessingException 
			{
			 Map<String, List<Test>> usersMap = new HashMap<String, List<Test>>();
			  List<Test> Users =testRepository.findByTruckType(truckType);
			  usersMap.put("result", Users);
			  ObjectMapper mapper = new ObjectMapper();
			  System.out.println(mapper.writeValueAsString(usersMap));

			  return usersMap;
			
			}
		
	 
		//Rest api method to create a new truck
		@RequestMapping(value="/createTest", method=RequestMethod.PUT, consumes = {"multipart/form-data"})
		
		public void createTest(@RequestPart ("Test") Test test, @RequestPart("file") MultipartFile file) 
		      {
			
					File uploadedFile = new File("C:\\Users\\Triciel027\\Desktop\\UploadImages", file.getOriginalFilename());
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
		
		
		
		
		
		
		@RequestMapping(value = "C:/Users/Triciel027/Desktop/UploadImages/{fileName:.+}", method = RequestMethod.GET, produces = MediaType.APPLICATION_OCTET_STREAM_VALUE)
	    public ResponseEntity<Object> downloadFile(@PathVariable String fileName, HttpServletResponse response) {
	 
	        String filePath = "C:/Users/Triciel027/Desktop/UploadImages/" + fileName;
	        Path path = Paths.get(filePath);
	        Resource resource = null;
	 
	        try {
	            resource = new UrlResource(path.toUri());
	        } catch (MalformedURLException e) {
	            e.printStackTrace();
	        }
	 
	        if (resource.exists()) {
	            return ResponseEntity.ok()
	                    .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
	                    .body(resource);
	 
	            // return new ResponseEntity<Object>(resource, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<Object>("File Not Found ", HttpStatus.OK);
	        }
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
