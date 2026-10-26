package com.cfs.SpringBoot04.service.impl;

import com.cfs.SpringBoot04.service.PaymentService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class CardPaymentService implements PaymentService {
    @Override
    public String pay() {
        return "Card";
    }
}
