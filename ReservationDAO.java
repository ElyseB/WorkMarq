package com.example.demo.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.domain.Reservation;
import com.example.demo.domain.ReservationMapper;

@Component
public class ReservationDAO {

	@Autowired
	ReservationMapper reservationMapper;
	
	public ReservationDAO() {
		
	}
	public List<Reservation> getReservatuibList(){
		List<Reservation> reservationList = new ArrayList<Reservation>();
		reservationList = reservationMapper.getReservationList();
		return reservationList;
	}
	public void insertReservation(Reservation reservation) {
		reservationMapper.insertReservation(reservation);
	}
	public Reservation getReservation(Reservation reservation) {
		return reservationMapper.getReservation(reservation);
	}
	public void updateReservation(Reservation reservation) {
		reservationMapper.updateReservation(reservation);
	}
}
