package com.example.app.controller.gui;

import com.example.domain.model.User;
import com.example.domain.service.user.UserService;

public class GuiController {
  private UserService userService;

  public GuiController(UserService userService) {
    this.userService = userService;
  }

  public void displayUserDetails(User user) {
    System.out.println("Displaying user details in GUI...");
    userService.printUserDetails(user);
  }
}
