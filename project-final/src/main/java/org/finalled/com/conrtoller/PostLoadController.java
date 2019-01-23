package org.finalled.com.conrtoller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
//JSON view

import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.monitorjbl.json.JsonView;
import com.monitorjbl.json.JsonViewModule;
import static com.monitorjbl.json.Match.match;

import org.finalled.com.entity.PostLoad;
import org.finalled.com.payload.UploadFileResponse;
import org.finalled.com.property.FileStorageProperties;
import org.finalled.com.service.FileStorageService;
import org.finalled.com.service.PostLoadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.fasterxml.jackson.core.JsonProcessingException;

@RestController
public class PostLoadController {

	private static final Logger logger = LoggerFactory.getLogger(PostLoadController.class);
	@Autowired
	private FileStorageService fileStorageService;
	@Autowired
	private PostLoadService postLoadService;
	ObjectMapper mapper = new ObjectMapper().registerModule(new JsonViewModule());

	@RequestMapping(value = { "/post_load_list.php/user/{id}" }, method = RequestMethod.POST)
	public Map<String, Optional<PostLoad>> getPostLoad(@PathVariable Long id) throws JsonProcessingException

	{
		Map<String, Optional<PostLoad>> usersMap = new HashMap<String, Optional<PostLoad>>();
		Optional<PostLoad> post = postLoadService.getPostLoad(id);
		usersMap.put("result", post);
		ObjectMapper mapper = new ObjectMapper();
		System.out.println(mapper.writeValueAsString(usersMap));

		return usersMap;

	}

	// post list based on user id

	@RequestMapping(value = { "/post_load_list.php/{userId}" }, method = RequestMethod.POST)
	public Map<String, List<PostLoad>> getPostLoadByUserId(@RequestParam String userId) {
		/*
		 * PostLoad postLoad = new PostLoad();
		 * 
		 * SimpleBeanPropertyFilter filter =
		 * SimpleBeanPropertyFilter.filterOutAllExcept("id");
		 * 
		 * FilterProvider filters = new SimpleFilterProvider().addFilter("id", filter);
		 * 
		 * MappingJacksonValue mapping = new MappingJacksonValue(postLoad);
		 * 
		 * mapping.setFilters(filters);
		 * 
		 * return mapping; }
		 */
		// JSON VIEW METHOD TO LIMIT ATTIBUTES
		/*
		 * @ResponseBody //public Map<String, List<PostLoad>>
		 * getPostLoadByUserId(@PathVariable String userId) throws
		 * JsonProcessingException public String getPostLoadByUserId(@PathVariable
		 * String userId) throws JsonProcessingException{
		 * 
		 * 
		 * //get a list of the objects List<PostLoad> getPostLoads =
		 * postLoadService.getPostLoadByUserId(userId);
		 * 
		 * //exclude expensive field String json =
		 * mapper.writeValueAsString(JsonView.with(getPostLoads).onClass(PostLoad.class,
		 * match().exclude("capacity","userId","id","truckType","goodsType","goodsPhoto"
		 * ,"fromAddress","toAddress")));
		 * 
		 * return json;
		 * 
		 * }
		 */

		Map<String, List<PostLoad>> usersMap = new HashMap<String, List<PostLoad>>();
		List<PostLoad> post = postLoadService.getPostLoadByUserId(userId);

		// System.out.println(post+"==========================");
		usersMap.put("result", post);
		ObjectMapper mapper = new ObjectMapper();
		// System.out.println(mapper.writeValueAsString(usersMap));

		return usersMap;
		// return postLoadService.getPostLoadByUserId(userId);
	}

	@RequestMapping("/post_load_list.php")
	public Map<String, List<PostLoad>> getPostLoads() throws JsonProcessingException {
		Map<String, List<PostLoad>> usersMap = new HashMap<String, List<PostLoad>>();
		List<PostLoad> post = postLoadService.getPostLoads();
		usersMap.put("result", post);
		ObjectMapper mapper = new ObjectMapper();
		System.out.println(mapper.writeValueAsString(usersMap));

		return usersMap;

	}
	@GetMapping("/fileDownLoad/{fileName:.+}")
	public ResponseEntity<Resource> downloadFile(@PathVariable String fileName,HttpServletRequest request){
		
		Resource resource = fileStorageService.loadFileAsResource(fileName);
		
		String contentType = null;
		try {
			contentType = request.getServletContext().getMimeType(resource.getFile().getAbsolutePath());
		}catch(IOException ex) {
			logger.info("Could not determine file typeeeeeee");
		}
		if(contentType ==  null) {
			contentType = "application/octet-stream";
		}
		
		return ResponseEntity.ok().contentType(MediaType.parseMediaType(contentType))
				.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
                .body(resource);

	}
	// Rest api method to create a new PostLoad
	@RequestMapping(value = "/post_loads.php", method = RequestMethod.POST)
	public String createPostLoad(@RequestParam("file") MultipartFile file, PostLoad postload) {
		String fileName = fileStorageService.storeFile(file);
		String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath().path("/fileDownLoad/")
				.path(fileName).toUriString();

		UploadFileResponse uploadFileResponse = new UploadFileResponse(fileName, fileDownloadUri, file.getContentType(),
				file.getSize());
		postload.setGoodsPhoto(uploadFileResponse.getFileDownloadUri());
		postLoadService.createPostLoad(postload);

		postLoadService.createPostLoad(postload);
		return "Successfully Created";
	}

	// Rest api method to get an update of existing PostLoad
	@RequestMapping(value = "/post_loads_update.php", method = RequestMethod.POST)
	public void updatePostLoad(@RequestBody PostLoad postload) {
		postLoadService.updatePostLoad(postload);
	}

	@RequestMapping("/deletepost_loads.php/{id}")
	public void deletePostLoad(@PathVariable Long id) {
		postLoadService.deletePostLoad(id);
	}

}
