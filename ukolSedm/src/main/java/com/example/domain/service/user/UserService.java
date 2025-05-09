package com.example.domain.service.user;

import com.example.domain.model.User;

public class UserService {
  public void printUserDetails(User user) {
    System.out.println("User Details:");
    System.out.println("Name: " + user.getFullName());
    System.out.println("Email: " + user.getEmail());
  }
}