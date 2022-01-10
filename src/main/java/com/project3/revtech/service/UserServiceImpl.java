package com.project3.revtech.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.project3.revtech.dao.UserRepository;
import com.project3.revtech.entity.User;
import com.project3.revtech.exception.ApplicationException;
import com.project3.revtech.pojo.UserPojo;



@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	  PasswordEncoder encoder;
	
	@Override
	public UserPojo updateUserService(UserPojo userInfo) throws ApplicationException {
		
		 User updateUser = new User(userInfo.getUsername(), encoder.encode(userInfo.getPassword()), userInfo.getEmail(), userInfo.getFirstName(), userInfo.getLastName(),
				                    userInfo.getAddress(), userInfo.getContact());
		User  returnUser = userRepository.save(updateUser);
	
				
		return userInfo;

}
	@Override
	public UserPojo getAUserService(int user_id) throws ApplicationException{
		 UserPojo userPojo = null;
	        Optional<User> optional = userRepository.findById(user_id);
	        if (optional.isPresent()) {
	            User user = optional.get();
	            userPojo = new  UserPojo(userPojo.getUser_id(), userPojo.getUsername(), 
	            		encoder.encode(userPojo.getPassword()), userPojo.getEmail(), 
	            		userPojo.getFirstName(), userPojo.getLastName(), userPojo.getAddress(), 
	            		userPojo.getContact());
	        }
	        return  userPojo;
		}

}
