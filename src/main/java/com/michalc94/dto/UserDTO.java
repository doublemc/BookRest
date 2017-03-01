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

  public UserDTO(String email, String password) {
    this.email = email;
    this.password = password;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Role getRole() {
    return role;
  }

  public void setRole(Role role) {
    this.role = role;
  }
}
