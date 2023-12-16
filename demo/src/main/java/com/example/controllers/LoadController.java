package com.example.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.entities.Load;
import com.example.services.LoadService;

@RestController
@CrossOrigin("*")
public class LoadController {
	
	private final LoadService loadservice;

	@Autowired
	public LoadController(LoadService loadservice) {
		this.loadservice = loadservice;
	}
	
	@GetMapping("/loads")
	public ResponseEntity<List<Load>> getAllLoads(){
		List<Load> loads = loadservice.findAllLoads();
		return new ResponseEntity<>(loads,HttpStatus.OK);
	}
	
	@GetMapping("/load/{loadId}")
	public ResponseEntity<Load> getLoadById(@PathVariable Long id){
		Optional<Load> load = loadservice.findByLoadId(id);
		if(load.isPresent()) {
			return new ResponseEntity<>(load.get(),HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/load")
	public ResponseEntity<List<Load>> getLoadsByShipperId(@RequestParam Long shipperId){
		List<Load> loads = loadservice.findByShipperId(shipperId);
		return new ResponseEntity<>(loads,HttpStatus.OK);
	}
	
	@PostMapping("/load")
	public ResponseEntity<Load> createLoad(@RequestBody Load load){
		Load createdLoad = loadservice.addLoad(load);
		return new ResponseEntity<>(createdLoad,HttpStatus.CREATED);
	}
	
	@PutMapping("/load/{loadId}")
	public void updateLoadById(@PathVariable Long id,@RequestBody Load updatedLoad) {
		loadservice.modifyLoad(id, updatedLoad);
	}
	
	@DeleteMapping("/load/{loadId}")
	public ResponseEntity<Void> removeLoad(@PathVariable Long id) {
		loadservice.removeLoad(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
}
