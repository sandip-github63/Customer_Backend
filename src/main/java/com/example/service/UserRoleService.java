package com.example.service;

import java.util.List;

import com.example.model.UserRole;

public interface UserRoleService {

	public List<UserRole> getRole(Long userId);

	public UserRole updateRole(UserRole userRole);

}
