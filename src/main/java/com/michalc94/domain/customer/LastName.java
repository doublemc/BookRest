package com.michalc94.domain.customer;

/**
 * Created by michalc94 on 26.02.17.
 */

class LastName {
  private String lastName;

  // jpa requirement
  public LastName() {
  }

  public LastName(String lastName) {
    this.lastName = lastName;
  }

  public String getLastName() {
    return lastName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    LastName lastName1 = (LastName) o;

    return lastName != null ? lastName.equals(lastName1.lastName) : lastName1.lastName == null;
  }

  @Override
  public int hashCode() {
    return lastName != null ? lastName.hashCode() : 0;
  }

  @Override
  public String toString() {
    return "LastName{" +
        "lastName='" + lastName + '\'' +
        '}';
  }
}
