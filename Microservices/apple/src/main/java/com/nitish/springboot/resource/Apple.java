package com.nitish.springboot.resource;

import com.nitish.springboot.model.Device;
import com.nitish.springboot.model.Devices;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/apple")
public class Apple {

    @RequestMapping("/devices")
    public Devices getDevices(){
        List<Device> devices = new ArrayList<>();
        devices.add(new Device("iphone 14 pro max","Smartphoe"));
        devices.add(new Device("ipad Air","Tablet"));
        devices.add(new Device("Apple watch series 6","smart watch"));
        Devices devicesList = new Devices(devices);
        return devicesList;
    }

}
