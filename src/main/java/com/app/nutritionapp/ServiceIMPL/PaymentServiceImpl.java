package com.app.nutritionapp.ServiceIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.nutritionapp.Model.Payment;
import com.app.nutritionapp.Repository.IPaymentRepository;
import com.app.nutritionapp.Service.IPaymentService;


@Service("paymentService")
public class PaymentServiceImpl implements IPaymentService {

	@Autowired
	private IPaymentRepository prepository;

	

	@Override
	public List<Payment> getAllPayments() {
		return prepository.findAll();
	}

	@Override
	public Payment savePayment(Payment payment) {
		return prepository.save(payment);
	}

	@Override
	public Payment getPayment(long id) {
		// TODO Auto-generated method stub
		
		return prepository.findById(id).orElse(null);
		
	}


	/*
	@Autowired
	 private IPaymentDAO paymentDao;

	@Override
	public List<Payment> getAllPayments() {
		
		return paymentDao.getAllPayments();
	}

	@Override
	public Payment findPayment(Long id) {
		// TODO Auto-generated method stub
		return paymentDao.findPayment(id);
	}

	@Override
	public List<Payment> savePayment(Payment id) {
		// TODO Auto-generated method stub
		return paymentDao.savePayment(id);
	}

	@Override
	public List<Payment> updatePayment(Payment id) {
		// TODO Auto-generated method stub
		return paymentDao.updatePayment(id);
	}
*/
	
	
}
