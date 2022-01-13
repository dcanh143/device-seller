package com.ducanh.deviceseller.controller;

import com.ducanh.deviceseller.model.Device;
import com.ducanh.deviceseller.service.DeviceService;
import org.apache.coyote.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/device")
public class DeviceController {

    @Autowired
    private DeviceService deviceService;

    @RequestMapping(value = "", method = RequestMethod.POST)
    public ResponseEntity<?> saveDevice(@RequestBody Device device) {
        return new ResponseEntity<>(deviceService.saveDevice(device), HttpStatus.CREATED);
    }

    @RequestMapping(value = "{deviceId}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteDevice(@PathVariable Long deviceId) {
        deviceService.deleteDevice(deviceId);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity<?> getAllDevices() {
        return new ResponseEntity<>(deviceService.findAllDevices(), HttpStatus.OK);
    }

}
