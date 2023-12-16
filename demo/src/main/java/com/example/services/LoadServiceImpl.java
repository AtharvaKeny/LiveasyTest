package com.example.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Load;
import com.example.entities.Shipper;
import com.example.repositories.LoadRepository;

@Service
public class LoadServiceImpl implements LoadService{

	@Autowired
	LoadRepository repo;
	
	@Override
	public Optional<Load> findByLoadId(Long loadId) {
		return repo.findById(loadId);
	}

	@Override
	public List<Load> findByShipperId(Shipper shipper) {
		return repo.findByShipper(shipper);
	}

	@Override
	public List<Load> findAllLoads() {
		return repo.findAll();
	}

	@Override
	public Load addLoad(Load load) {
		return repo.save(load);
	}

	@Override
	public void modifyLoad(Long loadId,Load load) {
		Optional<Load> oLoad=repo.findById(loadId);
		Load oldLoad = oLoad.get();
		
		if (load.getDate() != null) {
	        oldLoad.setDate(load.getDate());
	    }

	    if (load.getLoadingPoint() != null) {
	        oldLoad.setLoadingPoint(load.getLoadingPoint());
	    }

	    if (load.getComment() != null) {
	        oldLoad.setComment(load.getComment());
	    }

	    // Repeat this pattern for each field...

	    // If you are using Java 14 or later, you can use the concise way:
	    // oldLoad.setNoOfTrucks(load.getNoOfTrucks());
	    if (load.getNoOfTrucks() != null) {
	        oldLoad.setNoOfTrucks(load.getNoOfTrucks());
	    }

	    if (load.getProductType() != null) {
	        oldLoad.setProductType(load.getProductType());
	    }

	    if (load.getshipper() != null) {
	        oldLoad.setshipper(load.getshipper());
	    }

	    if (load.getTruckType() != null) {
	        oldLoad.setTruckType(load.getTruckType());
	    }

	    if (load.getUnloadingPoint() != null) {
	        oldLoad.setUnloadingPoint(load.getUnloadingPoint());
	    }

	    if (load.getWeight() != null) {
	        oldLoad.setWeight(load.getWeight());
	    }
		
		repo.save(oldLoad);
	}

	@Override
	public void removeLoad(Long loadId) {
		repo.deleteById(loadId);
	}
	
	
	

}
