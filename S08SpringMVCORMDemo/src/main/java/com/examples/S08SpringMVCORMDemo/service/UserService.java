package com.examples.S08SpringMVCORMDemo.service;

import java.util.List;

import com.examples.S08SpringMVCORMDemo.entity.User;
import com.examples.S08SpringMVCORMDemo.exception.UserAlreadyExistsException;

public interface UserService {
	int save(User user) throws UserAlreadyExistsException;
	List<User> getUsers();

}
