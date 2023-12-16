package com.example.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Load;
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
	public List<Load> findByShipperId(Long shipperId) {
		return repo.findByShipperId(shipperId);
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
		repo.updateLoadById(loadId, load);
	}

	@Override
	public void removeLoad(Long loadId) {
		repo.deleteById(loadId);
	}
	
	
	

}
