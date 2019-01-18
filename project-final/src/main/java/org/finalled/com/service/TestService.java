package org.finalled.com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.finalled.com.entity.Test;
import org.finalled.com.entity.User;
import org.finalled.com.repository.TestRepository;
import org.finalled.com.repository.userDetailsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class TestService
{

	@Autowired
	 private TestRepository testRepository;
	
	List<Test> findByTruckType(String truckType) 
	{
		return testRepository.findByTruckType(truckType);
	}
	 
	 
	public List<Test> getTests() 
	{
		System.out.println("Test Service");
		List<Test> tests = new ArrayList<>();
		testRepository.findAll().forEach(tests::add);
		return tests;
	}
	
	
	
	public Optional<Test> getTest(Long id) 
	{
		return testRepository.findById(id);
	}
	
	
	
	public void createTest(Test test) 
	{
		testRepository.save(test);
	}
	
	public Test updateTest(Test test) 
	{
		return testRepository.save(test);
	}
	
	public boolean deleteTest(Long id) {
		if(testRepository.findById(id)!=null) 
		     {
			 testRepository.deleteById(id);
			 return true;
			 }
		else {
				return false;
			 }}	
}





