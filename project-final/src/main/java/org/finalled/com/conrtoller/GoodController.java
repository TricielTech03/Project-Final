
package org.finalled.com.conrtoller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.validation.Valid;

import org.finalled.com.entity.GoodsVehicle;
import org.finalled.com.entity.Truck;
import org.finalled.com.entity.User;
import org.finalled.com.repository.GoodsRepository;
import org.finalled.com.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class GoodController {

	@Autowired
	private GoodService goodService;

	@Autowired
	private GoodsRepository goodsRepository;

	// Rest api method to get all goods details

	@RequestMapping("/goods_vehicle_list.php")
	public Map<String, List<GoodsVehicle>> getGoods() throws JsonProcessingException {
		Map<String, List<GoodsVehicle>> usersMap = new HashMap<String, List<GoodsVehicle>>();

		List<GoodsVehicle> goods = goodService.getGoods();

		usersMap.put("result", goods);

		ObjectMapper mapper = new ObjectMapper();
		System.out.println(mapper.writeValueAsString(usersMap));

		return usersMap;

	}

	/*
	 * @RequestMapping("/goods_vehicle_list.php") public Map<String, Object>
	 * getGoods() { List<GoodsVehicle> bookings = goodService.getGoods();
	 * Map<String, Object> dataMap = new HashMap<String, Object>();
	 * dataMap.put("result", "Booking found successfully");
	 * dataMap.put("totalBooking", bookings.size()); dataMap.put("status", "1");
	 * dataMap.put("bookings", bookings); return dataMap; }
	 */

	// Rest api method to get particular truck based on id
	@RequestMapping("/getGood/{id}")
	public Optional<GoodsVehicle> getGood(@PathVariable Long id) {
		return goodsRepository.findById(id);
	}

	/*
	 * @RequestMapping(value = "/goods_vehicle.php", method = RequestMethod.POST)
	 * 
	 * public Map<String, Object> createGood(@RequestBody GoodsVehicle good) {
	 * good.setStatus("1"); good = goodService.createGood(good); Map<String, Object>
	 * dataMap = new HashMap<String, Object>(); dataMap.put("message",
	 * "Booking created successfully"); dataMap.put("status", "1");
	 * dataMap.put("booking", good); return dataMap; }
	 */

	// Rest api method to create a new good

	@RequestMapping(value = "/goods_vehicle.php", method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE, produces = {
			MediaType.APPLICATION_ATOM_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })

	@ResponseBody
	public String createGood(GoodsVehicle good) {

		good.setStatus("1");

		goodService.createGood(good);

		return "Good created successfully";

	}

	/*
	 * @RequestMapping(value = "goods_vehicle.php", method = RequestMethod.POST)
	 * 
	 * @ResponseBody
	 * 
	 * public String createGood(@Valid GoodsVehicle good, BindingResult
	 * bindingResult) { String data; GoodsVehicle vehicleExists =
	 * goodService.findGoodByPostId(good.getVehicleId()); if (vehicleExists != null)
	 * { bindingResult.rejectValue("postId", "error.good",
	 * "This vehicle already exists!"); data = "This vehicle already exists!"; }
	 * else { good.setStatus("1"); goodService.createGood(good); data =
	 * "Good has been registered successfully!"; }
	 * 
	 * return data;
	 * 
	 * }
	 */

	// Rest api method to get an update of existing good
	@RequestMapping(value = "/updateGood/{id}", method = RequestMethod.PUT)
	public Map<String, Object> updateGood(@PathVariable Long id, @RequestBody GoodsVehicle good) {
		good.setStatus("3");

		goodService.updateGood(good);

		Map<String, Object> dataMap = new HashMap<String, Object>();
		dataMap.put("message", "Good updated successfully");
		dataMap.put("status", "3");
		dataMap.put("booking", good);
		return dataMap;
	}

	// Rest api method to delete a good based on id
	@RequestMapping("/deletegoods_vehicle.php/{id}")
	public void deleteGood(@PathVariable Long id) {
		goodService.deleteGood(id);
	}
}
