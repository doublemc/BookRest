package com.michalc94.domain.customer;

/**
 * Created by michalc94 on 26.02.17.
 */

class FirstName {
  private String firstName;

  // jpa requirement
  public FirstName() {
  }

  public FirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getFirstName() {
    return firstName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    FirstName firstName1 = (FirstName) o;

    return firstName != null ? firstName.equals(firstName1.firstName)
        : firstName1.firstName == null;
  }

  @Override
  public int hashCode() {
    return firstName != null ? firstName.hashCode() : 0;
  }

  @Override
  public String toString() {
    return "FirstName{" +
        "firstName='" + firstName + '\'' +
        '}';
  }
}
