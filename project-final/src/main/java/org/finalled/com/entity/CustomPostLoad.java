package org.finalled.com.entity;

import javax.persistence.Column;
import javax.transaction.Transactional;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.micrometer.core.lang.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Transactional
public class CustomPostLoad extends PostLoad {

	@NonNull
	@Column(name = "user_id")
	private String userId;
	@NonNull
	@Column(name = "capacity")
	private String capacity;

	public CustomPostLoad() {
		super();
	}

	public CustomPostLoad(@JsonProperty("userId") String userId, @JsonProperty("capacity") String capacity) {
		super();
		this.userId = userId;
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "CustomPostLoad [userId=" + userId + ", capacity=" + capacity + "]";
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}
