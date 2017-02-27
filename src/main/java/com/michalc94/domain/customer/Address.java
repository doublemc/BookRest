package com.michalc94.domain.customer;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Created by michalc94 on 25.02.17.
 */
@Entity
@Access(AccessType.FIELD)
    // so I can avoid using setters for fields that won't change
class Address {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long addressId;

  @Embedded
  private State state;
  @Embedded
  private ZipCode zipCode;
  @Embedded
  private City city;
  @Embedded
  private Street street;

  // many customers might live at the same address
  @OneToMany(mappedBy = "address")
  private final Set<Customer> customers = new HashSet<>();

  // jpa requirement
  public Address() {
  }

  Address(State state, ZipCode zipCode, City city, Street street, Customer customer) {
    this.state = state;
    this.zipCode = zipCode;
    this.city = city;
    this.street = street;
    this.customers.add(customer);
  }

  public Long getAddressId() {
    return addressId;
  }

  public State getState() {
    return state;
  }

  public ZipCode getZipCode() {
    return zipCode;
  }

  public City getCity() {
    return city;
  }

  public Street getStreet() {
    return street;
  }

  public Set<Customer> getCustomers() {
    return customers;
  }

}
