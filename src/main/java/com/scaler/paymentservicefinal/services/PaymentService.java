package com.scaler.paymentservicefinal.services;

import com.scaler.paymentservicefinal.services.paymentgateway.PaymentGateway;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    private PaymentGatewayChooserStrategy paymentGatewayChooserStrategy;

    public PaymentService(PaymentGatewayChooserStrategy paymentGatewayChooserStrategy) {
        this.paymentGatewayChooserStrategy = paymentGatewayChooserStrategy;
    }

    public String initiatePayment(String orderId, String email, String phoneNumber, Long amount) {
        // Order order = orderService.getOrderDetails(orderId)
        // Long amount = order.getAmount();
        // double amount = 10.10; // store number * 100
        // String orderId, String email, String phoneNumber, Long amount
//        Long amount = 1010L; // 10.00 => 1000

        PaymentGateway paymentGateway = paymentGatewayChooserStrategy.getBestPaymentGateway();

        return paymentGateway.generatePaymentLink(orderId, email, phoneNumber, amount);
    }
}
