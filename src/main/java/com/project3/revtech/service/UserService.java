package com.project3.revtech.service;

import com.project3.revtech.exception.ApplicationException;
import com.project3.revtech.pojo.UserPojo;

public interface UserService {
	
	UserPojo updateUserService(UserPojo userInfo) throws ApplicationException;
	UserPojo getAUserService(int userId) throws ApplicationException;
}
