package com.app.nutritionapp.Model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
@Table
public class ExerciseModule {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int UserId;
	private int PushupPs;
	private int InclinepushupPs;
	private int KneepushupPs;
	private int SquatsPs;
	private int MonthlyPlan;
	private String name;
	private String planDescription;
	
	
	@JsonFormat(pattern ="dd-mm-yyyy")
	private Date created_At;
	private Date updated_At;
	private double price;


	public void setUserId(int userId) {
		UserId = userId;
	}
	
	
	
	
	@OneToOne(cascade = CascadeType.ALL)
	private User user;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	

	public int getPushupPs() {
		return PushupPs;
	}
	public ExerciseModule(int pushupPs, int inclinepushupPs, int kneepushupPs, int squatsPs, int monthlyPlan,
			String name, String planDescription, Date created_At, Date updated_At, double price) {
		super();
		PushupPs = pushupPs;
		InclinepushupPs = inclinepushupPs;
		KneepushupPs = kneepushupPs;
		SquatsPs = squatsPs;
		MonthlyPlan = monthlyPlan;
		this.name = name;
		this.planDescription = planDescription;
		this.created_At = created_At;
		this.updated_At = updated_At;
		this.price = price;
	}
	public void setPushupPs(int pushupPs) {
		this.PushupPs = pushupPs;
	}
	
	public int getInclinepushupPs() {
		return InclinepushupPs;
	}
	public void setInclinepushupPs(int inclinepushupPs) {
		this.InclinepushupPs = inclinepushupPs;
	}
	public int getKneepushupPs() {
		return KneepushupPs;
	}
	public void setKneepushupPs(int kneepushupPs) {
		this.KneepushupPs = kneepushupPs;
	}
	public int getSquatsPs() {
		return SquatsPs;
	}
	public void setSquatsPs(int squatsPs) {
		this.SquatsPs = squatsPs;
	}
	public int getMonthlyPlan() {
		return MonthlyPlan;
	}
	public void setMonthlyPlan(int monthlyPlan) {
		this.MonthlyPlan = monthlyPlan;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlanDescription() {
		return planDescription;
	}
	public void setPlanDescription(String planDescription) {
		this.planDescription = planDescription;
	
	}
	public Date getCreated_At() {
		return created_At;
	}
	public void setCreated_At(Date created_At) {
		this.created_At = created_At;
	}
	public Date getUpdated_At() {
		return updated_At;
	}
	public void setUpdated_At(Date updated_At) {
		this.updated_At = updated_At;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}




	public int getUserId() {
		return UserId;
	}




	@Override
	public String toString() {
		return "ExerciseModule [PushupPs=" + PushupPs + ", InclinepushupPs=" + InclinepushupPs + ", KneepushupPs="
				+ KneepushupPs + ", SquatsPs=" + SquatsPs + ", MonthlyPlan=" + MonthlyPlan + ", name=" + name
				+ ", planDescription=" + planDescription + ", created_At=" + created_At + ", updated_At=" + updated_At
				+ ", price=" + price + "]";
	}




	public ExerciseModule() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

