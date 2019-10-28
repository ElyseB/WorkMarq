package com.example.demo.domain;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface BuildingMapper {
	@Select("SELECT bName, bAbbrev, bAddress, bPhone FROM BUILDING")
	List<Building> getBuildingList();
	
	@Select("SELECT bName, bAbbrev, bAddress, bPhone FROM BUILDING where bName = #{bName}")
	Building getBuilding(Building building);
	
	@Update("update building set bAbbrev = #{bAbbrev}, bAddress = #{bAddress}, bPhone = #{bPhone} where bName = #{bName}")
	void updateBuilding(Building building);
	
	@Insert("insert into building(bName, bAbbrev, bAddress, bPhone) values (#{bName}, #{bAbbrev}, #{bAddress}, #{bPhone})")
	void insertBuilding(Building building);
}
