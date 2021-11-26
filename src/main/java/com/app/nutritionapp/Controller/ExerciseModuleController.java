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

import com.app.nutritionapp.Model.ExerciseModule;
import com.app.nutritionapp.Service.IExerciseModuleService;
import com.app.nutritionapp.ServiceIMPL.ExerciseModuleService;

@RestController
@RequestMapping("/qqq")
public class ExerciseModuleController {
	
@Autowired
private IExerciseModuleService exerciseModuleService;


@PostMapping(value= "/module")
public ResponseEntity<String> addExerciseModule(@RequestBody ExerciseModule module)
{
	exerciseModuleService.saveExerciseModule(module);
	return new ResponseEntity<String>("ExerciseModule added successfully",HttpStatus.OK);
}
	

@DeleteMapping(value = "/module/{userId}")
public ResponseEntity<String> removeExerciseModule(@PathVariable("userId")int userId)
{
	    exerciseModuleService.deleteExerciseModule(userId);
	return new ResponseEntity<String>("ExerciseModule removed successfully", HttpStatus.OK);
}

@PutMapping(value = "/module")
public ResponseEntity<String> updateExerciseModule(@RequestBody ExerciseModule module)
{
	exerciseModuleService.updateExerciseModule(module.getUserId(), module);
	return new ResponseEntity<String>("ExerciseModule updated successfully",HttpStatus.OK);
}


@GetMapping(value ="/module/{userId}")
public ResponseEntity<ExerciseModule> getExerciseModule(@PathVariable ("userId") int userId) throws Exception
{
	
	//ExerciseModule module = moduleService.getExerciseModule(userId);
	//if(module==null)
	//{
    //return new ResponseEntity("Sorry no tasks found with this ID", HttpStatus.NOT_FOUND);
	//}
	//return new ResponseEntity<ExerciseModule>(module, HttpStatus.OK);
	
	ExerciseModule rep = exerciseModuleService.findExerciseModule(userId);
	ResponseEntity<ExerciseModule> res1 = new ResponseEntity<ExerciseModule>(rep, HttpStatus.OK);
	return res1;
}

   @GetMapping(value = "/module")
   public ResponseEntity<List<ExerciseModule>> getAllExerciseModule()
   {
	   List<ExerciseModule> allrep = exerciseModuleService.getAllExerciseModule();
       ResponseEntity<List<ExerciseModule>> res2 = new ResponseEntity<List<ExerciseModule>>(allrep, HttpStatus.OK);
       return res2;
       
   }








}

