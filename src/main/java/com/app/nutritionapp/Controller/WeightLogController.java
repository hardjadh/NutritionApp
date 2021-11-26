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

import com.app.nutritionapp.Model.CaloryLog;
import com.app.nutritionapp.Model.WeightLog;
import com.app.nutritionapp.Repository.IWeightLogRepository;
import com.app.nutritionapp.Service.IWeightLogService;

@RestController
@RequestMapping(value = "/weightLog")
public class WeightLogController {

	
	@Autowired
	private IWeightLogService  weightLogService;
	    
	@PostMapping("/addWeightLog")
    public ResponseEntity<String> addWeightLog(@RequestBody WeightLog weightLog) {
	    weightLogService.addWeightLog(weightLog); 
	    return new ResponseEntity<String>("Details added successfully",HttpStatus.OK);
	}
    
    @PutMapping("/updateWeightLog")
	public ResponseEntity<String> updateWeightLog(@RequestBody WeightLog weightLog) {
    	weightLogService.updateWeightLog(weightLog); 
	    return new ResponseEntity<String>("Details updated successfully",HttpStatus.OK);
	}

    @DeleteMapping("/deleteWeightLog")
	public ResponseEntity<String> removeWeightLog(@RequestBody WeightLog weightLog) {
    	weightLogService.removeWeightLog(weightLog); 
	    return new ResponseEntity<String>("Details deleted successfully",HttpStatus.OK);
	}

	@GetMapping("/getAllWeightLog")
	public ResponseEntity<List<WeightLog>> showAllWeightLog() {
		List<WeightLog> weightLogs=weightLogService.showAllWeightLog();
		ResponseEntity<List<WeightLog>> responseEntity=new ResponseEntity<List<WeightLog>>(weightLogs,HttpStatus.OK);
		return  responseEntity;
	}
	
	@GetMapping("/getWeightLogByName/{userName}")
	public ResponseEntity<List<WeightLog>> findUserByName(@PathVariable String userName) {
		List<WeightLog> weightLogs=weightLogService.findUserByName(userName);
		ResponseEntity<List<WeightLog>> responseEntity=new ResponseEntity<List<WeightLog>>(weightLogs,HttpStatus.OK);
		return  responseEntity;
	}
}
