package com.michalc94.dto;

import static org.assertj.core.api.Java6Assertions.assertThat;

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
public class CustomerDTOTest {

  private static final String EMPTY_STRING = "";
  private static final String VALID_FIRST_NAME = "Michal";
  private static final String VALID_LAST_NAME = "Dąb";
  private static final String VALID_PHONE_NUMBER = "+4851222222";

  private static Validator validator;
  private CustomerDTO sut;

  @BeforeClass
  public static void validatorSetUp() {
    ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
    validator = factory.getValidator();
  }

  @Before
  public void sutSetUp() {
    sut = new CustomerDTO(VALID_FIRST_NAME, VALID_LAST_NAME, VALID_PHONE_NUMBER);
  }

  @Test
  public void shouldAcceptAllValidParameters() {
    // when
    Set<ConstraintViolation<CustomerDTO>> constraintViolations =
        validator.validate(sut);
    // then
    assertThat(constraintViolations).hasSize(0);
  }

  @Test
  public void shouldNotAcceptEmptyFirstName() {
    // given
    sut.setFirstName(EMPTY_STRING);
    // when
    Set<ConstraintViolation<CustomerDTO>> constraintViolations =
        validator.validate(sut);
    // then
    assertThat(constraintViolations).hasSize(1);
    assertThat(constraintViolations.iterator().next().getMessage())
        .isEqualTo("First name cannot be empty");
  }


  @Test
  public void shouldNotAcceptEmptyLastName() {
    // given
    sut.setLastName(EMPTY_STRING);
    // when
    Set<ConstraintViolation<CustomerDTO>> constraintViolations =
        validator.validate(sut);
    // then
    assertThat(constraintViolations).hasSize(1);
    assertThat(constraintViolations.iterator().next().getMessage())
        .isEqualTo("Last name cannot be empty");
  }

  @Test
  public void shouldNotAcceptEmptyPhoneNumber() {
    // given
    sut.setPhoneNumber(EMPTY_STRING);
    // when
    Set<ConstraintViolation<CustomerDTO>> constraintViolations =
        validator.validate(sut);
    // then
    assertThat(constraintViolations).hasSize(1);
    assertThat(constraintViolations.iterator().next().getMessage())
        .isEqualTo("Phone number cannot be empty");
  }
}