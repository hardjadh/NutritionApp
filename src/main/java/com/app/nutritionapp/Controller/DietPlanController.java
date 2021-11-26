package com.app.nutritionapp.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.nutritionapp.Model.DietPlan;
import com.app.nutritionapp.Service.IDietPlanService;

@RestController
//@RequestMapping("/api")
public class DietPlanController {
	@Autowired
private IDietPlanService dietplanservice;

/*public DietPlanController(IDietPlanService dietplanservice) {
	super();
	this.dietplanservice = dietplanservice;
}*/

@PostMapping("/Splans")
public ResponseEntity<String> saveDietPlan(@RequestBody DietPlan dietplan){
	dietplanservice.saveDietPlan(dietplan);
	return new ResponseEntity<String>("Dietplan saved succesfully",HttpStatus.OK);
}


@GetMapping("/Splans")
public ResponseEntity<List<DietPlan>> getAllDietPlans()
{
	List<DietPlan>dietplan1=dietplanservice.getAllDietPlans();
	ResponseEntity<List<DietPlan>> res2=new ResponseEntity<List<DietPlan>>(dietplan1,HttpStatus.OK);
	return res2;
	
	
}
@GetMapping("/plans/{id}")
public ResponseEntity<DietPlan> getDietPlanById(@PathVariable("id") long dietplanId){
	DietPlan dietplan=dietplanservice.getDietPlanById(dietplanId);
	ResponseEntity<DietPlan> res1=new ResponseEntity<DietPlan>(dietplan,HttpStatus.OK);
	return res1;
}

@PutMapping("/plans")
public ResponseEntity<String> updateDietPlan(@RequestBody DietPlan dietplan)
{ 
	dietplanservice.updateDietPlan(dietplan.getId(), dietplan);
	return new ResponseEntity<String>("Dietplan updated successfull",HttpStatus.OK);
}

	
@DeleteMapping("/plans/{id}")
public ResponseEntity<String> deleteDietPlan(@PathVariable("id") long id){
	dietplanservice.deleteDietPlan(id);
	return new ResponseEntity<String>("Dietplan deleted successfully!." , HttpStatus.OK);
	
}
}

