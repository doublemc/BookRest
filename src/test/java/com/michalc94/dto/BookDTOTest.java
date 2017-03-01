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
public class BookDTOTest {

  private static final String EMPTY_STRING = "";
  private static final String VALID_ISBN = "913-22222-144-2";
  private static final String VALID_TITLE = "Game of Thrones";
  private static final String VALID_GENRE = "fantasy";
  private static final String VALID_AUTHOR = "George Martin";
  private static final String ANY_PUBLICATION_YEAR = "2001";
  private static final double INVALID_PRICE = 10.1234124;
  private static final double VALID_PRICE = 10;

  private static Validator validator;
  private BookDTO sut;

  @BeforeClass
  public static void validatorSetUp() {
    ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
    validator = factory.getValidator();
  }

  @Before
  public void sutSetUp() {
    sut = new BookDTO(VALID_ISBN, VALID_TITLE, VALID_AUTHOR, VALID_GENRE, ANY_PUBLICATION_YEAR,
        VALID_PRICE);
  }

  @Test
  public void shouldAcceptAllValidArguments() {
    // when
    Set<ConstraintViolation<BookDTO>> constraintViolations =
        validator.validate(sut);
    // then
    assertThat(constraintViolations).hasSize(0);
  }

  @Test
  public void shouldNotAcceptEmptyIsbn() {
    // given
    sut.setIsbn(EMPTY_STRING);
    // when
    Set<ConstraintViolation<BookDTO>> constraintViolations =
        validator.validate(sut);
    // then
    assertThat(constraintViolations).hasSize(1);
    assertThat(constraintViolations.iterator().next().getMessage())
        .isEqualTo("ISBN cannot be empty");
  }

  @Test
  public void shouldNotAcceptEmptyTitle() {
    // given
    sut.setTitle(EMPTY_STRING);
    // when
    Set<ConstraintViolation<BookDTO>> constraintViolations =
        validator.validate(sut);
    // then
    assertThat(constraintViolations).hasSize(1);
    assertThat(constraintViolations.iterator().next().getMessage())
        .isEqualTo("Title cannot be empty");
  }

  @Test
  public void shouldNotAcceptEmptyAuthor() {
    // given
    sut.setAuthor(EMPTY_STRING);
    // when
    Set<ConstraintViolation<BookDTO>> constraintViolations =
        validator.validate(sut);
    // then
    assertThat(constraintViolations).hasSize(1);
    assertThat(constraintViolations.iterator().next().getMessage())
        .isEqualTo("Author cannot be empty");
  }

  @Test
  public void shouldNotAcceptInvalidPrice() {
    // given
    sut.setPrice(INVALID_PRICE);
    // when
    Set<ConstraintViolation<BookDTO>> constraintViolations =
        validator.validate(sut);
    // then
    assertThat(constraintViolations).hasSize(1);
    assertThat(constraintViolations.iterator().next().getMessage())
        .isEqualTo("Price must have at most 6 digits and 2 decimals");
  }
}