package org.finalled.com.conrtoller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.finalled.com.entity.MyBooking;
import org.finalled.com.service.MyBookingService;
import org.springframework.beans.factory.annotation.Autowired;
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

	@RequestMapping(value="/my_booking.php", method=RequestMethod.POST, produces="application/json")
	public Map<String, List<MyBooking>> getBookings() throws JsonProcessingException {
		Map<String, List<MyBooking>> usersmap = new HashMap<String, List<MyBooking>>();

		List<MyBooking> mybook = myBookingService.getBookings();
		usersmap.put("result", mybook);
		ObjectMapper obj = new ObjectMapper();
		System.out.println(obj.writeValueAsString(usersmap));

		return usersmap;
	}

	
	/*@RequestMapping(value="/my_booking.php", method=RequestMethod.POST, produces="application/json")
	public void createBooking(@RequestBody MyBooking mybooking) 
	{
		myBookingService.createBooking(mybooking);
	}
*/
	@RequestMapping(value="/updatemy_booking", method=RequestMethod.POST, produces="application/json")
	public void updateBooking(@RequestBody MyBooking mybooking) 
	{
		myBookingService.updateBooking(mybooking);
	}
    
	@RequestMapping(value="/deletemy_booking", method=RequestMethod.DELETE, produces="application/json")
	public void deleteBooking(@PathVariable Long id) {
		myBookingService.deleteBooking(id);
	}

}
