package com.michalc94.dto;

import java.math.BigDecimal;
import javax.validation.constraints.Digits;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created by michalc94 on 01.03.17.
 */
class BookDTO {

  @NotEmpty
  private String isbn;
  @NotEmpty
  private String title;
  @NotEmpty
  private String author;
  @NotEmpty
  private String genre;
  private Short publicationYear;

  @Digits(integer = 6, fraction = 2)
  private BigDecimal price;
}
