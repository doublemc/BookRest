package com.michalc94.dao;

import com.michalc94.domain.Customer;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by michalc94 on 27.02.17.
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
