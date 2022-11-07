package com.digisprint.Event_Management1.Contoller;
import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.digisprint.Event_Management1.Repository.birthdayRepository;
import com.digisprint.Event_Management1.Service.BirthdayService;
@RestController
@Configuration
@Component
public class BirthdayController {
	@Autowired
	BirthdayService birthdayService;
	@Autowired
	birthdayRepository birthdayRepository;

	@PostMapping("/birthBook")
	public ModelAndView insertDetails(@RequestParam("name_of_child") String name_of_child,
			@RequestParam("date_of_birth")  Date date_of_birth ,
			@RequestParam("venue") String venue,
			@RequestParam("date_of_arrival" ) Date date_of_arrival,
			@RequestParam("date_of_departure") Date date_of_departure,
			@RequestParam("decoration") String decoration ,
			@RequestParam("material") String material,
			@RequestParam("cake") String cake,
			@RequestParam("phoneno") String phoneno,
			ModelMap modelMap){ 

		if((birthdayService.availabality(date_of_arrival,venue)))  {
			ModelAndView modelAndView = new ModelAndView("birthdayparty");
			modelMap.addAttribute("error", "This Slot  is already booked, you can choose other date or venue");
			return modelAndView;
		}
		else {
			return	birthdayService.birthInsert( name_of_child, date_of_birth, venue, date_of_arrival, date_of_departure, decoration, material, cake, phoneno,modelMap);
		}
	}


	//cancel booked event
	@RequestMapping(value="/birthday/cancleEvent/{phoneno}",
			method=RequestMethod.GET) 
	public ModelAndView cancle(@PathVariable("phoneno") String phoneno) {
		birthdayService.cancle1(phoneno);
		return new ModelAndView("/cancel-success");

	}

	//cancel booked user
	@RequestMapping(value="/birth/cancleEvent/{b_id}",
			method=RequestMethod.GET)
	public ModelAndView cancleBooked(@PathVariable("b_id") int b_id) {

		birthdayService.deleteBookedEvent(b_id); 
		return new ModelAndView("/cancel-success");

	}

	@GetMapping("/ViewBookedUser")
	public ModelAndView getAll(ModelMap modelMap) {
		return birthdayService.data(modelMap);
	}
}
