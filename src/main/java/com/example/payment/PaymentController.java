package com.example.payment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/api/payment/process")
    public String processPayment(@RequestBody PaymentRequest paymentRequest) {
        boolean paymentResult = paymentService.processPayment(paymentRequest);
        return paymentResult ? "Payment successful" : "Payment failed";
    }
}
