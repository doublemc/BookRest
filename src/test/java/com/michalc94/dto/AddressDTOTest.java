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
public class AddressDTOTest {

  private static final String EMPTY_STRING = "";
  private static final String VALID_STATE = "pomorskie";
  private static final String VALID_ZIPCODE = "80-870";
  private static final String VALID_CITY = "Gdansk";
  private static final String VALID_STREET = "Reja";

  private static Validator validator;
  private AddressDTO sut;

  @BeforeClass
  public static void validatorSetUp() {
    ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
    validator = factory.getValidator();
  }

  @Before
  public void sutSetUp() {
    sut = new AddressDTO(VALID_STATE, VALID_ZIPCODE, VALID_CITY, VALID_STREET);
  }

  @Test
  public void shouldAcceptAllValidArguments() {
    // when
    Set<ConstraintViolation<AddressDTO>> constraintViolations =
        validator.validate(sut);
    // then
    assertThat(constraintViolations).hasSize(0);
  }

  @Test
  public void shouldAcceptEmptyState() {
    // given
    sut.setState(EMPTY_STRING);

    // when
    Set<ConstraintViolation<AddressDTO>> constraintViolations =
        validator.validate(sut);
    // then
    assertThat(constraintViolations).hasSize(0);
  }

  @Test
  public void shouldNotAcceptEmptyZipCode() {
    // given
    sut.setZipCode(EMPTY_STRING);
    // when
    Set<ConstraintViolation<AddressDTO>> constraintViolations =
        validator.validate(sut);
    // then
    assertThat(constraintViolations).hasSize(1);
    assertThat(constraintViolations.iterator().next().getMessage())
        .isEqualTo("Zip code cannot be empty");
  }

  @Test
  public void shouldNotAcceptEmptyCity() {
    // given
    sut.setCity(EMPTY_STRING);
    // when
    Set<ConstraintViolation<AddressDTO>> constraintViolations =
        validator.validate(sut);
    // then
    assertThat(constraintViolations).hasSize(1);
    assertThat(constraintViolations.iterator().next().getMessage())
        .isEqualTo("City cannot be empty");
  }

  @Test
  public void shouldNotAcceptEmptyStreet() {
    // given
    sut.setStreet(EMPTY_STRING);
    // when
    Set<ConstraintViolation<AddressDTO>> constraintViolations =
        validator.validate(sut);
    // then
    assertThat(constraintViolations).hasSize(1);
    assertThat(constraintViolations.iterator().next().getMessage())
        .isEqualTo("Street cannot be empty");
  }
}