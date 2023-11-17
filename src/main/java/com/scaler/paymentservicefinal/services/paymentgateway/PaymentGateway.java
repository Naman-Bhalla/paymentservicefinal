package com.scaler.paymentservicefinal.services.paymentgateway;

public interface PaymentGateway {
    String generatePaymentLink(String orderId, String email, String phoneNumber, Long amount);
}
