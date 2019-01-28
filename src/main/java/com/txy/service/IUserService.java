package com.txy.service;

import java.util.List;

import com.txy.modal.Role;
import com.txy.modal.User;

public interface IUserService {
	User getUser(int id);

	User getByUsername(String name);

	void save(User user);

}