package com.michalc94.domain.user;

import com.michalc94.domain.customer.Customer;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 * Created by michalc94 on 25.02.17.
 */
@Entity
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long userId;

  @Embedded
  private EmailAddress emailAddress;
  @Embedded
  private Password password;

  @OneToOne
  @JoinColumn(name = "CUSTOMER_ID")
  private Customer customer;

  @Column
  @Enumerated(EnumType.STRING)
  private UserRole userRole;

  // jpa requirement
  public User() {
  }

  public User(EmailAddress emailAddress, Password password) {
    this.emailAddress = emailAddress;
    this.password = password;
    this.userRole = UserRole.USER; // on creation everyone is just a user
  }

  public Long getUserId() {
    return userId;
  }

  public EmailAddress getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(EmailAddress emailAddress) {
    this.emailAddress = emailAddress;
  }

  public Password getPassword() {
    return password;
  }

  public void setPassword(Password password) {
    this.password = password;
  }

  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  public UserRole getUserRole() {
    return userRole;
  }

  public void setUserRole(UserRole userRole) {
    this.userRole = userRole;
  }
}
