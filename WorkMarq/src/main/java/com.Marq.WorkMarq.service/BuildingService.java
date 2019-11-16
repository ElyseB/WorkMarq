package com.Marq.WorkMarq.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Marq.WorkMarq.dao.BuildingDAO;
import com.Marq.WorkMarq.domain.Building;

@Component
public class BuildingService {
	
	@Autowired
	BuildingDAO buildingDAO;
	
	public BuildingService() {
		
	}
	public List<Building> getBuildingList(){
		List<Building> buildingList = new ArrayList<Building>();
		buildingList = buildingDAO.getBuildingList();
		return buildingList;
	}
	public void insertBuilding(Building building) {
		buildingDAO.insertBuilding(building);
	}
	public Building getBuilding(Building building) {
		return buildingDAO.getBuilding(building);
	}
	public void updateBuilding(Building building) {
		buildingDAO.updateBuilding(building);
	}
}
