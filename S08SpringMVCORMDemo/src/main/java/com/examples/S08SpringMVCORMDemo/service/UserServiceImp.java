package com.examples.S08SpringMVCORMDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.examples.S08SpringMVCORMDemo.dao.UserDao;
import com.examples.S08SpringMVCORMDemo.entity.User;
import com.examples.S08SpringMVCORMDemo.exception.UserAlreadyExistsException;

@Service
public class UserServiceImp implements UserService {

	@Autowired
	private UserDao userdao;
	@Override
	@Transactional
	public int save(User user) throws UserAlreadyExistsException {
		// TODO Auto-generated method stub
		if(userdao.findUser(user.getEmail())!=null ) {
			throw new UserAlreadyExistsException(user.getEmail());
		}
		return userdao.create(user);
	}
	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return userdao.findUsers();
	}
	

}
