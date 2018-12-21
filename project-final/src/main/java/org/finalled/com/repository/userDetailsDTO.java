package org.finalled.com.repository;

import io.micrometer.core.lang.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class userDetailsDTO {
	
	@NonNull
    public String email;
	@NonNull
    public String userName;
	@NonNull
    public String password;
	

	public userDetailsDTO(String email, String username, String password) {
		super();
		this.email = email;
		this.userName = username;
		this.password = password;
	}

	public userDetailsDTO() {
		super();
	}

}
