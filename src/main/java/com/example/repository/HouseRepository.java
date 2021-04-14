package com.example.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.HouseModel;

@Repository
public interface HouseRepository extends CrudRepository<HouseModel, String>{

	List<HouseModel> findByType(String type);

}

