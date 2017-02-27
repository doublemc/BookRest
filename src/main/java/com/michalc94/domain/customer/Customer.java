package com.michalc94.domain.customer;

import com.michalc94.domain.user.AppUser;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 * Created by michalc94 on 25.02.17.
 */
@Entity
@Access(AccessType.FIELD) // so I can avoid using setters for fields that won't change
public class Customer {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long customerId;

  @Embedded
  private FirstName firstName;
  @Embedded
  private LastName lastName;
  @Embedded
  private PhoneNumber phoneNumber;

  @ManyToOne
  @JoinColumn(name = "ADDRESS_ID")
  private Address address;

  @OneToOne
  @JoinColumn(name = "USER_ID")
  private AppUser appUser;

  // jpa requirement
  public Customer() {
  }

  public Customer(FirstName firstName, LastName lastName,
      PhoneNumber phoneNumber, Address address, AppUser appUser) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.phoneNumber = phoneNumber;
    this.address = address;
    this.appUser = appUser;
  }

  public Long getCustomerId() {
    return customerId;
  }

  public FirstName getFirstName() {
    return firstName;
  }

  public LastName getLastName() {
    return lastName;
  }

  public PhoneNumber getPhoneNumber() {
    return phoneNumber;
  }

  // setter for phone number is needed because customer can change his phone number
  public void setPhoneNumber(PhoneNumber phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public Address getAddress() {
    return address;
  }

  // setter for address is needed because customer can change his address
  public void setAddress(Address address) {
    this.address = address;
  }

  public AppUser getAppUser() {
    return appUser;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Customer customer = (Customer) o;

    if (firstName != null ? !firstName.equals(customer.firstName) : customer.firstName != null) {
      return false;
    }
    if (lastName != null ? !lastName.equals(customer.lastName) : customer.lastName != null) {
      return false;
    }
    return appUser != null ? appUser.equals(customer.appUser) : customer.appUser == null;
  }

  @Override
  public int hashCode() {
    int result = firstName != null ? firstName.hashCode() : 0;
    result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
    result = 31 * result + (appUser != null ? appUser.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "Customer{" +
        "firstName=" + firstName +
        ", lastName=" + lastName +
        ", phoneNumber=" + phoneNumber +
        '}';
  }
}
