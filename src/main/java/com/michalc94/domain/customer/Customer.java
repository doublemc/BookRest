package com.michalc94.domain.customer;

import com.michalc94.domain.Order;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * Created by michalc94 on 25.02.17.
 */
@Entity
public class Customer {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long customerId;

  private FirstName firstName;
  private LastName lastName;
  private PhoneNumber phoneNumber;

  @ManyToOne
  private Address address;

  @OneToMany
  private final Set<Order> orders = new HashSet<>();

  // jpa requirement
  public Customer() {
  }

  public Customer(FirstName firstName, LastName lastName,
      PhoneNumber phoneNumber, Address address) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.phoneNumber = phoneNumber;
    this.address = address;
  }
}
