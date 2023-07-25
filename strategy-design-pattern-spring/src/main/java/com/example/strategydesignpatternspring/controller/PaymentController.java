package com.example.strategydesignpatternspring.controller;

import com.example.strategydesignpatternspring.enums.PaymentMethod;
import com.example.strategydesignpatternspring.factory.PaymentFactory;
import com.example.strategydesignpatternspring.payment.Payment;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PaymentController {

  private final PaymentFactory factory;

  @GetMapping("/pay-with/{method}")
  public String payWith(@PathVariable PaymentMethod method) {
    Payment payment = factory.getMethod(method);
    return payment.getMessage();
  }

}
