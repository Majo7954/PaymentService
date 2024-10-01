package com.example.payment;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public boolean processPayment(PaymentRequest paymentRequest) {
        if (paymentRequest.getCardNumber().startsWith("4") && paymentRequest.getAmount() > 0) {
            return true;
        } else {
            return false;
        }
    }
}
