package com.michalc94.domain.customer;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Created by michalc94 on 25.02.17.
 */
@Entity
class Address {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long addressId;

  private State state;
  private ZipCode zipCode;
  private City city;
  private Street street;
  
  // many customers might live at the same address
  @OneToMany(mappedBy = "address")
  private final Set<Customer> customers = new HashSet<>();

  // jpa requirement
  public Address() {
  }

  public Address(State state, ZipCode zipCode, City city, Street street) {
    this.state = state;
    this.zipCode = zipCode;
    this.city = city;
    this.street = street;
  }
}
