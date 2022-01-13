package com.ducanh.deviceseller.repository.projection;

import com.ducanh.deviceseller.model.DeviceType;

import java.time.LocalDateTime;

public interface PurchaseItem {
    String getName();
    DeviceType getType();
    Double getPrice();
    String getColor();
    LocalDateTime getPurchaseTime();
}
