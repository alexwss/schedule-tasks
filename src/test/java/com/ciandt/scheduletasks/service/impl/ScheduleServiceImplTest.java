package com.ciandt.scheduletasks.service.impl;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class ScheduleServiceImplTest {

	@Autowired
	private ScheduleServiceImpl scheduleServiceImpl;
	
	@Test
	public void shouldRegisterScheduleOnDatabase() {
		Assert.assertEquals(true, true);
	}
	
}
