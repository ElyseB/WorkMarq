package com.Marq.WorkMarq.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Marq.WorkMarq.domain.Timeoff;
import com.Marq.WorkMarq.domain.TimeoffMapper;

@Component
public class TimeoffDAO {

	@Autowired
	TimeoffMapper timeoffMapper;
	
	public TimeoffDAO() {
		
	}
	public List<Timeoff> getTimeoffList(){
		List<Timeoff> timeoffList = new ArrayList<Timeoff>();
		timeoffList = timeoffMapper.getTimeoffList();
		return timeoffList;
	}
	public void insertTimeoff(Timeoff timeoff) {
		timeoffMapper.insertTimeoff(timeoff);
	}
	public Timeoff getTimeoff(Timeoff timeoff) {
		return timeoffMapper.getTimeoff(timeoff);
	}
	public void updateTimeoff(Timeoff timeoff) {
		timeoffMapper.updateTimeoff(timeoff);
	}
	
	public List<Timeoff> getMyTimeoffList(){
		List<Timeoff> myTimeoffList = new ArrayList<Timeoff>();
		myTimeoffList = timeoffMapper.getMyTimeoffList();
		return myTimeoffList;
	}
	public Timeoff getMyTimeoff(Timeoff timeoff) {
		return timeoffMapper.getMyTimeoff(timeoff);
	}
}
