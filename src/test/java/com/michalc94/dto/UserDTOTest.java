package com.michalc94.dto;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by michalc94 on 01.03.17.
 */
public class UserDTOTest {

  private static final String INVALID_EMAIL = "email.com";
  private static final String VALID_EMAIL = "email@example.com";
  private static final String INVALID_PASSWORD = "short";
  private static final String VALID_PASSWORD = "longenough";

  private static Validator validator;
  private UserDTO sut;

  @BeforeClass
  public static void validatorSetUp() {
    ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
    validator = factory.getValidator();
  }

  @Before
  public void sutSetUp() {
    sut = new UserDTO(VALID_EMAIL, VALID_PASSWORD);
  }

  @Test
  public void shouldAcceptAllValidParameters() {
    // when
    Set<ConstraintViolation<UserDTO>> constraintViolations =
        validator.validate(sut);
    // then
    assertThat(constraintViolations).hasSize(0);
  }


  @Test
  public void shouldNotAcceptInvalidEmail() {
    // given
    sut.setEmail(INVALID_EMAIL);
    // when
    Set<ConstraintViolation<UserDTO>> constraintViolations =
        validator.validate(sut);
    // then
    assertThat(constraintViolations).hasSize(1);
    assertThat(constraintViolations.iterator().next().getMessage())
        .isEqualTo("You have to use valid email address");
  }

  @Test
  public void shouldNotAcceptTooShortPassword() {
    // given
    sut.setPassword(INVALID_PASSWORD);
    // when
    Set<ConstraintViolation<UserDTO>> constraintViolations =
        validator.validate(sut);
    // then
    assertThat(constraintViolations).hasSize(1);
    assertThat(constraintViolations.iterator().next().getMessage())
        .isEqualTo("Password must be at least 6 characters long");
  }
}