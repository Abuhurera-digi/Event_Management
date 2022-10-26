package com.digisprint.Event_Management1.Contoller;

import java.text.ParseException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.digisprint.Event_Management1.Service.CompanyService;
import com.digisprint.Event_Management1.Service.FamilyService;

@Controller
public class FamilyContoller {
	
	
	@Autowired
	FamilyService familyService;
	
	@PostMapping("/familyinsert")
	  public ModelAndView value1(HttpServletRequest
			  request) throws ParseException {
			  
			  ModelAndView modelAndView = new ModelAndView("familyRegister");
			  
			  
			  familyService.insert(request); System.out.println("inserted"); 
			  return  modelAndView;
			  
			  
			  
			  }

}