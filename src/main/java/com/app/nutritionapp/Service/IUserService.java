package com.app.nutritionapp.Service;

import java.util.List;

import com.app.nutritionapp.Model.User;

public interface IUserService {

	public User createUser(User user);
	public User removeUser(long userId);
	public User updateUser(long userId, User user);
	public User  getUser(long userId);
	public List<User> getallUsers();



}
