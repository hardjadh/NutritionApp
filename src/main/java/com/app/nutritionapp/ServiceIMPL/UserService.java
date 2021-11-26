package com.app.nutritionapp.ServiceIMPL;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.nutritionapp.Exception.UserAlreadyExistsException;
import com.app.nutritionapp.Exception.UserNotExistsException;
import com.app.nutritionapp.Model.User;
import com.app.nutritionapp.Repository.UserRepository;
import com.app.nutritionapp.Service.IUserService;



@Service
public class UserService implements IUserService {
	private static final Logger LOG = LoggerFactory.getLogger(UserService.class);
	@Autowired
	UserRepository userRepository;

	public User userRegister(User user) {
		LOG.info("userregister");
		if (userRepository.findByLoginName(user.getLoginName()) != null
				&& userRepository.findByPassword(user.getPassword()) != null) {
			throw new UserAlreadyExistsException("Admin Already registered");
		} else {
			return userRepository.save(user);
		}
	}

	public User userLogin(User user) {
		LOG.info("userlogin");
		if (userRepository.findByLoginName(user.getLoginName()) != null
				&& userRepository.findByPassword(user.getPassword()) != null)
			return userRepository.save(user);
		throw new UserNotExistsException();
	}

	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public User removeUser(long userId) {
		// TODO Auto-generated method stub
      userRepository.deleteById(userId);
      return null;
	}

	@Override
	public User updateUser(long userId, User user) {
		// TODO Auto-generated method stub
		userRepository.findById(userId);
		return userRepository.save(user);
	}

	@Override
	public User getUser(long userId) {
		// TODO Auto-generated method stub
		return userRepository.findById(userId).orElse(null);
		
	}

	@Override
	public List<User> getallUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

}

