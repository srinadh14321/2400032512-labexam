package com.klef.fsad.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klef.fsad.exam.model.Shipment;
import com.klef.fsad.exam.service.ShipmentService;

@RestController
@RequestMapping("/shipment")
public class ShipmentController {

    @Autowired
    ShipmentService service;

    @PostMapping("/add")
    public Shipment addShipment(@RequestBody Shipment s) {
        return service.addShipment(s);
    }

    @PutMapping("/update")
    public Shipment updateShipment(@RequestBody Shipment s) {
        return service.updateShipment(s);
    }
}