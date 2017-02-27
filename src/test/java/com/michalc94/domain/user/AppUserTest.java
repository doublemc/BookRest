package com.michalc94.domain.user;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

/**
 * Created by michalc94 on 27.02.17.
 */
public class AppUserTest {

  private static final String ANY_EMAIL = "example@example.com";
  private static final String ANY_PASSWORD = "password";

  @Test
  public void shouldCreateUser_whenUsingConstructor() {
    // given
    EmailAddress anyEmail = new EmailAddress(ANY_EMAIL);
    Password anyPassword = new Password(ANY_PASSWORD);
    // when
    AppUser anyAppUser = new AppUser(new EmailAddress(ANY_EMAIL), new Password(ANY_PASSWORD));

    // then
    assertThat(anyAppUser.getEmailAddress()).isEqualTo(anyEmail);
    assertThat(anyAppUser.getPassword()).isEqualTo(anyPassword);
  }

  @Test
  public void shouldCreateUserWithDefaultRole_whenUsingConstructor() {
    // given
    EmailAddress anyEmail = new EmailAddress(ANY_EMAIL);
    Password anyPassword = new Password(ANY_PASSWORD);
    // when
    AppUser anyAppUser = new AppUser(anyEmail, anyPassword);

    // then
    assertThat(anyAppUser.getUserRole()).isEqualTo(UserRole.USER);
  }
}