package com.gcom.service.utils;

import java.util.Date;

import org.dozer.DozerConverter;
import org.joda.time.DateTime;
import org.springframework.stereotype.Service;

@Service("dateToDateTimeConverter")
public class DateToDateTimeConverter extends DozerConverter<Date, DateTime> {

	public DateToDateTimeConverter() {
		super(Date.class, DateTime.class);
	}

	@Override
	public Date convertFrom(DateTime arg0, Date arg1) {
		
		return arg0.toDate();
	}

	@Override
	public DateTime convertTo(Date arg0, DateTime arg1) {
		   DateTime returnArg = new DateTime(arg0);
		return returnArg;
	}

	

	

	

}
