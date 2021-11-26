package com.app.nutritionapp.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

//import lombok.Data;
//@Data

@Entity
@Table(name="diet_plan")
public class DietPlan {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long id;
	
	@Column(name="User_id",nullable = false)
	String userId;
	
	@Column(name="slots")
	String slots;
	
	@Column(name="food_type")
	String foodType;
	
	@Column(name="protein_ratio")
	double proteinRatio;
	
	@Column(name="fat_ratio")
	double fatRatio;
	
	@Column(name="carbs_ratio")
	double carbsRatio;
	
	@Column(name="total")
	double total;

	@OneToOne
	private User user;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
	
	
	
	
	
	
	
	
//	/**
//	 * Constructor for instantiation of DietPlan object with all fields
//	 * @param id
//	 * @param userId
//	 * @param slots
//	 * @param foodType
//	 * @param proteinRatio
//	 * @param fatRatio
//	 * @param carbsRatio
//	 * @param total
//	 
//	 */
//	public DietPlan( String userId, String slots, String foodType, double proteinRatio, double fatRatio,
//			double carbsRatio, double total) {
//		
//		//this.id = id;
//		this.userId = userId;
//		this.slots = slots;
//		this.foodType = foodType;
//		this.proteinRatio = proteinRatio;
//		this.fatRatio = fatRatio;
//		this.carbsRatio = carbsRatio;
//		this.total = total;
//	}
//
//	/**
//	 * default constructor for creating instance only.
//	 */
//	public DietPlan() {
//	}
//
	public Long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getSlots() {
		return slots;
	}

	public void setSlots(String slots) {
		this.slots = slots;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public double getProteinRatio() {
		return proteinRatio;
	}

	public void setProteinRatio(double proteinRatio) {
		this.proteinRatio = proteinRatio;
	}

	public double getFatRatio() {
		return fatRatio;
	}

	public void setFatRatio(double fatRatio) {
		this.fatRatio = fatRatio;
	}

	public double getCarbsRatio() {
		return carbsRatio;
	}

	public void setCarbsRatio(double carbsRatio) {
		this.carbsRatio = carbsRatio;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
//
//	@Override
//	public String toString() {
//		return "DietPlan [ userId=" + userId + ", slots=" + slots + ", foodType=" + foodType
//				+ ", proteinRatio=" + proteinRatio + ", fatRatio=" + fatRatio + ", carbsRatio=" + carbsRatio
//				+ ", total=" + total + "]";
//	}
//
//
//}
}
