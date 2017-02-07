package com.zhen.springmvc.app06a.converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.core.convert.converter.Converter;

public class StringToDateConverter implements Converter<String, Date> {
	
	private static final Log logger = LogFactory.getLog(StringToDateConverter.class);
	
	private String datePattern;
	
	public StringToDateConverter(String datePattern){
		this.datePattern = datePattern;
		logger.info("instantiating ... converter with pattern: * " + datePattern);
	}
	
	@Override
	public Date convert(String source) {
		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat(datePattern);
			dateFormat.setLenient(false);
			return dateFormat.parse(source);
		} catch (ParseException e) {
			throw new IllegalArgumentException("invalid date format. Please use this pattern" + datePattern);
		}
	}

}
