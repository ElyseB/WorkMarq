package com.Marq.WorkMarq.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Marq.WorkMarq.dao.TimeoffDAO;
import com.Marq.WorkMarq.domain.Timeoff;

@Component
public class TimeoffService {
	
	@Autowired
	TimeoffDAO timeoffDAO;
	
	public TimeoffService() {
		
	}
	public List<Timeoff> getTimeoffList(){
		List<Timeoff> timeoffList = new ArrayList<Timeoff>();
		timeoffList = timeoffDAO.getTimeoffList();
		return timeoffList;
	}
	public List<Timeoff> getMyTimeoffList(){
		List<Timeoff> myTimeoffList = new ArrayList<Timeoff>();
		myTimeoffList = timeoffDAO.getMyTimeoffList();
		return myTimeoffList;
	}
	public void insertTimeoff(Timeoff timeoff) {
		timeoffDAO.insertTimeoff(timeoff);
	}
	public Timeoff getTimeoff(Timeoff timeoff) {
		return timeoffDAO.getTimeoff(timeoff);
	}
	public void updateTimeoff(Timeoff timeoff) {
		timeoffDAO.updateTimeoff(timeoff);
	}
}
