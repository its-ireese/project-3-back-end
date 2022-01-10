package com.project3.revtech.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import com.project3.revtech.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	Optional<User> findByUsername(String username);
	
	Optional<User> findById(int userId);

	  Boolean existsByUsername(String username);

	  Boolean existsByEmail(String email);
}
