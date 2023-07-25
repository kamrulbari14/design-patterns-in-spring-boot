package com.example.strategydesignpatternspring.payment;

import com.example.strategydesignpatternspring.enums.PaymentMethod;

public interface Payment {

  String getMessage();

  PaymentMethod getPaymentType();

}
