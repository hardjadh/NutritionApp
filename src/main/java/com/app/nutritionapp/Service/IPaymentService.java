package com.app.nutritionapp.Service;

import java.util.List;

import com.app.nutritionapp.Model.Payment;

public interface IPaymentService {
	
	    public List<Payment> getAllPayments();
		
		public Payment getPayment(long id);
	    public Payment savePayment(Payment payment);

}
