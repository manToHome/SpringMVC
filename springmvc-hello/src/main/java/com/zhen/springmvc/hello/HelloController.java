package com.zhen.springmvc.hello;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("msg", "Hello,Spring MVC!");
		modelAndView.setViewName("hello");
		return modelAndView;
	}

}
