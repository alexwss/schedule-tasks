package com.ciandt.scheduletasks.delegate.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ciandt.scheduletasks.generated.api.SchedulesApiDelegate;

@Qualifier("FirstImplApiDelegate")
@Service
public class FirstImplApiDelegate implements SchedulesApiDelegate{

}
