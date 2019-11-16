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
public class TimeoffDAO {

	@Autowired
	TimeoffMapper timeoffMapper;
	
	public timeoffDAO() {
		
	}
	public List<Timeoff> getTimeoffList(){
		List<Timeoff> timeoffList = new ArrayList<Timeoff>();
		timeoffList = timeoffMapper.getTimeoffList();
		return timeoffList;
	}
	public void insertTimeoff(Timeoff timeoff) {
		reservationMapper.insertReservation(reservation);
	}
	public Timeoff getTimeoff(Timeoff timeoff) {
		return timeoffMapper.getTimeoff(timeoff);
	}
	public void updateTimeoff(Timeoff timeoff) {
		timeoffMapper.updateTimeoff(timeoff);
	}
}