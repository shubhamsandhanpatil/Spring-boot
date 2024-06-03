package com.conceptandcoding.learningspringboot.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.conceptandcoding.learningspringboot.DTO.PaymentRequest;
import com.conceptandcoding.learningspringboot.DTO.PaymentResponse;
import com.conceptandcoding.learningspringboot.Entity.PaymentEntity;
import com.conceptandcoding.learningspringboot.Repository.PaymentRepository;

@Service
public class PaymentService {

	@Autowired
	PaymentRepository paymentRepository;

	public PaymentResponse getPaymentDetailsById(PaymentRequest internalRequestObj) {

		PaymentEntity paymentModel = paymentRepository.getPaymentById(internalRequestObj);
		
//		map it to response obj
		PaymentResponse paymentResponse = mapModelToResponseDTO(paymentModel);
		return paymentResponse;

	}

	private PaymentResponse mapModelToResponseDTO(PaymentEntity paymentEntity) {

		PaymentResponse response = new PaymentResponse();

		response.setPaymentId(paymentEntity.getId());
		response.setAmount(paymentEntity.getPaymentAmount());
		response.setCurrency(paymentEntity.getPaymentCurrency());
		return response;
	}

}
