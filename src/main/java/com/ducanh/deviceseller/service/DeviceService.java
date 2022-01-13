package com.ducanh.deviceseller.service;

import com.ducanh.deviceseller.model.Device;

import java.util.List;

public interface DeviceService {
    Device saveDevice(Device device);

    void deleteDevice(Long id);

    List<Device> findAllDevices();
}
