package org.finalled.com.repository;

import javax.persistence.Column;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.micrometer.core.lang.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class userDetailsDTO {
	
	@NonNull
	@Column(name="email")
    public String email;
	@NonNull
	
	@Column(name="username")
    public String userName;
	@NonNull
	@Column(name="user_id")
    public String password;
	

	public userDetailsDTO(@JsonProperty("email") String email,  @JsonProperty("username") String username, @JsonProperty("user_id") String password) {
		super();
		this.email = email;
		this.userName = username;
		this.password = password;
	}

	public userDetailsDTO() {
		super();
	}

}
