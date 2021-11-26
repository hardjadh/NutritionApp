package com.app.nutritionapp.Service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.app.nutritionapp.Model.WeightLog;

@Component
public interface IWeightLogService {
	public WeightLog addWeightLog(WeightLog weightLog);
	public WeightLog updateWeightLog(WeightLog weightLog);
	public void removeWeightLog(WeightLog weightLog);
	public List<WeightLog> showAllWeightLog();
	
	public List<WeightLog> findUserByName(String userName);
}
