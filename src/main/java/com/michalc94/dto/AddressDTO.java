package com.michalc94.dto;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created by michalc94 on 01.03.17.
 */
class AddressDTO {

  private String state;
  @NotEmpty(message = "Zip code cannot be empty")
  private String zipCode;
  @NotEmpty(message = "City cannot be empty")
  private String city;
  @NotEmpty(message = "Street cannot be empty")
  private String street;
}
