package com.michalc94.dto;

import com.michalc94.domain.Role;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;

/**
 * Created by michalc94 on 01.03.17.
 */

public class UserDTO {

  @Email(message = "You have to use valid email address")
  private String email = "";
  @Length(min = 6, message = "Password must be at least 6 characters long")
  private String password = "";

  private Role role = Role.USER;
}
