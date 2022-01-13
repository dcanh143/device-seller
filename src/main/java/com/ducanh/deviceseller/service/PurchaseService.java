package com.ducanh.deviceseller.service;

import com.ducanh.deviceseller.model.Purchase;
import com.ducanh.deviceseller.repository.projection.PurchaseItem;

import java.util.List;

public interface PurchaseService {
    Purchase savePurchase(Purchase purchase);

    List<PurchaseItem> findPurchaseItemOfUser(Long userId);
}
