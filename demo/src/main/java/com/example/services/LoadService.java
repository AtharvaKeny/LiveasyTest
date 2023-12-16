package com.example.services;

import com.example.entities.*;
import com.example.repositories.LoadRepository;

import java.util.List;
import java.util.Optional;
import java.util.Date;


public interface LoadService{
	
	public Optional<Load> findByLoadId(Long loadId);
	public List<Load> findAllLoads();
	public List<Load> findByShipperId(Long shipperId);
	public Load addLoad(Load load);
	public void modifyLoad(Long loadId,Load load);
	public void removeLoad(Long loadId);
}
