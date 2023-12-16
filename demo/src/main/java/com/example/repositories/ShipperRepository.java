package com.example.repositories;


import com.example.entities.Shipper;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipperRepository extends JpaRepository<Shipper, Long> {
    // Custom queries can be added here if needed

    //Optional<Shipper> findById(Long id);
}
