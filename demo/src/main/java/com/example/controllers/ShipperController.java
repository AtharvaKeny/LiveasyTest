package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.entities.Shipper;
import com.example.services.ShipperService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/shippers")
public class ShipperController {

    private final ShipperService shipperService;

    @Autowired
    public ShipperController(ShipperService shipperService) {
        this.shipperService = shipperService;
    }

    @GetMapping
    public List<Shipper> getAllShippers() {
        return shipperService.getAllShippers();
    }

    @GetMapping("/{id}")
    public Optional<Shipper> getShipperById(@PathVariable Long id) {
        return shipperService.getShipperById(id);
    }

    @PostMapping
    public Shipper addShipper(@RequestBody Shipper shipper) {
        return shipperService.addShipper(shipper);
    }
}
