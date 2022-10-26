package com.digisprint.Event_Management1.Contoller;

import java.text.ParseException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

import com.digisprint.Event_Management1.Model.Marriage;
import com.digisprint.Event_Management1.Service.MarriageService;
import com.digisprint.Event_Management1.Service.UserService;

@Controller
public class MarriageController {
	
	
	
	@Autowired
	MarriageService marriageService;
	
	
	  @PostMapping("/marriagebook") public ModelAndView value1(HttpServletRequest
	  request) throws ParseException {
	  
	  ModelAndView modelAndView = new ModelAndView("marriageRegistersuccess");
	  
	  
	  marriageService.insert(request); System.out.println("inserted"); return
	  modelAndView;
	  
	  
	  
	  }
	 
	
	/*
	 * @PostMapping("/marriagebook") public String addInsert(@RequestBody Marriage
	 * marriage) { // marriage= new Marriage(); marriageService.save(marriage);
	 * 
	 * return "marriageRegistersuccess";
	 * 
	 * }
	 */
}
