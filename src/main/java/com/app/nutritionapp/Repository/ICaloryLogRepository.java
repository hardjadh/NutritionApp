package com.app.nutritionapp.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.app.nutritionapp.Model.CaloryLog;

@Repository
public interface ICaloryLogRepository extends JpaRepository<CaloryLog, Integer>{

	    @Query("SELECT c FROM CaloryLog c WHERE c.userName=?1")
        List<CaloryLog> findByName(String userName);

		
	    @Query("SELECT SUM(c.calories_burned) FROM CaloryLog c WHERE c.userName=?1")
	    double findSum(String userName);
		
        
}
