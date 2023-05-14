package com.nitish.java.samsung.resource;

import com.nitish.java.samsung.model.Device;
import com.nitish.java.samsung.model.Devices;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/samsung")
public class Samsung {

    @RequestMapping("/devices")
    public Devices getDevices(){
        List<Device> devices = new ArrayList<>();
        devices.add(new Device("Galaxy 22","Smartphoe"));
        devices.add(new Device("Tab A8","Tablet"));
        devices.add(new Device("watch series 4","smart watch"));
        Devices devicesList = new Devices(devices);
        return devicesList;
    }

}
