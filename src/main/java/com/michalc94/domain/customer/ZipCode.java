package com.michalc94.domain.customer;

/**
 * Created by michalc94 on 26.02.17.
 */
class ZipCode {
  private String zipCode;

  // jpa requirement
  public ZipCode() {
  }

  public ZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  public String getZipCode() {
    return zipCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    ZipCode zipCode1 = (ZipCode) o;

    return zipCode != null ? zipCode.equals(zipCode1.zipCode) : zipCode1.zipCode == null;
  }

  @Override
  public int hashCode() {
    return zipCode != null ? zipCode.hashCode() : 0;
  }

  @Override
  public String toString() {
    return "ZipCode{" +
        "zipCode='" + zipCode + '\'' +
        '}';
  }
}
