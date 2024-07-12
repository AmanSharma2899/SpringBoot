package com.train.service;

import java.util.List;

import com.train.entity.Railway;

public interface RailwayServices {
	void AddDetails(Railway rail);
	List<Railway> getAll();
	void removeRailway(Long id);
	void updateRailway(Railway  rail);
	List<Railway> SortRailway();
}
