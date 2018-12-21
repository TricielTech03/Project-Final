package org.finalled.com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.finalled.com.entity.PostLoad;
import org.finalled.com.repository.PostLoadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostLoadService 
{

	@Autowired
	private PostLoadRepository postLoadRepository;
	
	
	public List<PostLoad> getPostLoads()
	{
		List<PostLoad> postloads= new ArrayList<>();
		
		postLoadRepository.findAll().forEach(postloads::add);
		
		return postloads;
		
	}
	
	public  Optional<PostLoad> getPostLoad(Long id)
	{
		return postLoadRepository.findById(id);
		
	}
	
	
	public void createPostLoad(PostLoad postload)
	{
		postLoadRepository.save(postload);
	}
	
	
	public PostLoad updatePostLoad(PostLoad postload)
	{
		return postLoadRepository.save(postload);
		
	}
	
	public boolean deletePostLoad(Long id)
	{
		if(postLoadRepository.findById(id)!=null)
		{
			postLoadRepository.deleteById(id);
			return true;
		}
		else
		{
			return false;
			
		}
		
	}
}
