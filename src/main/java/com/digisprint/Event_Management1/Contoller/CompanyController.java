package com.digisprint.Event_Management1.Contoller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.digisprint.Event_Management1.Model.Company;
import com.digisprint.Event_Management1.Service.CompanyService;
@RestController
public class CompanyController {


	@Autowired
	CompanyService companyService;

	@PostMapping("/companybook")
	public ModelAndView Insert( ModelMap modelMap, HttpServletRequest request) throws ParseException {
		Company company = new Company();
		String date2=request.getParameter("date_of_arrival");
		Date date12=new SimpleDateFormat("yyyy-MM-dd").parse(date2);
		company.setDate_of_arrival(date12);
		if(companyService.availabality(date12)){
			ModelAndView modelAndView= new ModelAndView("companyParty");
			modelMap.addAttribute("error", "This Slot  is already booked, you can choose other date or venue");
			return modelAndView;
		}

		ModelAndView View= new ModelAndView("companyRegistersuccess");
		companyService.insert(request);  
		return  View;



	}


}