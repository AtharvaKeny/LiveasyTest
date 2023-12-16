package com.example.repositories;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.entities.Load;

@Repository
public interface LoadRepository extends JpaRepository<Load, Long>{
	
	List<Load> findByShipperId(Long shipperId);
	
	// Custom query to find loads by shipper ID
//    @Query("SELECT l FROM Load l WHERE l.shipper_Id = :shipperId")
//    List<Load> findAllByShipperIdCustomQuery(Long shipperId);
//    
//    // Custom query to update a Load by its ID
//    @Modifying
//    @Query("UPDATE Load l SET l = :updated Load WHERE l.load_id = :loadId")
//    void updateLoadById(Long loadId, Load updatedLoad);
}
