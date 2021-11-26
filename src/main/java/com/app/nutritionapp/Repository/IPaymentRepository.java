package com.app.nutritionapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.nutritionapp.Model.Payment;

@Repository
public interface IPaymentRepository extends JpaRepository<Payment,Long>{

}
