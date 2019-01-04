package org.finalled.com.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.finalled.com.entity.CustomPostLoad;
import org.finalled.com.entity.PostLoad;
import org.finalled.com.repository.PostLoadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostLoadService {

	@Autowired
	private PostLoadRepository postLoadRepository;

	public List<PostLoad> getPostLoads() {
		List<PostLoad> postloads = new ArrayList<>();

		postLoadRepository.findAll().forEach(postloads::add);

		return postloads;

	}

	public Optional<PostLoad> getPostLoad(Long id) {
		return postLoadRepository.findById(id);

	}
	// to get post load based on user id

	public List<PostLoad> getPostLoadByUserId(String userId) {
		/*	CustomPostLoad postLoad = new CustomPostLoad();
		List<PostLoad> listPL = postLoadRepository.findByUserId(userId);
		List<CustomPostLoad> listPL1 = new ArrayList<>();

		Arrays.asList(a)
		for (PostLoad pl : listPL) {
			postLoad.setCapacity(pl.getCapacity());
			postLoad.setUserId(pl.getUserId());
			listPL1.add(postLoad);
		}
		return listPL1;*/
		return postLoadRepository.findByUserId(userId);
		// return List<PostLoad> postLoad.getCapacity() + postLoad.getFromAddress();
	}

	public void createPostLoad(PostLoad postload) {
		postLoadRepository.save(postload);
	}

	public PostLoad updatePostLoad(PostLoad postload) {
		return postLoadRepository.save(postload);

	}

	public boolean deletePostLoad(Long id) {
		if (postLoadRepository.findById(id) != null) {
			postLoadRepository.deleteById(id);
			return true;
		} else {
			return false;

		}

	}
}
