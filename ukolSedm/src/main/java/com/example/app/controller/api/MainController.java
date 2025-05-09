package com.example.app.controller.api;

import com.example.domain.model.*;
import com.example.domain.service.order.OrderService;

public class MainController {
  public static void main(String[] args) {
    // Vytvoření uživatele
    User user = new User("Jan", "Novák", "jan.novak@example.com");

    // Vytvoření produktů
    Product product1 = new Product("Notebook", 15000);
    Product product2 = new Product("Myš", 500);

    // Vytvoření objednávky
    Order order = new Order(user);
    order.addItem(new OrderItem(product1, 1));
    order.addItem(new OrderItem(product2, 2));

    // Zpracování objednávky
    OrderService orderService = new OrderService();
    orderService.printOrderSummary(order);
  }
}