package com.app.nutritionapp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.nutritionapp.Model.Payment;
import com.app.nutritionapp.Service.IPaymentService;


@RestController 
//@RequestMapping("/nutrition")
public class PaymentController {
	
	@Autowired
    private IPaymentService paymentService;
	
	@PostMapping("/addpayment")
	public ResponseEntity <String> savePayments(@RequestBody Payment payment){
		paymentService.savePayment(payment);
		
	/*	if(payments.isEmpty()) {
			//return new ResponseEntity("Payment-info not available" , HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<Payment>>(payments,HttpStatus.OK);    */
		return new ResponseEntity<String>("Payment saved successfully",HttpStatus.OK) ;
	}
		
	@GetMapping("/getAllpayments")
	public ResponseEntity<List<Payment>> getAllPayments(){
		
		List<Payment> payments = paymentService.getAllPayments();
		/* if(payments.isEmpty()) {
			return new ResponseEntity("Payment-info not available" , HttpStatus.NOT_FOUND);
		} */
	   ResponseEntity<List<Payment>> r = new ResponseEntity<List<Payment>>(payments,HttpStatus.OK);
	   return r;
	}
	
	@GetMapping("/getPaymentById/{id}")
	public ResponseEntity <Payment> getPayment(@PathVariable("id") long id){
		Payment payment = paymentService.getPayment(id);
		//if(payment == null){
			//return new ResponseEntity("Payment-info not available" , HttpStatus.NOT_FOUND);
	//	}
		ResponseEntity <Payment> r1 = new ResponseEntity <Payment> (payment , HttpStatus.OK);
		return r1;
	}
	
	/*
	@PutMapping("/payments")
	public ResponseEntity<List<Payment>> updatePayment(@RequestBody  Payment payment){
		List<Payment> payments = paymentService.updatePayment(payment);
				if(payments.isEmpty()) {
					return new ResponseEntity("Payment-info not available" , HttpStatus.NOT_FOUND);
				}
				return new ResponseEntity<List<Payment>>(payments,HttpStatus.OK);
			}*/
		
}
