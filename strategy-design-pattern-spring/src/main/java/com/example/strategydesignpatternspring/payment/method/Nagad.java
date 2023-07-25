package com.example.strategydesignpatternspring.payment.method;

import com.example.strategydesignpatternspring.enums.PaymentMethod;
import com.example.strategydesignpatternspring.payment.Payment;
import org.springframework.stereotype.Component;

@Component
public class Nagad implements Payment {

  @Override
  public String getMessage() {
    return "Payment successful by Nagad";
  }

  @Override
  public PaymentMethod getPaymentType() {
    return PaymentMethod.NAGAD;
  }
}
