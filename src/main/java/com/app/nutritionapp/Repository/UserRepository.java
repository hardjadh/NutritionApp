package com.app.nutritionapp.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.nutritionapp.Model.User;


public interface UserRepository extends JpaRepository<User, Long> {
	/* List<User> findBy(boolean published); */
	 List<User> findByLoginName(String loginName);

	Object findByPassword(String password);

	 
}
