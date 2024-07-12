package com.train.service;

import java.util.Comparator;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.train.entity.Railway;
import com.train.repository.RailwayRepository;

@Service
@Transactional
public class RailwayServiceImpl implements RailwayServices{

	@Autowired
	private RailwayRepository repo;
	@Override
	public void AddDetails(Railway rail){		
		 repo.save(rail);
	}
	@Override
	public List<Railway> getAll() {
		return repo.findAll();
		
	}
	@Override
	public void removeRailway(Long id) {
		repo.deleteById(id);
		
	}
	
	@Override
	public void updateRailway(Railway rail)
	{
		  repo.save(rail);
	}

	@Override
	public List<Railway> SortRailway()
	{
	    List<Railway> rail = getAll();
	    rail.sort(Comparator.comparing(r -> r.getCategory().name()));
		return rail;
		
	}

	
	
}
