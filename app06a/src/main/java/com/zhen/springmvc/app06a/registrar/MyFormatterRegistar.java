package com.zhen.springmvc.app06a.registrar;

import org.springframework.format.FormatterRegistrar;
import org.springframework.format.FormatterRegistry;

import com.zhen.springmvc.app06a.formatter.DateFormatter;

/**
 * 
* @ClassName: MyFormatterRegistar 
* @Description: 使用FormatterRegistrar注册Formatter
* @author zhen
* @date 2017年2月7日 下午4:28:56 
*
 */
public class MyFormatterRegistar implements FormatterRegistrar {

	private String datePattern;
	
	public MyFormatterRegistar(String datePattern) {
		this.datePattern = datePattern;
	}

	@Override
	public void registerFormatters(FormatterRegistry registry) {
		registry.addFormatter(new DateFormatter(datePattern));
	}

}
