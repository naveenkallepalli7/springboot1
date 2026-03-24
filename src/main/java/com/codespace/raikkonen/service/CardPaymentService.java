package com.codespace.raikkonen.service;

import org.springframework.stereotype.Service;

@Service
public class CardPaymentService implements PaymentService {

    @Override
    public String pay(double amount) {
        return "Payment of " + amount + " done using Card";
    }

    @Override
    public String getPaymentType() {
        return "Card";
    }
}