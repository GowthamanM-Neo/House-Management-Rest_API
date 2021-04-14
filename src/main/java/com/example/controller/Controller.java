package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.HouseModel;
import com.example.repository.HouseRepository;

@RestController
public class Controller {

	@Autowired 
	HouseRepository HouseRepo;
	
	//save a new house
	@PostMapping("/saveHouse")
	public void saveHouse(@RequestBody HouseModel house) {
		HouseRepo.save(house);
	}
	
	//get all the houses
	@GetMapping("/getAllHouse")
	public List<HouseModel> getAllHouse(){
		return (List<HouseModel>) HouseRepo.findAll();
	}
	
	
	//get a individual house by ID
	@GetMapping("/getHouse")
	public Optional<HouseModel> getHouse(@RequestParam(name="id") String id) {
		return HouseRepo.findById(id);
	}
	
	@GetMapping("/deleteHouse")
	public void deleteHouse(@RequestParam(name="id") String id) {
		HouseRepo.deleteById(id);
	}
	
	@GetMapping("/getByType")
	public List<HouseModel> getByType(@RequestParam(name="type") String type){
		return HouseRepo.findByType(type);
	}
}
