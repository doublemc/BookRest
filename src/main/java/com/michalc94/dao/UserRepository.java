package com.michalc94.dao;

import com.michalc94.domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by michalc94 on 27.02.17.
 */
public interface UserRepository extends CrudRepository<User, Long> {

}
