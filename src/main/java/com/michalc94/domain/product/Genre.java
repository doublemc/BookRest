package com.michalc94.domain.product;

/**
 * Created by michalc94 on 26.02.17.
 */

class Genre {
  private String genre;

  // jpa requirement
  public Genre() {
  }

  public Genre(String genre) {
    this.genre = genre;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Genre genre1 = (Genre) o;

    return genre != null ? genre.equals(genre1.genre) : genre1.genre == null;
  }

  @Override
  public int hashCode() {
    return genre != null ? genre.hashCode() : 0;
  }

  @Override
  public String toString() {
    return "Genre{" +
        "genre='" + genre + '\'' +
        '}';
  }
}
