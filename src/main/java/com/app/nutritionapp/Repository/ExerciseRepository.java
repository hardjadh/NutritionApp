package com.app.nutritionapp.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.nutritionapp.Model.ExerciseModule;

@Repository
public interface ExerciseRepository extends JpaRepository<ExerciseModule, Integer>  {


	
	
	
}
	
	
