package com.kiddcorp.repository;

import org.springframework.data.repository.CrudRepository;

import com.kiddcorp.domain.Customer;

public interface CustomersRepository extends CrudRepository<Customer, Long> {

}
