package com.example.payment;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PaymentServiceTest {

    @Autowired
    private PaymentService paymentService;

    @Test
    public void testProcessPayment() {
        PaymentRequest validPayment = new PaymentRequest("4111111111111111", "123", "12/25", 100.0);
        PaymentRequest invalidPayment = new PaymentRequest("5111111111111111", "123", "12/25", 100.0);
        PaymentRequest negativeAmount = new PaymentRequest("4111111111111111", "123", "12/25", -50.0);

        assertTrue(paymentService.processPayment(validPayment));
        assertFalse(paymentService.processPayment(invalidPayment));
        assertFalse(paymentService.processPayment(negativeAmount));
    }
}
