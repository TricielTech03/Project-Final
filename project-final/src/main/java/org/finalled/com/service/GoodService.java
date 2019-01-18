
package org.finalled.com.service;

import java.util.ArrayList;
import java.util.List;

import org.finalled.com.entity.GoodsVehicle;
import org.finalled.com.entity.Truck;
import org.finalled.com.entity.User;
import org.finalled.com.repository.GoodsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodService 
{
	
	@Autowired
	private GoodsRepository goodsRepository;

	
	public List<GoodsVehicle> getGoods() 
	{
		
		List<GoodsVehicle> goods=new ArrayList<>();
		    goodsRepository.findAll().forEach(goods::add);
		return goods;
	}


public GoodsVehicle createGood(GoodsVehicle good)
{
	 return goodsRepository.save(good);
}


public GoodsVehicle updateGood(GoodsVehicle good)
{
	return goodsRepository.save(good);


}


public boolean deleteGood(Long id) {
	if(goodsRepository.findById(id)!=null) {
		 goodsRepository.deleteById(id);
		 return true;
		}else {
			return false;
		}
}


public GoodsVehicle findGoodByPostId(String postId) {
	// TODO Auto-generated method stub
	return goodsRepository.findGoodByPostId(postId);
}












}
