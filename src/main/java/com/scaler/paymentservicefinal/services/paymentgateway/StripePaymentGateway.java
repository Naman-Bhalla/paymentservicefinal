package com.scaler.paymentservicefinal.services.paymentgateway;

import org.springframework.stereotype.Service;

@Service
public class StripePaymentGateway implements PaymentGateway {

    @Override
    public String generatePaymentLink(String orderId, String email, String phoneNumber, Long amount) {
        return null;
    }
}
