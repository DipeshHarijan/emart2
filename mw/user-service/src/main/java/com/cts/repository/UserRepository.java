package com.cts.repository;

import org.springframework.data.repository.CrudRepository;

import com.cts.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
