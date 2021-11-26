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
import com.app.nutritionapp.Service.ICaloryLogService;

import ch.qos.logback.classic.Logger;

@RestController
@RequestMapping(value = "/caloryLog")
public class CaloryLogController {
	
	

	
	@Autowired
	private ICaloryLogService caloryLogService;
	
	@GetMapping("/getByName/{userName}")
	public ResponseEntity<List<CaloryLog>> findUserByName(@PathVariable String userName) {
	List<CaloryLog> caloryLogs=caloryLogService.findUserByName(userName);   
    ResponseEntity<List<CaloryLog>> responseEntity=new  ResponseEntity<List<CaloryLog>>(caloryLogs,HttpStatus.OK);
		return responseEntity;
	}
    
	@PostMapping("addCaloryLog")
	public ResponseEntity<String> addCaloryLog(@RequestBody CaloryLog caloryLog) {
		caloryLogService.addCaloryLog(caloryLog); 
		return new ResponseEntity<String>("Details added successfully", HttpStatus.OK);
	}

	@PutMapping("updateCaloryLog")
	public ResponseEntity<String> updateCaloryLog(@RequestBody CaloryLog caloryLog) {
		caloryLogService.updateCaloryLog(caloryLog);
		return new ResponseEntity<String>("Details updated successfully", HttpStatus.OK);
	}

	@DeleteMapping("/deleteCaloryLog")
	public ResponseEntity<String> removeCaloryLog(@RequestBody CaloryLog caloryLog) {
          caloryLogService.removeCaloryLog(caloryLog);
          return new ResponseEntity<String>("Data removed successfully", HttpStatus.OK);
	}
	
	@GetMapping("/totalSumCalories/{userName}")
	public ResponseEntity<Double> sumOfCalories(@PathVariable String userName) {
		 double totalCal=caloryLogService.sumOfCalories(userName);
		 return new ResponseEntity<Double>(totalCal,HttpStatus.OK);
	}

}
