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
import org.springframework.web.servlet.ModelAndView;

import com.digisprint.Event_Management1.Model.Company;
import com.digisprint.Event_Management1.Service.CompanyService;
@Controller
public class CompanyController {


	@Autowired
	CompanyService companyService;

	@PostMapping("/companybook")
	public String Insert( ModelMap modelMap, HttpServletRequest request) throws ParseException {
		System.out.println("coming");
		Company company = new Company();
		String date2=request.getParameter("date_of_arrival");
		Date date12=new SimpleDateFormat("yyyy-MM-dd").parse(date2);
		company.setDate_of_arrival(date12);
		if(companyService.availabality(date12)){
			modelMap.addAttribute("error", "This Slot  is already booked, you can choose other date or venue");
			return "companyParty";
		}


		companyService.insert(request); System.out.println("inserted"); 
		return  "companyRegistersuccess";



	}


}