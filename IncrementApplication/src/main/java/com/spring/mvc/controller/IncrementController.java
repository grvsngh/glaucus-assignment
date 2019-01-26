package com.spring.mvc.controller;

import com.spring.mvc.dao.IncrementDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class IncrementController {

	@Autowired
	IncrementDao dao;

	@RequestMapping(value= "/update", method= RequestMethod.POST)
	public ModelAndView updateNumber() {

		int number = dao.updateNumber();

		return new ModelAndView("index", "number", number);
	}
}