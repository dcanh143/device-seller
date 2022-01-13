package com.ducanh.deviceseller.repository;

import com.ducanh.deviceseller.model.Purchase;
import com.ducanh.deviceseller.repository.projection.PurchaseItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PurchaseRepository
        extends JpaRepository<Purchase, Long> {
    @Query("SELECT" +
            " d.name AS name, d.deviceType AS type, p.price AS price, p.color AS color, p.purchaseTime AS purchaseTime" +
            " FROM Purchase p LEFT JOIN Device d ON d.id =  p.deviceId" +
            " WHERE p.userId = :userId")
    List<PurchaseItem> findAllPurchaseOfUser(@Param("userId") Long userId);
}
