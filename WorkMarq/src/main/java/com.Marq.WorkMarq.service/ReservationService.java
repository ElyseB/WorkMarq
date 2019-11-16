package com.Marq.WorkMarq.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Marq.WorkMarq.dao.ReservationDAO;
import com.Marq.WorkMarq.domain.Reservation;

@Component
public class ReservationService {
	
	@Autowired
	ReservationDAO reservationDAO;
	
	public ReservationService() {
		
	}
	public List<Reservation> getReservationList(){
		List<Reservation> reservationList = new ArrayList<Reservation>();
		reservationList = reservationDAO.getReservationList();
		return reservationList;
	}
	public void insertReservation(Reservation reservation) {
		reservationDAO.insertReservation(reservation);
	}
	public Reservation getReservation(Reservation reservation) {
		return reservationDAO.getReservation(reservation);
	}
	public void updateReservation(Reservation reservation) {
		reservationDAO.updateReservation(reservation);
	}
}
