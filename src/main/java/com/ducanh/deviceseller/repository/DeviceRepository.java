package com.ducanh.deviceseller.repository;

import com.ducanh.deviceseller.model.Device;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceRepository
        extends JpaRepository<Device, Long> {

}
