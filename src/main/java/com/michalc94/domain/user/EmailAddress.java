package com.michalc94.domain.user;

/**
 * Created by michalc94 on 26.02.17.
 */

class EmailAddress {
  private String emailAddress;

  // jpa requirement
  public EmailAddress() {
  }

  public EmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public String getEmailAddress() {
    return emailAddress;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    EmailAddress that = (EmailAddress) o;

    return emailAddress != null ? emailAddress.equals(that.emailAddress)
        : that.emailAddress == null;
  }

  @Override
  public int hashCode() {
    return emailAddress != null ? emailAddress.hashCode() : 0;
  }

  @Override
  public String toString() {
    return "EmailAddress{" +
        "emailAddress='" + emailAddress + '\'' +
        '}';
  }
}
