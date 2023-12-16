package com.example.services;

import java.util.List;
import java.util.Optional;

import com.example.entities.Shipper;

public interface ShipperService {

	public List<Shipper> getAllShippers();
	public Optional<Shipper> getShipperById(Long id);
	public Shipper addShipper(Shipper shipper);
}
