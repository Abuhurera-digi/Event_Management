package com.digisprint.Event_Management1.Contoller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.digisprint.Event_Management1.Model.Company;
import com.digisprint.Event_Management1.Model.family;
import com.digisprint.Event_Management1.Service.CompanyService;
import com.digisprint.Event_Management1.Service.FamilyService;

@Controller
public class FamilyContoller {
	
	
	@Autowired
	FamilyService familyService;
	
	@PostMapping("/familyinsert")
	  public String Insert(HttpServletRequest
			  request, ModelMap modelMap) throws ParseException {
			  
			  
		 family family = new family();
		  String date2=request.getParameter("date_of_arrival");
			Date date12=new SimpleDateFormat("yyyy-MM-dd").parse(date2);
			family.setDate_of_arrival(date12);
		  if(familyService.availabality(date12)){
			  modelMap.addAttribute("error", "This Slot  is already booked, you can choose other date or venue");
				return "familyGettogether";
		  }
		  familyService.insert(request); System.out.println("inserted"); 
		  return  "familyRegister";
		  
		 
		  
		  
		  
		  }
			
			  
			  
			  
			  
	
	//cancel booked user
	  @RequestMapping(value="/family/cancleEvent/{id}",
			  method=RequestMethod.GET) public ModelAndView cancleBooked(@PathVariable("id")
			  int id) {
			  
			  familyService.deleteBookedEvent(id); 
			  System.out.println("Coming");
			  return new ModelAndView("/cancel-success");
			  
			  }


}
