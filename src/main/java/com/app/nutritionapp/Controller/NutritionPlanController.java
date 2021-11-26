package com.app.nutritionapp.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.nutritionapp.Model.NutritionPlan;
import com.app.nutritionapp.Repository.INutritionPlanRepository;
import com.app.nutritionapp.Service.INutritionPlanService;
import com.app.nutritionapp.ServiceIMPL.NutritionPlanService;
import com.app.nutritionapp.Exception.UserNotExistsException;

@RestController
public class NutritionPlanController {

	@Autowired
	private INutritionPlanService planService;
	
	@PostMapping(value= "/plan")
	public ResponseEntity<String> addNutritionPlan(@RequestBody NutritionPlan plan) 
	{
		planService.addNutritionPlan(plan);
		return new ResponseEntity<String> ("NutritionPlan added successfully",HttpStatus.OK);
	}
		
	@DeleteMapping(value = "/plan/{userId}")
	public ResponseEntity<String> removeNutritionPlan(@PathVariable("userId") long userId) 
	{
		try {
		planService.removeNutritionPlan(userId);}
		
		catch(UserNotExistsException e){
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);}
		
		return new ResponseEntity<String>("NutritionPlan removed successfully",HttpStatus.OK);
	}
	
	@PutMapping(value = "/plan/{userId}")
	public ResponseEntity<String> updateNutritionPlan(@RequestBody NutritionPlan plan) 
	{
		planService.updateNutritionPlan(plan.getUserId(), plan);
		return new ResponseEntity<String>("NutritionPlan updated successfully",HttpStatus.OK);
	}
	
	@GetMapping(value = "/plan/{userId}")
	public ResponseEntity<Object> getNutritionPlan(@PathVariable("userId") long userId) //throws Exception
	{
		NutritionPlan plan;
		try {
			 plan =planService.getNutritionPlan(userId);}
			
		catch(UserNotExistsException e){
				return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);}
	
	        return new ResponseEntity<>(plan, HttpStatus.OK);
	}
	
	@GetMapping(value = "/plans")
	public ResponseEntity<List<NutritionPlan>> getAllNutritionPlans()
	{
		List<NutritionPlan> allp = planService.getallNutritionPlans();
		ResponseEntity<List<NutritionPlan>> res2 = new ResponseEntity<List<NutritionPlan>>(allp, HttpStatus.OK);
		return res2;
	}
	
	/*@GetMapping(value = "/getplan/{name}")
	public ResponseEntity<NutritionPlan> getNutritionPlanbyName(@PathVariable("name") String name) 
	{
		NutritionPlan p = planService.getNutritionPlanbyName(name);
		ResponseEntity<NutritionPlan> res1 = new ResponseEntity<NutritionPlan>(p, HttpStatus.OK);
	    return res1 ;
	}*/
	
	//public ResponseEntity<NutritionPlan> addNutritionPlan(@RequestBody NutritionPlan plan)
	//{
		//List<NutritionPlan> plans = nutritionPlanService.saveNutritionPlans(plan);
		//if(plans.isEmpty())
		//{
		//	return new ResponseEntity("Sorry no products available", HttpStatus.NOT_FOUND);
		//}
		//return planService.addNutritionPlan(plan);
	//}
	
	/*@GetMapping("/getplan")
	public ResponseEntity<NutritionPlan> getNutritionPlan(@PathVariable("userId") long userId)
	{
		Optional<NutritionPlan> plandata = planService.getNutritionPlan(userId);
		if(plandata.isEmpty())
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(plandata.get(), HttpStatus.OK);
	}*/
	
	/*@GetMapping("/plans/{userId}")
	public ResponseEntity<NutritionPlan> findNutritionPlan(@PathVariable("userId") long userId)
	{
		NutritionPlan plan = nutritionPlanService.findNutritionPlan(userId);
		if(plan==null)
		{
			return new ResponseEntity("Sorry no product found with this ID", HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<NutritionPlan>(plan, HttpStatus.OK);
	}*/
	
	/*@DeleteMapping("/delplans/{userId}")
	public ResponseEntity<NutritionPlan> removeNutritionPlan(@PathVariable("userId") long userId)
	{
		try {
			planService.removeNutritionPlan(userId);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		catch(Exception e){
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}*/
		//List<NutritionPlan> plans = nutritionPlanService.deleteNutritionPlans(userId);
		//if(plans.isEmpty())
		//{
		//	return new ResponseEntity("Sorry no products available", HttpStatus.NOT_FOUND);
		//}
		//return new ResponseEntity<List<NutritionPlan>>(plans, HttpStatus.OK);
		/////planService.deleteNutritionPlan(userId);
	
	
	/*@PutMapping("/plans")
	public ResponseEntity<NutritionPlan> updateNutritionPlan(@PathVariable long userId, @RequestBody NutritionPlan plan)
	{
		//List<NutritionPlan> plans = nutritionPlanService.updateNutritionPlans(plan);
		//if(plans.isEmpty())
		//{
		//	return new ResponseEntity("Sorry no products available", HttpStatus.NOT_FOUND);
		//}
		plan.setUserId(userId);
		System.out.println("Updating the Nutritionplan data for Id : " +userId);
		return planService.updateNutritionPlan(plan);
	}*/
	
	/*@GetMapping("/plans")
	public List<NutritionPlan> getNutritionPlans()
	{
		return planService.getallNutritionPlans();
	}*/
	
	
	
	
	
	
	
	
}
