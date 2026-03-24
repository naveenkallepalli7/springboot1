package com.codespace.raikkonen.service;

import org.springframework.stereotype.Service;

@Service
public class PaymentManager {

    private final PaymentService paymentService;

    public PaymentManager(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public String makePayment(double amount) {
        return paymentService.pay(amount);
    }
}