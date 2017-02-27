package com.michalc94.domain.product;

import static org.assertj.core.api.Assertions.assertThat;

import java.math.BigDecimal;
import java.time.Year;
import org.junit.Test;

/**
 * Created by michalc94 on 26.02.17.
 */
public class BookTest {

  private static final String ANY_AUTHOR = "George R. R. Martin";
  private static final String ANY_ISBN = "914-213145510";
  private static final String ANY_TITLE = "Game of Thrones";
  private static final String ANY_GENRE = "Fantasy";
  private static final Year ANY_PUBLICATION_YEAR = Year.of(2001);
  private static final BigDecimal ANY_PRICE = BigDecimal.valueOf(20);

  @Test
  public void shouldCreateBook_whenUsingConstructor() {
    // given
    Author anyAuthor = new Author(ANY_AUTHOR);
    Isbn anyIsbn = new Isbn(ANY_ISBN);
    Title anyTitle = new Title(ANY_TITLE);
    Genre anyGenre = new Genre(ANY_GENRE);

    // when
    Book book = new Book(new Isbn(ANY_ISBN), new Title(ANY_TITLE), new Author(ANY_AUTHOR),
        new Genre(ANY_GENRE), ANY_PUBLICATION_YEAR, ANY_PRICE);
    // then
    assertThat(book.getAuthor()).isEqualTo(anyAuthor);
    assertThat(book.getIsbn()).isEqualTo(anyIsbn);
    assertThat(book.getGenre()).isEqualTo(anyGenre);
    assertThat(book.getTitle()).isEqualTo(anyTitle);
    assertThat(book.getPrice()).isEqualTo(BigDecimal.valueOf(20));
    assertThat(book.getPublicationYear()).isEqualTo(Year.of(2001));
  }

}