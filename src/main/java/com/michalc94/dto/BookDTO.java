package com.michalc94.dto;

import java.math.BigDecimal;
import javax.validation.constraints.Digits;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created by michalc94 on 01.03.17.
 */
public class BookDTO {

  // TODO: 01.03.17 Use more specified constraints
  @NotEmpty(message = "ISBN cannot be empty")
  private String isbn;
  @NotEmpty(message = "Title cannot be empty")
  private String title;
  @NotEmpty(message = "Author cannot be empty")
  private String author;
  @NotEmpty(message = "Genre cannot be empty")
  private String genre;
  private Short publicationYear;

  @Digits(integer = 6, fraction = 2, message = "Price must have at most 6 digits and 2 decimals")
  private BigDecimal price;

  public BookDTO(String isbn, String title, String author, String genre,
      String publicationYear, double price) {
    this.isbn = isbn;
    this.title = title;
    this.author = author;
    this.genre = genre;
    this.publicationYear = Short.valueOf(publicationYear);
    this.price = BigDecimal.valueOf(price);
  }

  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public Short getPublicationYear() {
    return publicationYear;
  }

  public void setPublicationYear(Short publicationYear) {
    this.publicationYear = publicationYear;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = BigDecimal.valueOf(price);
  }
}
