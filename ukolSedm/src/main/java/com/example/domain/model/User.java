package com.example.domain.model;

public class User {
  private String firstName;
  private String lastName;
  private String email;

  public User(String firstName, String lastName, String email) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getEmail() {
    return email;
  }

  public String getFullName() {
    return firstName + " " + lastName;
  }
}