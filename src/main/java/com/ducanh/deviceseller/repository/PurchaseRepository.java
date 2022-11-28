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
            " u.name AS userName, d.name AS name, d.category AS type, p.price AS price, p.purchaseTime AS purchaseTime" +
            " FROM Purchase p LEFT JOIN Course d ON d.id =  p.courseId" +
            " LEFT JOIN User u ON u.id = p.userId" +
            " WHERE p.userId = :userId")
    List<PurchaseItem> findAllPurchaseOfUser(@Param("userId") Long userId);
}
