package com.michalc94.dto;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created by michalc94 on 01.03.17.
 */
class CustomerDTO {

  // TODO: 01.03.17 Use more specified constraints
  @NotEmpty(message = "First name cannot be empty")
  private String firstName;
  @NotEmpty(message = "Last name cannot be empty")
  private String lastName;
  @NotEmpty(message = "Phone number cannot be empty")
  private String phoneNumber;

  public CustomerDTO(String firstName, String lastName, String phoneNumber) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.phoneNumber = phoneNumber;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }
}
