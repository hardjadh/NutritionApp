package com.app.nutritionapp.ServiceIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.nutritionapp.Model.WeightLog;
import com.app.nutritionapp.Repository.IWeightLogRepository;
import com.app.nutritionapp.Service.IWeightLogService;

@Service("weightLogService")
public class WeightLogServiceImpl implements IWeightLogService {
	
	@Autowired
	private IWeightLogRepository iWeightLogRepository;

	@Override
	public WeightLog addWeightLog(WeightLog weightLog) {
	   return iWeightLogRepository.save(weightLog);
	}

	@Override
	public WeightLog updateWeightLog(WeightLog weightLog) {
		return iWeightLogRepository.save(weightLog);
	}

	@Override
	public void removeWeightLog(WeightLog weightLog) {
		  iWeightLogRepository.delete(weightLog);
	}

	@Override
	public List<WeightLog> showAllWeightLog() {
		return iWeightLogRepository.findAll();
	}

	@Override
	public List<WeightLog> findUserByName(String userName) {
		return iWeightLogRepository.findByName(userName);
	}

}
