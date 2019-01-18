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
    public String username;
	@NonNull
	@Column(name="password")
    public String password;
	
	@Column(name="user_id")
    public Long id;

	@NonNull
	@Column(name="usertype")
    public String usertype;
	
	public userDetailsDTO(@JsonProperty("email") String email,  @JsonProperty("username") String username, @JsonProperty("password") String password,@JsonProperty("user_id") Long id, @JsonProperty("usertype") String usertype) {
		super();
		this.email = email;
		this.username = username;
		this.password = password;
		this.id = id;
		this.usertype = usertype;
	}

	public userDetailsDTO() {
		super();
	}

}
