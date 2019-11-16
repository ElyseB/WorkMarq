package com.Marq.WorkMarq.domain;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface ReservationMapper {
	@Select("SELECT reservNum, orgName, contactName, contactPhone, occupies, reservStart, reservEnd, roomsNeeded FROM RESERVATION")
	List<Reservation> getReservationList();
	
	@Select("SELECT reservNum, orgName, contactName, contactPhone, occupies, reservStart, reservEnd, roomsNeeded FROM RESERVATION where reservNum = #{reservNum}")
	Reservation getReservation(Reservation reservation);
	
	@Update("update reservation set reservNum = #{reservNum}, orgName = #{orgName}, contactName = #{contactName}, contactPhone = #{contactPhone}, occupies = #{occupies}, reservStart = #{reservStart}, reservEnd = #{reservEnd} where reservNum = #{reservNum}")
	void updateReservation(Reservation reservation);
	
	@Insert("insert into reservation(reservNum, orgName, contactName, contactPhone, occupies, reservStart, reservEnd, roomsNeeded) values (#{reservNum}, #{orgName}, #{contactName}, #{contactPhone}, #{occupies}, #{reservStart}, #{reservEnd}, #{roomsNeeded})")
	void insertReservation(Reservation reservation);
}
