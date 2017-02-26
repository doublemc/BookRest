package com.michalc94.domain.product;

/**
 * Created by michalc94 on 26.02.17.
 */

class Title {
  private String title;

  // jpa requirement
  public Title() {
  }

  public Title(String title) {
    this.title = title;
  }

  public String getTitle() {
    return title;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Title title1 = (Title) o;

    return title != null ? title.equals(title1.title) : title1.title == null;
  }

  @Override
  public int hashCode() {
    return title != null ? title.hashCode() : 0;
  }

  @Override
  public String toString() {
    return "Title{" +
        "title='" + title + '\'' +
        '}';
  }
}
