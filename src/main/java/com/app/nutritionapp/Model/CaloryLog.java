package com.app.nutritionapp.Model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CaloryLog_Table")
public class CaloryLog {

	@Id
	private Integer calory_id;
	private String userName;
	private double  calories_burned;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	
	//Exercisetype//
	
	@Enumerated(EnumType.STRING)
	private  ExerciseType exerciseType;

		//Calories burned//
			
		public ExerciseType getExerciseType() {
		return exerciseType;
	}
	public void setExerciseType(ExerciseType exerciseType) {
		this.exerciseType = exerciseType;
	}

	@ManyToOne
private User user;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
	
	
		
		public CaloryLog(Integer calory_id, String userName, double calories_burned, ExerciseType exerciseType) {
		super();
		this.calory_id = calory_id;
		this.userName = userName;
		this.calories_burned = calories_burned;
		this.exerciseType = exerciseType;
	}

		public CaloryLog() {
			// TODO Auto-generated constructor stub
		}

		

		
		
		

		@Override
		public String toString() {
			return "CaloryLog [calory_id=" + calory_id + ", userName=" + userName + ", calories_burned="
					+ calories_burned + ", exerciseType=" + exerciseType + "]";
		}

		public Integer getCalory_id() {
			return calory_id;
		}

		public void setCalory_id(Integer calory_id) {
			this.calory_id = calory_id;
		}

		public double getCalories_burned() {
			return calories_burned;
		}

		public void setCalories_burned(double calories_burned) {
			this.calories_burned = calories_burned;
		}

		

//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "PushupPs")
//	private ExerciseModule ecerciseModule;
}
