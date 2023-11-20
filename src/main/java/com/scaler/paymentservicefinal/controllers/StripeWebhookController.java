package com.scaler.paymentservicefinal.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.stripe.Stripe;
import com.stripe.exception.SignatureVerificationException;
import com.stripe.model.*;
import com.stripe.net.Webhook;

import java.net.http.HttpRequest;

@RestController
@RequestMapping("/stripeWebhook")
public class StripeWebhookController {

    @PostMapping
    public void receiveWebhookEvent(Event event) {
        System.out.println("Waiting");
        // 0. Match the secret

        // 1. Read the event details

//        if (event.type == "payment_link.created") {
//            // ...
//        } elif (event.type == "payment_link.updated") {
//            // ..
//        } elif (event.type == ""payment.received) {
//
//        }

    }
}
