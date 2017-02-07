package com.zhen.springmvc.app06a.formatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.format.Formatter;

public class DateFormatter implements Formatter<Date> {
	
	private String datePattern;
	
	private SimpleDateFormat simpleDateFormat;
	
	public DateFormatter(String datePattern) {
		this.datePattern = datePattern;
		this.simpleDateFormat = new SimpleDateFormat(datePattern);
		simpleDateFormat.setLenient(false);
	}

	@Override
	public String print(Date date, Locale locale) {
		return simpleDateFormat.format(date);
	}

	@Override
	public Date parse(String text, Locale locale) throws ParseException {
		try {
			return simpleDateFormat.parse(text);
		} catch (ParseException e) {
			throw new IllegalArgumentException("invalid date format. Please use this pattern" + datePattern);
		}
	}

}
