package com.app.nutritionapp.Repository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.app.nutritionapp.Model.NutritionPlan;
import com.app.nutritionapp.Repository.INutritionPlanRepository;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
class INutritionPlanRepositoryTest {


	@Autowired
	INutritionPlanRepository irepo;
	
	@Test
	@Order(1)
	public void testAdd() {
		NutritionPlan p = new NutritionPlan();
		p.setName("iPhone XR");
		p.setPlanDescription("amazing plan");
		p.setPrice(1000.00);
		irepo.save(p);
		assertNotNull(irepo.findById(2L).get());
	}
	
	@Test
	@Order(2)
	public void testGetAll() {
		List<NutritionPlan> list = irepo.findAll();
		assertThat(list).size().isGreaterThan(0);
	}
	
	@Test
	@Order(3)
	public void testGet() {
		NutritionPlan pr = irepo.findById(2L).get();
		assertEquals("iPhone XR", pr.getName());
	}
	
	@Test
	@Order(4)
	public void testUpdate() {
		NutritionPlan p = irepo.findById(2L).get();
		p.setPrice(800.00);
		irepo.save(p);
		assertNotEquals(700.00, irepo.findById(2L).get().getPrice());
	}
	
	@Test
	@Order(5)
	public void testDelete () {
		irepo.deleteById(2L);
		assertThat(irepo.existsById(2L)).isFalse();
	}


}
