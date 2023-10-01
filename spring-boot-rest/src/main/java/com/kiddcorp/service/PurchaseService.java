package com.kiddcorp.service;

import com.kiddcorp.domain.Purchase;

public interface PurchaseService {
	public void savePurchase(Purchase purchase);
	public Iterable<Purchase> findAllPurchases();
	public Purchase findPurchaseById(long id);
}
