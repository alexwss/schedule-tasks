package com.ciandt.scheduletasks.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciandt.scheduletasks.entity.ScheduleEntity;
import com.ciandt.scheduletasks.repository.ScheduleRepository;
import com.ciandt.scheduletasks.service.ScheduleService;

@Service
public class ScheduleServiceImpl implements ScheduleService{
	
	@Autowired
	private ScheduleRepository scheduleRepository;

	@Override
	public Integer createSchedule(ScheduleEntity schedule) {
		// TODO Auto-generated method stub
		return null;
	}



}
