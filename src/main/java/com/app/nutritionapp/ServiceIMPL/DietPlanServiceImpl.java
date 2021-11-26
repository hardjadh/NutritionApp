package com.app.nutritionapp.ServiceIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.nutritionapp.Exception.ResourceNotFoundException;
import com.app.nutritionapp.Model.DietPlan;
import com.app.nutritionapp.Repository.DietPlanRepository;
import com.app.nutritionapp.Service.IDietPlanService;

@Service
public class DietPlanServiceImpl implements IDietPlanService {
@Autowired
	private DietPlanRepository dietplanRepository;
	
	/*public DietPlanServiceImpl(DietPlanRepository dietplanrepository) {
		super();
		this.dietplanRepository = dietplanrepository;
	}*/

	@Override
	public DietPlan saveDietPlan(DietPlan dietplan) 
	{	
		return dietplanRepository.save(dietplan);
	}

	@Override
	public List<DietPlan> getAllDietPlans() {
		
		return dietplanRepository.findAll();
	}

	@Override
	public DietPlan getDietPlanById(long id) {
		return dietplanRepository.findById(id).orElse(null);
	}

	@Override
	public DietPlan updateDietPlan( long id,DietPlan dietplan) {
		/*DietPlan exitingDietPlan=dietplanRepository.findById(id).orElseThrow();
	
		exitingDietPlan.setCarbsRatio(dietplan.getCarbsRatio());
		exitingDietPlan.setFatRatio(dietplan.getCarbsRatio());
		exitingDietPlan.setFoodType(dietplan.getFoodType());
		exitingDietPlan.setProteinRatio(dietplan.getProteinRatio());
		exitingDietPlan.setUserId(dietplan.getUserId());
		*/
		dietplanRepository.findById(id);
		return dietplanRepository.save(dietplan) ;
	
	}

	@Override
	public DietPlan deleteDietPlan(long id) {
	//	dietplanRepository.findById(id).orElse(null);
		dietplanRepository.deleteById(id);
		return null;
	}
	
	
	
	

}
