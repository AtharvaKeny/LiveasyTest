package com.example.repositories;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.entities.Load;
import com.example.entities.Shipper;

@Repository
public interface LoadRepository extends JpaRepository<Load, Long>{

		List<Load> findByShipper(Shipper shipper);
	 
    
    // Custom query to update a Load by its ID
//    @Modifying
//    @Query("UPDATE Load l SET l = :updatedLoad Load WHERE l.load_id = :loadId")
//    void updateLoadById(Long loadId, Load updatedLoad);
}
