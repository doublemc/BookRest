package com.michalc94.domain.customer;

import com.google.auto.value.AutoValue;

/**
 * Created by michalc94 on 26.02.17.
 */
@AutoValue
abstract class PhoneNumber {

  static PhoneNumber create(String phoneNumber) {
    return new AutoValue_State(phoneNumber);
  }
}
