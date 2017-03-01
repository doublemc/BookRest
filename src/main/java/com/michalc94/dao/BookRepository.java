package com.michalc94.dao;

import com.michalc94.domain.Book;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by michalc94 on 27.02.17.
 */
public interface BookRepository extends PagingAndSortingRepository<Book, Long> {

}
