package com.ciandt.scheduletasks.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ciandt.scheduletasks.delegate.impl.FirstImplApiDelegate;
import com.ciandt.scheduletasks.generated.api.SchedulesApi;
import com.ciandt.scheduletasks.generated.api.SchedulesApiDelegate;
import com.ciandt.scheduletasks.generated.model.Schedule;

import io.swagger.annotations.ApiParam;

@RestController
public class SchedulerController implements SchedulesApi{
	
	@Autowired
	private FirstImplApiDelegate firstImplApiDelegate;

	@Override
	public ResponseEntity<Void> createSchedule(
			@ApiParam(value = "Create an Schedule", required = true) @Valid @RequestBody Schedule body) {
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@Override
	public SchedulesApiDelegate getDelegate() {
		return this.firstImplApiDelegate;
	}
	
}
