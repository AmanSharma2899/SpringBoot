package com.train.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.train.entity.Railway;
import com.train.service.RailwayServices;



@RestController
@RequestMapping("railway")
public class RailwayController {
	@Autowired
	private RailwayServices service;
	
	@PostMapping
	public String AddRailway(@RequestBody Railway rail) {
		System.out.println("added data");
		service.AddDetails(rail);
		
		return "data added successfully";
		
	}
	@GetMapping
	public List<Railway>getAll()
	{
		return service.getAll();
	}
	
	@DeleteMapping("/{id}")
	public String deleteRailway(@PathVariable Long id)
	{
		service.removeRailway(id);
		return "Railway removed!!!";
				
		
	}
	
	@PatchMapping
	public String update(@RequestBody Railway rail)
	{
		service.updateRailway(rail);
		return "Railway Updated...";
	}
	
	@GetMapping("/sort")
	public List<Railway> SortRailway()
	{
		
	return	service.SortRailway();
		
	}
 
	
}
