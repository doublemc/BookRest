package com.michalc94.domain.customer;

/**
 * Created by michalc94 on 26.02.17.
 */
class PhoneNumber {
  private String phoneNumber;

  // jpa requirement
  public PhoneNumber() {
  }

  public PhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    PhoneNumber that = (PhoneNumber) o;

    return phoneNumber != null ? phoneNumber.equals(that.phoneNumber) : that.phoneNumber == null;
  }

  @Override
  public int hashCode() {
    return phoneNumber != null ? phoneNumber.hashCode() : 0;
  }

  @Override
  public String toString() {
    return "PhoneNumber{" +
        "phoneNumber='" + phoneNumber + '\'' +
        '}';
  }
}
