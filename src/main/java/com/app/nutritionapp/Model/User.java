package com.app.nutritionapp.Model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long userId;

	@Column(name = "userIdentification")
	private String userIdentification;
	private String name;
	private Long contact;
	private String gender;
	private String dob;
	private String email;
	private Double weight;
	private Double height;
	private Double intensity;
	private String goal;
	
	@Column(name = "work_Out_Time")
	private String workOutTime;
	
	@Column(name = "wake_Up_Time")
	private String wakeUpTime;
	
	@Column(name = "sleep_Time")
	private String sleepTime;
	
	@Column(name = "medical_Condition")
	private String medicalCondition;
	
	@Column(name = "allergic_To")
	private String allergicTo;
	
	@Column(name = "login_Name")
	private String loginName;
	private String password;

	
	@OneToOne(cascade = CascadeType.ALL)
	private NutritionPlan nutriPlan;
	public NutritionPlan getNutriPlan() {
		return nutriPlan;
	}
	public void setNutriPlan(NutritionPlan nutriPlan) {
		this.nutriPlan = nutriPlan;
	}
	
	
	@OneToOne(cascade = CascadeType.ALL)
	private Payment pay;
	public Payment getPay() {
		return pay;
	}
	public void setPay(Payment pay) {
		this.pay = pay;
	}
	
	
	@OneToOne(cascade = CascadeType.ALL)
	private DietPlan dietPlan;
	public DietPlan getDietPlan() {
	return dietPlan;
	}
	public void setDietPlan(DietPlan dietPlan) {
	this.dietPlan = dietPlan;
	}
	
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<CaloryLog> caloryLog;
	public List<CaloryLog> getCaloryLog() {
	return caloryLog;
	}
	public void setCaloryLog(List<CaloryLog> caloryLog) {
	this.caloryLog = caloryLog;
	}
	
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name= "unique_id")
	private Set<WeightLog> weightLog = new HashSet<WeightLog>();
	public Set<WeightLog> getWeightLog() {
	return weightLog;
	}
	public void setWeightLog(Set<WeightLog> weightLog) {
	this.weightLog = weightLog;
	}
	
	
	@OneToOne(cascade = CascadeType.ALL)
	private ExerciseModule exerciseModule;

	public ExerciseModule getExerciseModule() {
	return exerciseModule;
	}
	public void setExerciseModule(ExerciseModule exerciseModule) {
	this.exerciseModule = exerciseModule;
	}
	

	
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserIdentification() {
		return userIdentification;
	}
	public void setUserIdentification(String user) {
		this.userIdentification = user;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Long getContact() {
		return contact;
	}
	public void setContact(Long contact) {
		this.contact = contact;
	}

	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}

	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Double getHeight() {
		return height;
	}
	public void setHeight(Double height) {
		this.height = height;
	}

	public Double getIntensity() {
		return intensity;
	}
	public void setIntensity(Double intensity) {
		this.intensity = intensity;
	}

	public String getGoal() {
		return goal;
	}
	public void setGoal(String goal) {
		this.goal = goal;
	}

	public String getWorkOutTime() {
		return workOutTime;
	}
	public void setWorkOutTime(String workOutTime) {
		this.workOutTime = workOutTime;
	}

	public String getWakeUpTime() {
		return wakeUpTime;
	}
	public void setWakeUpTime(String wakeUpTime) {
		this.wakeUpTime = wakeUpTime;
	}

	public String getSleepTime() {
		return sleepTime;
	}
	public void setSleepTime(String sleepTime) {
		this.sleepTime = sleepTime;
	}

	public String getMedicalCondition() {
		return medicalCondition;
	}
	public void setMedicalCondition(String medicalCondition) {
		this.medicalCondition = medicalCondition;
	}

	public String getAllergicTo() {
		return allergicTo;
	}
	public void setAllergicTo(String allergicTo) {
		this.allergicTo = allergicTo;
	}

	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
