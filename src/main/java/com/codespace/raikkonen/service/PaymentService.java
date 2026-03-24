package com.codespace.raikkonen.service;

public interface PaymentService {
    String pay(double amount);

    String getPaymentType();
}