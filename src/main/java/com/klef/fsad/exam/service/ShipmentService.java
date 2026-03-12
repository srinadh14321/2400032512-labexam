package com.klef.fsad.exam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.fsad.exam.model.Shipment;
import com.klef.fsad.exam.repository.ShipmentRepository;

@Service
public class ShipmentService {

    @Autowired
    ShipmentRepository repo;

    public Shipment addShipment(Shipment s) {
        return repo.save(s);
    }

    public Shipment updateShipment(Shipment s) {
        return repo.save(s);
    }
}