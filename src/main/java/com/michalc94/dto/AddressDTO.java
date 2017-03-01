package com.michalc94.dto;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created by michalc94 on 01.03.17.
 */
class AddressDTO {

  // TODO: 01.03.17 Use more specified constraints
  private String state;
  @NotEmpty(message = "Zip code cannot be empty")
  private String zipCode;
  @NotEmpty(message = "City cannot be empty")
  private String city;
  @NotEmpty(message = "Street cannot be empty")
  private String street;

  public AddressDTO(String state, String zipCode, String city, String street) {
    this.state = state;
    this.zipCode = zipCode;
    this.city = city;
    this.street = street;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

}
