package com.michalc94.domain.customer;

/**
 * Created by michalc94 on 26.02.17.
 */

class Street {

  private String street;

  // jpa requirement
  public Street() {
  }

  public Street(String street) {
    this.street = street;
  }

  public String getStreet() {
    return street;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Street street1 = (Street) o;

    return street != null ? street.equals(street1.street) : street1.street == null;
  }

  @Override
  public int hashCode() {
    return street != null ? street.hashCode() : 0;
  }

  @Override
  public String toString() {
    return "Street{" +
        "street='" + street + '\'' +
        '}';
  }
}
