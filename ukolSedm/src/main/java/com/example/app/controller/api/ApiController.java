package com.example.app.controller.api;

import com.example.domain.model.Order;
import com.example.domain.service.order.OrderService;

public class ApiController {
  private OrderService orderService;

  public ApiController(OrderService orderService) {
    this.orderService = orderService;
  }

  public void handleOrderRequest(Order order) {
    System.out.println("Handling API request for order...");
    orderService.printOrderSummary(order);
  }
}