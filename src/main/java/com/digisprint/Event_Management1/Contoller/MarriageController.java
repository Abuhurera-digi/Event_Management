package com.digisprint.Event_Management1.Contoller;

import java.sql.Date;
import java.text.ParseException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.digisprint.Event_Management1.Model.Marriage;
import com.digisprint.Event_Management1.Service.MarriageService;
import com.digisprint.Event_Management1.Service.UserService;

@Controller
public class MarriageController {



	@Autowired
	MarriageService marriageService;


	@PostMapping("/marriagebook")
	public String value1(@RequestParam("venue") String venue,
			@RequestParam("date_of_arrival" ) Date date_of_arrival ,HttpServletRequest request,ModelMap modelMap) throws ParseException {



		if((marriageService.availabality(date_of_arrival,venue)))  {
			modelMap.addAttribute("error", "This Slot  is already booked, you can choose other date or venue");
			return "marriageparty ";
		}
		else {
			marriageService.insert(request);  
			return "marriageRegistersuccess";
		}
	} 





	//cancel Booked Event
	@RequestMapping(value="/marriage/cancleEvent/{phoneno}",
			method=RequestMethod.GET) public ModelAndView cancleBooked(@PathVariable("phoneno")
			String phoneno ) {

		marriageService.cancle1(phoneno); 
		return new ModelAndView("/cancel-success");

	}

	//cancel booked user
	@RequestMapping(value="/marri/cancleEvent/{id}",
			method=RequestMethod.GET) public ModelAndView cancleBooked(@PathVariable("id")
			int id) {

		marriageService.deleteBookedEvent(id); 
		return new ModelAndView("/cancel-success");
	}

}
