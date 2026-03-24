package com.codespace.raikkonen.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class UpiPaymentService implements PaymentService {

    @Override
    public String pay(double amount) {
        return "Payment of " + amount + " done using UPI";
    }

    @Override
    public String getPaymentType() {
        return "UPI";
    }
}