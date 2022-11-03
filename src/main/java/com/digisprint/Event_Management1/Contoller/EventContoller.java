package com.digisprint.Event_Management1.Contoller;


import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.digisprint.Event_Management1.Model.Admin;
import com.digisprint.Event_Management1.Model.Event;
import com.digisprint.Event_Management1.Model.User;
import com.digisprint.Event_Management1.Model.birthday;
import com.digisprint.Event_Management1.Repository.EventRepository;
import com.digisprint.Event_Management1.Service.EventService;

@RestController
public class EventContoller {
	Admin user;
	@Autowired
	EventService eventService;
	EventRepository eventRepository;



	public static String directory="D:\\socialmediapage\\digi-page\\src\\main\\resources\\static\\images";


	@PostMapping("/addEvent")
	public ModelAndView detatils(HttpServletRequest request, @RequestParam("photo") MultipartFile file, ModelMap map) throws  UnsupportedEncodingException, ParseException{

		eventService.insert(request,file,directory);
		ModelAndView modelAndView = new ModelAndView("ViewEvents");
		return modelAndView;	
	}

	@GetMapping("/Event")
	public ModelAndView displayEvent(ModelMap model) {


		return eventService.displayEvent(model);

	}

	@GetMapping("/Event1")
	public ModelAndView displayEvent1(ModelMap model) {


		return eventService.displayEvent1(model);

	}


	//delete
	@RequestMapping(value="/event/deleteEvent/{id}", method=RequestMethod.GET)
	public ModelAndView delete(@PathVariable("id") int id) {

		eventService.deleteEvent(id);
		System.out.println("Coming");
		return new ModelAndView("/ViewEvents");

	}

	//updating



	@RequestMapping(value=" /event/editFundraiser/{id}",
			method=RequestMethod.GET)
	public ModelAndView editStudent(@PathVariable int
			event_id) {
		ModelAndView model = new ModelAndView("/ViewEvents");

		Event event = eventService.getEventById(event_id);
		model.addObject("studentForm", event);
		model.getModel();
		model.setViewName("/addEvents");

		return model; }


	//search
	@PostMapping("/searchfriend")
	public ModelAndView searchEvent(ModelMap map,HttpServletRequest request) throws UnsupportedEncodingException
	{
		ModelAndView mv= new ModelAndView("afterSearch");
		String name=request.getParameter("eventname");
		//	System.out.println(name);
		Event event=eventService.getdatabyname(name);
		map.put("event_data", event);

		System.out.println(event);
		return mv;
	}

	//// now doing

	@RequestMapping(value="/editEvent", method=RequestMethod.GET)
	public ModelAndView viewAll(@RequestParam("id") int id,ModelMap map) 
	{

		System.out.println("coming inside");
		ModelAndView modelAndView=new ModelAndView("/addEvents");
		System.out.println("come");
		Event list=eventService.userdatafetching(id);
		map.put("userdata", list);
		System.out.println(list);

		return modelAndView;
	}

	@PostMapping("/updateUser")
	public ModelAndView updatetable(HttpServletRequest request,ModelMap map) throws ParseException {
		ModelAndView modelAndView=new ModelAndView("/ViewEvents");
		Event event= eventService.userupdate(request);
		map.put("user", event);
		System.out.println(event);
		return modelAndView;
	}

}