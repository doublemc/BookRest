package com.michalc94.domain.product;

import java.math.BigDecimal;
import java.time.Year;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by michalc94 on 25.02.17.
 */
@Entity
@Access(AccessType.FIELD) // so I can avoid using setters for fields that won't change
public class Book {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long bookId;

  @Embedded
  private Isbn isbn;
  @Embedded
  private Title title;
  @Embedded
  private Author author;
  @Embedded
  private Genre genre;
  private Year publicationYear;
  private BigDecimal price;

  // jpa requirement
  public Book() {
  }

  public Book(Isbn isbn, Title title, Author author, Genre genre, Year publicationYear,
      BigDecimal price) {
    this.isbn = isbn;
    this.title = title;
    this.author = author;
    this.genre = genre;
    this.publicationYear = publicationYear;
    this.price = price;
  }

  public Long getBookId() {
    return bookId;
  }

  public Isbn getIsbn() {
    return isbn;
  }

  public Title getTitle() {
    return title;
  }

  public Author getAuthor() {
    return author;
  }

  public Genre getGenre() {
    return genre;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public Year getPublicationYear() {
    return publicationYear;
  }

  // setter for price is needed because price of the book can change (discounts and so on)
  public void setPrice(BigDecimal price) {
    this.price = price;
  }

}
