package com.michalc94.domain.product;

/**
 * Created by michalc94 on 26.02.17.
 */
class Isbn {
  private String isbn;

  // jpa requirement
  public Isbn() {
  }

  public Isbn(String isbn) {
    this.isbn = isbn;
  }

  public String getIsbn() {
    return isbn;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Isbn isbn1 = (Isbn) o;

    return isbn != null ? isbn.equals(isbn1.isbn) : isbn1.isbn == null;
  }

  @Override
  public int hashCode() {
    return isbn != null ? isbn.hashCode() : 0;
  }

  @Override
  public String toString() {
    return "Isbn{" +
        "isbn='" + isbn + '\'' +
        '}';
  }
}
