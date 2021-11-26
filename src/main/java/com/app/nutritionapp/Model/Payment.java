package com.app.nutritionapp.Model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.app.nutritionapp.Exception.PaymentException;

@Entity
@Table
public class Payment {
	
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
 
     @Column(name= "price")
	private double price;
     
     @Column(name= "discount")
	private double discount;
 
	@CreationTimestamp 
     @Column(name= "created_At")
	private LocalDate created_At;
     
	@UpdateTimestamp
     @Column(name= "updated_At")
	private LocalDate updated_At;
     
     @Column(name= "userId")
	private long userId;
     
     
	@OneToOne
	private User user;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
	
	
//	public Payment() {
//		super();
//	}
	/*
	public Payment(double price, double discount, LocalDate created_At,
			LocalDate updated_At, long userId) throws PaymentException 
	{
		super();
		this.price = price;
		if(price<=0) {
			throw new PaymentException("Payment amount is invalid");
	   }
		this.price = price;
	   if(discount<0) {
	      	throw new PaymentException("Discount amount is invalid");
		}
		this.discount = discount;
		this.created_At = created_At;
		this.updated_At = updated_At;
		this.userId = userId;
		if(planId<0) {
			throw new PaymentException("Plan Id is invalid");
		}
		
		this.planId = planId;
	}  */

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
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

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}
/*
	public long getPlanId() {
		return planId;
	}

	public void setPlanId(long planId) {
		this.planId = planId;
	}*/

//	@Override
//	public String toString() {
//		return "Payment [id=" + id + ", price=" + price + ", discount=" + discount + ", created_At=" + created_At
//				+ ", updated_At=" + updated_At + ", userId=" + userId + "]";
//	}
  
}
