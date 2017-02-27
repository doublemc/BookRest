package com.michalc94.domain.user;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

/**
 * Created by michalc94 on 27.02.17.
 */
public class UserTest {

  private static final String ANY_EMAIL = "example@example.com";
  private static final String ANY_PASSWORD = "password";

  @Test
  public void shouldCreateUser_whenUsingConstructor() {
    // given
    EmailAddress anyEmail = new EmailAddress(ANY_EMAIL);
    Password anyPassword = new Password(ANY_PASSWORD);
    // when
    User anyUser = new User(new EmailAddress(ANY_EMAIL), new Password(ANY_PASSWORD));

    // then
    assertThat(anyUser.getEmailAddress()).isEqualTo(anyEmail);
    assertThat(anyUser.getPassword()).isEqualTo(anyPassword);
  }

  @Test
  public void shouldCreateUserWithDefaultRole_whenUsingConstructor() {
    // given
    EmailAddress anyEmail = new EmailAddress(ANY_EMAIL);
    Password anyPassword = new Password(ANY_PASSWORD);
    // when
    User anyUser = new User(anyEmail, anyPassword);

    // then
    assertThat(anyUser.getUserRole()).isEqualTo(UserRole.USER);
  }
}