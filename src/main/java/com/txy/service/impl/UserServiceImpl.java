package com.txy.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.txy.controller.fom.BaseForm;
import com.txy.controller.fom.Page;
import com.txy.dao.UserDao;
import com.txy.modal.Role;
import com.txy.modal.User;
import com.txy.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {
	@Autowired
	private UserDao userDao;

	@Override
	public User getUser(int id) {
		// TODO Auto-generated method stub
		return userDao.findById(1).get();
	}

	@Override
	public User getByUsername(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		userDao.save(user);
	}
}
