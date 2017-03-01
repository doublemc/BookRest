package com.michalc94.domain;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Created by michalc94 on 25.02.17.
 */
@Entity
@Table(name = "address")
public class Address {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "address_id", nullable = false, updatable = false, unique = true)
  private Long id;

  @Column(name = "state")
  private String state;
  @Column(name = "zipcode", nullable = false)
  private String zipCode;
  @Column(name = "city", nullable = false)
  private String city;
  @Column(name = "street", nullable = false)
  private String street;

  // many customers might live at the same address
  @OneToMany(mappedBy = "address")
  private final Set<Customer> customers = new HashSet<>();

  // jpa requirement
  public Address() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
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

  public Set<Customer> getCustomers() {
    return customers;
  }
}
