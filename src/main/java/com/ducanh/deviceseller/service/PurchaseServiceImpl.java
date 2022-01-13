package com.ducanh.deviceseller.service;

import com.ducanh.deviceseller.model.Purchase;
import com.ducanh.deviceseller.repository.PurchaseRepository;
import com.ducanh.deviceseller.repository.projection.PurchaseItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class PurchaseServiceImpl implements PurchaseService {
    @Autowired
    private PurchaseRepository purchaseRepository;

    @Override
    public Purchase savePurchase(Purchase purchase) {
        purchase.setPurchaseTime(LocalDateTime.now());
        return purchaseRepository.save(purchase);
    }

    @Override
    public List<PurchaseItem> findPurchaseItemOfUser(Long userId) {
        return purchaseRepository.findAllPurchaseOfUser(userId);
    }

}
