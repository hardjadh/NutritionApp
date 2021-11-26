package com.app.nutritionapp.Model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "WeightLog_Table")
public class WeightLog {

	
	@Id
	private Long unique_id;
	
	@ManyToOne(fetch = FetchType.EAGER)
	//@JoinColumn(name = "unique_id")
	private User user;
	
	public Long getUnique_id() {
		return unique_id;
	}
	public void setUnique_id(Long unique_id) {
		this.unique_id = unique_id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	private Double weight;
	/*
	 * stores date of the creation of record.
	 * Does automatically from your device.
	 */
	
	@DateTimeFormat(style = "yyyy-MM-dd")
	private LocalDate created_At;
	/**
	 * Stores date of updation of record.
	 */
	
	@DateTimeFormat(style = "yyyy-MM-dd")
	private LocalDate updated_At;
	/*
	 * userid is the unique identification of user.
	 * Will be asked from user whenever they access any record.
	 */
	private String userName;
	/**
	 * Provides initialization to module.
	 */
	public WeightLog() {
		System.out.println("OBJECT CREATED");
	}
	/**
	 * provides default values to the things user do not provide.
	 */
	
	
	/**
	 * Below are getters and setters methods for getting and storing data.
	 * getters and setters are for weight,created_At,updated_At,user_Id. 
	 * @return
	 */
	public Double getWeight() {
		return weight;
	}
	public WeightLog(Long unique_id, Double weight, LocalDate created_At, LocalDate updated_At,
			String userName) {
		super();
		this.unique_id = unique_id;
		//this.user = user;
		this.weight = weight;
		this.created_At = created_At;
		this.updated_At = updated_At;
		this.userName = userName;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public LocalDate getCreated_At() {
		return created_At;
	}
	public void setCreated_At(LocalDate created_At) {
		this.created_At = created_At;
	}
	public LocalDate getUpdated_At() {
		return updated_At;
	}
	public void setUpdated_At(LocalDate updated_At) {
		this.updated_At = updated_At;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * To String method to return all kind of  data in string format.
	 */
	@Override
	public String toString() {
		return "WeightLog [unique_id=" + unique_id + ", user="  + ", weight=" + weight + ", created_At="
				+ created_At + ", updated_At=" + updated_At + ", userId=" + userName + "]";
	}
	
}
