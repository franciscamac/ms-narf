package com.franciscama.hrpayroll.services;


import com.franciscama.hrpayroll.entinties.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
        public Payment getPayment(long workerId, int days) {
            return new Payment("Maria", 200.0, days);
        }
}
