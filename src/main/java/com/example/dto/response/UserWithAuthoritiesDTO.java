package com.example.dto.response;

import java.util.List;

import com.example.model.User;

public class UserWithAuthoritiesDTO {

	private User user;

	private List<String> authorities;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<String> getAuthorities() {
		return authorities;
	}

	public void setAuthorities(List<String> authorities) {
		this.authorities = authorities;
	}

}
