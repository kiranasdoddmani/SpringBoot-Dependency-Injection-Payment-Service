package com.cfs.SpringBoot04.controller;

import com.cfs.SpringBoot04.service.PaymentService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cfs")
public class PaymentController {
    private final PaymentService paymentService;

//    public PaymentController(@Qualifier("UPIPaymentService") PaymentService paymentService) {
        public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @GetMapping("/pay")
    public String Pay(){
        return paymentService.pay();
    }
}
