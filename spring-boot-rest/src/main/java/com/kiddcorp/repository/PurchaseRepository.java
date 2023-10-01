package com.kiddcorp.repository;

import org.springframework.data.repository.CrudRepository;

import com.kiddcorp.domain.Purchase;

public interface PurchaseRepository extends CrudRepository<Purchase, Long> {

}
