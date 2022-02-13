package com.emirk.myblog.service;

import java.util.List;
import java.util.Optional;

import com.emirk.myblog.model.User;

public interface IUserService {
	
	Optional<User> findByUsername(String username);

	Object saveUser(org.springframework.security.core.userdetails.User user);
	
	User saveUser(User user);

	void makeAdmin(String username);
	
	List<User> findAllUser();

}
