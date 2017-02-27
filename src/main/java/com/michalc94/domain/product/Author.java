package com.michalc94.domain.product;

/**
 * Created by michalc94 on 26.02.17.
 */

public class Author {
  private String author;

  // jpa requirement
  public Author() {
  }

  public Author(String author) {
    this.author = author;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Author author1 = (Author) o;

    return author != null ? author.equals(author1.author) : author1.author == null;
  }

  @Override
  public int hashCode() {
    return author != null ? author.hashCode() : 0;
  }

  @Override
  public String toString() {
    return "Author{" +
        "author='" + author + '\'' +
        '}';
  }
}
