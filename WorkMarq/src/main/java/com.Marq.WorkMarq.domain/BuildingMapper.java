package com.Marq.WorkMarq.domain;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface BuildingMapper {
	@Select("SELECT bName, bAbbrev, bAddress, bPhone, maxRooms FROM BUILDING")
	List<Building> getBuildingList();
	
	@Select("SELECT bName, bAbbrev, bAddress, bPhone, maxRooms FROM BUILDING where bName = #{bName}")
	Building getBuilding(Building building);
	
	@Update("update building set bAbbrev = #{bAbbrev}, bAddress = #{bAddress}, bPhone = #{bPhone}, maxRooms = #{maxRooms} where bName = #{bName}")
	void updateBuilding(Building building);
	
	@Insert("insert into building(bName, bAbbrev, bAddress, bPhone, maxRooms) values (#{bName}, #{bAbbrev}, #{bAddress}, #{bPhone}, #{maxRooms})")
	void insertBuilding(Building building);
}
