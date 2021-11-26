package com.app.nutritionapp.Service;



import java.util.List;

import com.app.nutritionapp.Model.DietPlan;

public interface IDietPlanService {
	
public DietPlan saveDietPlan(DietPlan dietplan);

public List<DietPlan> getAllDietPlans();

public DietPlan getDietPlanById(long id);
	
public DietPlan updateDietPlan( long id,DietPlan dietplan);

public DietPlan deleteDietPlan(long id);
}
