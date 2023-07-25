package com.example.strategydesignpatternspring.payment.method;

import com.example.strategydesignpatternspring.enums.PaymentMethod;
import com.example.strategydesignpatternspring.payment.Payment;
import org.springframework.stereotype.Component;

@Component
public class Bkash implements Payment {

  @Override
  public String getMessage() {
    return "Payment successful by Bkash";
  }

  @Override
  public PaymentMethod getPaymentType() {
    return PaymentMethod.BKASH;
  }
}
