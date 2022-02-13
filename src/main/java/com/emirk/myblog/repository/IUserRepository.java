package com.emirk.myblog.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emirk.myblog.model.User;

public interface IUserRepository extends JpaRepository<User, Long> {
	
	Optional<User> findByUsername(String username);

}
