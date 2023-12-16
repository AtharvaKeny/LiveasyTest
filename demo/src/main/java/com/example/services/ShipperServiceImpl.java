package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Shipper;
import com.example.repositories.ShipperRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ShipperServiceImpl implements ShipperService{

    private final ShipperRepository shipperRepository;

    @Autowired
    public ShipperServiceImpl(ShipperRepository shipperRepository) {
        this.shipperRepository = shipperRepository;
    }

    public List<Shipper> getAllShippers() {
        return shipperRepository.findAll();
    }

    public Optional<Shipper> getShipperById(Long id) {
        return shipperRepository.findById(id);
    }

    public Shipper addShipper(Shipper shipper) {
        return shipperRepository.save(shipper);
    }

}