package com.app.nutritionapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.nutritionapp.Model.NutritionPlan;

@Repository
public interface INutritionPlanRepository extends JpaRepository<NutritionPlan, Long> 
{

}
