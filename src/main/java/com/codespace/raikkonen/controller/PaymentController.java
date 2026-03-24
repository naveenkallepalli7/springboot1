package com.codespace.raikkonen.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.codespace.raikkonen.service.PaymentManager;

@RestController
public class PaymentController {

    private final PaymentManager paymentManager;

    public PaymentController(PaymentManager paymentManager) {
        this.paymentManager = paymentManager;
    }

    @GetMapping("/pay")
    public String pay(@RequestParam double amount) {
        return paymentManager.makePayment(amount);
    }
}