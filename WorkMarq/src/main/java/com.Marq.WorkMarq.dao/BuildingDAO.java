package com.Marq.WorkMarq.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Marq.WorkMarq.domain.Building;
import com.Marq.WorkMarq.domain.BuildingMapper;

@Component
public class BuildingDAO {

	@Autowired
	BuildingMapper buildingMapper;
	
	public BuildingDAO() {
		
	}
	public List<Building> getBuildingList(){
		List<Building> buildingList = new ArrayList<Building>();
		buildingList = buildingMapper.getBuildingList();
		return buildingList;
	}
	public void insertBuilding(Building building) {
		buildingMapper.insertBuilding(building);
	}
	public Building getBuilding(Building building) {
		return buildingMapper.getBuilding(building);
	}
	public void updateBuilding(Building building) {
		buildingMapper.updateBuilding(building);
	}
}
