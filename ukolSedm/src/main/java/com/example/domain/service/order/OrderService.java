package com.example.domain.service.order;

import com.example.domain.model.Order;

public class OrderService {
  public void printOrderSummary(Order order) {
    System.out.println("Order Summary for: " + order.getUser().getFullName());
    order.getItems().forEach(item -> {
      System.out.println("- " + item.getProduct().getName() + " x " + item.getQuantity() + " = " + item.getTotalPrice() + " Kč");
    });
    System.out.println("Total: " + order.calculateTotal() + " Kč");
  }
}