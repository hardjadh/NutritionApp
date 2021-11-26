package com.app.nutritionapp.Service;

import java.util.List;

import com.app.nutritionapp.Model.NutritionPlan;

public interface INutritionPlanService {

	 public NutritionPlan addNutritionPlan(NutritionPlan plan);
	
	 public NutritionPlan removeNutritionPlan(long userId);
	
	 public NutritionPlan updateNutritionPlan(long userId, NutritionPlan plan);
	 
	 public NutritionPlan getNutritionPlan(long userId);
	 
	 public List<NutritionPlan> getallNutritionPlans();
	 
}