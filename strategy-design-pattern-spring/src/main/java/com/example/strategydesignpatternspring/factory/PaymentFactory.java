package com.example.strategydesignpatternspring.factory;

import com.example.strategydesignpatternspring.enums.PaymentMethod;
import com.example.strategydesignpatternspring.payment.Payment;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.springframework.stereotype.Component;

@Component
public class PaymentFactory {

  Map<PaymentMethod, Payment> map;

  public PaymentFactory(Set<Payment> paymentSet) {
    createPaymentsMap(paymentSet);
  }

  private void createPaymentsMap(Set<Payment> payments) {
    map = new HashMap<>();
    payments.forEach(payment -> map.put(payment.getPaymentType(), payment));
  }

  public Payment getMethod(PaymentMethod method) {
    return map.get(method);
  }

}
