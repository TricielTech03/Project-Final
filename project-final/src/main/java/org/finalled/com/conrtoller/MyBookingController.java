package org.finalled.com.conrtoller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.finalled.com.entity.GoodsVehicle;
import org.finalled.com.entity.MyBooking;
import org.finalled.com.entity.Test;
import org.finalled.com.entity.Truck;
import org.finalled.com.repository.MyBookingRepository;
import org.finalled.com.service.MyBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class MyBookingController {

	@Autowired
	private MyBookingService myBookingService;

	@Autowired
	private MyBookingRepository myBookingRepository;

	
	

	
	@RequestMapping(value = "/mybooking.php", method = RequestMethod.GET,produces="application/json")
	public Map<String, List<MyBooking>> getTrucks() throws JsonProcessingException {
		Map<String, List<MyBooking>> usersMap = new HashMap<String, List<MyBooking>>();
		List<MyBooking> mybook = myBookingService.getBookings();
		usersMap.put("result", mybook);
		ObjectMapper mapper = new ObjectMapper();
		System.out.println(mapper.writeValueAsString(usersMap));

		return usersMap;

	}
	 
   
   
 
	/*
	 * @RequestMapping(value= {"/my_booking.php"}, method=RequestMethod.GET)
	 * 
	 * public Map<String, List<MyBooking>> findByUserId(
	 * 
	 * @PathVariable Long id, @Param(value = "user_id") String user_id) throws
	 * JsonProcessingException { Map<String, List<MyBooking>> usersMap = new
	 * HashMap<String, List<MyBooking>>(); List<MyBooking> Users
	 * =myBookingRepository.findByUserId(user_id); usersMap.put("result", Users);
	 * ObjectMapper mapper = new ObjectMapper();
	 * System.out.println(mapper.writeValueAsString(usersMap));
	 * 
	 * return usersMap;
	 * 
	 * }
	 */
	 

	@RequestMapping(value = "/my_booking.php", method = RequestMethod.POST, produces = "application/json")
	public Map<String, List<MyBooking>> getBookings(@Param(value = "user_id") String user_id)
			throws JsonProcessingException {
		Map<String, List<MyBooking>> usersmap = new HashMap<String, List<MyBooking>>();

		/* List<MyBooking> mybook =myBookingRepository.findByUserId(user_id); */
		List<MyBooking> mybook = myBookingService.getBookings();
		usersmap.put("result", mybook);
		ObjectMapper obj = new ObjectMapper();
		System.out.println(obj.writeValueAsString(usersmap));

		return usersmap;
	}

	/*
	 * @RequestMapping(value="/my_booking.php", method=RequestMethod.POST,
	 * produces="application/json") public void createBooking(@RequestBody MyBooking
	 * mybooking) { myBookingService.createBooking(mybooking); }
	 */
	@RequestMapping(value = "/updatemy_booking", method = RequestMethod.POST, produces = "application/json")
	public void updateBooking(@RequestBody MyBooking mybooking) {
		myBookingService.updateBooking(mybooking);
	}

	@RequestMapping(value = "/deletemy_booking", method = RequestMethod.DELETE, produces = "application/json")
	public void deleteBooking(@PathVariable Long id) {
		myBookingService.deleteBooking(id);
	}

}
