package com.app.nutritionapp.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.nutritionapp.Model.User;
import com.app.nutritionapp.ServiceIMPL.UserService;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	UserService uservice;
	
	@PostMapping("/users")
	public ResponseEntity<String> createUser(@RequestBody User user) {
		uservice.createUser(user);
		return new ResponseEntity<String> ("user added sucessfully",HttpStatus.OK);
	}

	@GetMapping("/users")
	public ResponseEntity<List<User>> getAllUsers() {
		List<User> user =uservice.getallUsers();
		ResponseEntity<List<User>> res = new ResponseEntity<List<User>>(user, HttpStatus.OK);
		return res ;
	}

	@GetMapping("/users/{id}")
	public ResponseEntity<User> getUserById(@PathVariable("id") long id) {
		User userData = uservice.getUser(id);

		if (userData !=null) {
			return new ResponseEntity<User>(userData, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/users/{id}")
	public ResponseEntity<HttpStatus> deleteUser(@PathVariable("id") long id) {
		try {
			uservice.removeUser(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@PutMapping("/users/{id}")
	public ResponseEntity<String> updateUser(long l, @RequestBody User user)
	{
	 uservice.updateUser(user.getUserId(),user); 
	
	return new ResponseEntity<String>("User updated successfully",HttpStatus.OK);
	}
}
	
	

