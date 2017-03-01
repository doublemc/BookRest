package com.michalc94.dto;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created by michalc94 on 01.03.17.
 */
class CustomerDTO {

  @NotEmpty
  private String firstName;
  @NotEmpty
  private String lastName;
  @NotEmpty
  private String phoneNumber;
}
