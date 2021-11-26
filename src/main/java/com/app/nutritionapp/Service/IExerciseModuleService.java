package com.app.nutritionapp.Service;


import java.util.List;

import com.app.nutritionapp.Model.ExerciseModule;


public interface IExerciseModuleService {

	   public List<ExerciseModule> getAllExerciseModule();
		
		public ExerciseModule findExerciseModule(Integer userId);
		
		public ExerciseModule saveExerciseModule(ExerciseModule module);
		
		public ExerciseModule deleteExerciseModule(Integer userId);
		
		public ExerciseModule updateExerciseModule(Integer userId,ExerciseModule module);


	}
