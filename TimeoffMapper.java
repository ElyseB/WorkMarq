package com.example.demo.domain;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface TimeoffMapper {
	@Select("SELECT empNum, startDate, endDate, totalHours, typeHoursUsed FROM TIMEOFF)
	List<Timeoff> getTimeoffList();
	
	@Select("SELECT empNum, startDate, endDate, totalHours, typeHoursUsed FROM TIMEOFF where empNum = #{empNum}")
	Timeoff getTimeoff(Timeoff timeoff);
	
	@Update("update timeoff set empNum = #{empNum}, startDate = #{startDate}, endDate = #{endDate}, totalHours = #{totalHours}, typeHoursUsed = #{typeHoursUsed} where empNum = #{empNum}")
	void updateTimeoff(Timeoff timeoff);
	
	@Insert("insert into timeoff(empNum, startDate, endDate, totalHours, typeHoursUsed) values (#{empNum}, #{startDate}, #{endDate}, #{totalHours}, #{typeHoursUsed})")
	void insertTimeoff(Timeoff timeoff);
}