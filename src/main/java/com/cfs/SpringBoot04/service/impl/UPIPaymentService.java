package com.cfs.SpringBoot04.service.impl;

import com.cfs.SpringBoot04.service.PaymentService;
import org.springframework.stereotype.Service;

@Service
public class UPIPaymentService implements PaymentService {
    @Override
    public String pay() {
        return "UPI";
    }
}
