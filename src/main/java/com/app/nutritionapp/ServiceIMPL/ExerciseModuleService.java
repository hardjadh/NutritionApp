package com.app.nutritionapp.ServiceIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.nutritionapp.Model.ExerciseModule;
import com.app.nutritionapp.Repository.ExerciseRepository;
import com.app.nutritionapp.Service.IExerciseModuleService;

@Service("moduleService")
public class ExerciseModuleService implements IExerciseModuleService {
    @Autowired
	private ExerciseRepository rep;
    /*@Override
	public List<ExerciseModule> getAllExerciseModules() {
       return rep.findExerciseModule();
	}

	/*@Override
	public ExerciseModule findExerciseModule(Integer userId) {
		return rep.findExerciseModule(userId);
	}

	//@Override
	public List<ExerciseModule> saveExerciseModule(List<ExerciseModule> module) {
		return m.saveExerciseModule(module);
	}

	//@Override
	public List<ExerciseModule> deleteExerciseModule(Integer userId) {
		return moduleDAO.deleteExerciseModule(userId);
	}

	@Override
	public List<ExerciseModule> updateExerciseModule(ExerciseModule userId) {
		return moduleDAO.updateExerciseModules(userId);
	}

	@Override
	public List<ExerciseModule> getAllExerciseModule() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ExerciseModule> saveExerciseModule(ExerciseModule userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ExerciseModule> updateExerciseModule(List<ExerciseModule> module) {
		// TODO Auto-generated method stub
		return null;
	}
}*/

	@Override
	public List<ExerciseModule> getAllExerciseModule() {
		// TODO Auto-generated method stub
		return rep.findAll();
	}

	@Override
	public ExerciseModule findExerciseModule(Integer userId) {
		// TODO Auto-generated method stub
		return rep.findById(userId).orElse(null);


	}

	@Override
	public ExerciseModule saveExerciseModule(ExerciseModule module) {
		// TODO Auto-generated method stub
		return rep.save(module);
	}

	@Override
	public ExerciseModule deleteExerciseModule(Integer userId) {
		// TODO Auto-generated method stub
		 rep.deleteById(userId);
		 return null;
	}

	@Override
	public ExerciseModule updateExerciseModule(Integer userId,ExerciseModule module) {
		// TODO Auto-generated method stub
		 rep.findById(userId);
		 return rep.save(module);
	}
}