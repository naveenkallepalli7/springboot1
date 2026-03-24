package com.codespace.raikkonen.service;

import org.springframework.stereotype.Service;

@Service
public class NetBankingPaymentService implements PaymentService {

    @Override
    public String pay(double amount) {
        return "Payment of " + amount + " done using NetBanking";
    }

    @Override
    public String getPaymentType() {
        return "NetBanking";
    }
}