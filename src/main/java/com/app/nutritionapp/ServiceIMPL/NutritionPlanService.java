package com.app.nutritionapp.ServiceIMPL;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.nutritionapp.Model.NutritionPlan;
import com.app.nutritionapp.Repository.INutritionPlanRepository;
import com.app.nutritionapp.Service.INutritionPlanService;
import com.app.nutritionapp.Exception.UserNotExistsException;

@Service("planService")
public class NutritionPlanService implements INutritionPlanService {

	@Autowired
    private INutritionPlanRepository irepo;
	
	//@Autowired
    //private SessionFactory fact;


	@Override
	public NutritionPlan addNutritionPlan(NutritionPlan plan) {
		return irepo.save(plan);
	}

	@Override
	public NutritionPlan removeNutritionPlan(long userId) {
		NutritionPlan planget = irepo.findById(userId).orElse(null);
		if(planget==null) {
			throw new UserNotExistsException("Invalid UserId");
		}
		irepo.deleteById(userId);
		return null;
	}

	@Override
	public NutritionPlan updateNutritionPlan(long userId, NutritionPlan plan) {
		irepo.findById(userId);
		return irepo.save(plan);
	}
	
	@Override
	public NutritionPlan getNutritionPlan(long userId) {
		NutritionPlan planget = irepo.findById(userId).orElse(null);
		if(planget==null) {
			throw new UserNotExistsException("Invalid UserId");
		}
		return planget;
	}
	
	@Override
	public List<NutritionPlan> getallNutritionPlans() {
		return irepo.findAll();
	}

	//@Override
	//public NutritionPlan getNutritionPlanbyName(String name) 
	//{
		/*Query query= fact.getCurrentSession().createQuery("from NutritionPlan where name=:name");
		query.setParameter("name", name);
		NutritionPlan category = (NutritionPlan) query.uniqueResult();
		//NutritionPlan planget = irepo.findAll(name).orElse(null);
		return category;*/
		//return irepo.findById(name);
		
	//}
	
	
	
	
	/*@Override
	public List<NutritionPlan> getAllNutritionPlans() {
		return planDAO.getAllNutritionPlans();
	}

	@Override
	public NutritionPlan findNutritionPlan(Integer userId) {
		return planDAO.findNutritionPlan(userId);
	}

	@Override
	public List<NutritionPlan> saveNutritionPlans(NutritionPlan userId) {
		return planDAO.saveNutritionPlans(userId);
	}

	@Override
	public List<NutritionPlan> deleteNutritionPlans(Integer userId) {
		return planDAO.deleteNutritionPlans(userId);    
	}

	@Override
	public List<NutritionPlan> updateNutritionPlans(NutritionPlan userId) {
		return planDAO.updateNutritionPlans(userId);
	}*/
}
