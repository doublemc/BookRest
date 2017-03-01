package com.michalc94.domain;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by michalc94 on 25.02.17.
 */
@Entity
@Table(name = "book")
public class Book {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "book_id", nullable = false, updatable = false, unique = true)
  private Long id;

  @Column(name = "isbn", unique = true, nullable = false)
  private String isbn;
  @Column(name = "title", unique = true, nullable = false)
  private String title;
  @Column(name = "author", nullable = false)
  private String author;
  @Column(name = "genre", nullable = false)
  private String genre;
  @Column(name = "publication_year")
  private Short publicationYear;
  @Column(name = "price", nullable = false)
  private BigDecimal price;

  // jpa requirement
  public Book() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
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

  public void setPrice(BigDecimal price) {
    this.price = price;
  }
}
