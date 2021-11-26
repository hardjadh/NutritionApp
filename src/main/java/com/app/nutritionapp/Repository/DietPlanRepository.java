package com.app.nutritionapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.nutritionapp.Model.DietPlan;

public interface DietPlanRepository extends JpaRepository<DietPlan, Long>
{

}
