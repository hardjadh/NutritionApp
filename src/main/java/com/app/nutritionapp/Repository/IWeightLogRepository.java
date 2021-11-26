package com.app.nutritionapp.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.nutritionapp.Model.WeightLog;

@Repository
public interface IWeightLogRepository extends JpaRepository<WeightLog, Long> {

	@Query("SELECT w FROM WeightLog w WHERE w.userName=?1")
	List<WeightLog> findByName(String userName);

}
