package com.example.domain.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
  private User user;
  private List<OrderItem> items;

  public Order(User user) {
    this.user = user;
    this.items = new ArrayList<>();
  }

  public User getUser() {
    return user;
  }

  public List<OrderItem> getItems() {
    return items;
  }

  public void addItem(OrderItem item) {
    items.add(item);
  }

  public double calculateTotal() {
    return items.stream().mapToDouble(OrderItem::getTotalPrice).sum();
  }
}