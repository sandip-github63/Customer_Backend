package com.example.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Role;
import com.example.model.User;
import com.example.model.UserRole;
import com.example.repository.RoleRepository;
import com.example.repository.UserRoleRepository;
import com.example.service.UserRoleService;

@Service
public class UserRoleServiceImpl implements UserRoleService {

	@Autowired
	private UserRoleRepository userRolerepository;

	@Autowired
	private RoleRepository roleRepository;

	@Override
	public List<UserRole> getRole(Long userId) {

		User u = new User();
		u.setUserId(userId);

		return this.userRolerepository.findByUser(u);
	}

	@Override
	public UserRole updateRole(UserRole userRole) {

		Role role = this.roleRepository.findByRoleName(userRole.getRole().getRoleName());

		userRole.setRole(role);

		return this.userRolerepository.save(userRole);
	}

}
