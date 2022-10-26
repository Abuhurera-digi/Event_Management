package com.digisprint.Event_Management1.Contoller;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
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
import org.springframework.web.servlet.ModelAndView;

import com.digisprint.Event_Management1.Model.Event;
import com.digisprint.Event_Management1.Repository.EventRepository;
import com.digisprint.Event_Management1.Service.EventService;

@Controller
public class EventContoller {
	@Autowired
	EventService eventService;
	
	@PostMapping("/event")
	  public ModelAndView detatils(HttpServletRequest request) throws ParseException {
			  ModelAndView modelAndView = new ModelAndView("event-added");
			  eventService.insert(request); 
			  System.out.println("inserted");
			  return modelAndView;	
	}
	/*
	 * @GetMapping("/Event") public ModelAndView listEmployee(ModelAndView model)
	 * throws IOException {
	 * 
	 * List<Event> Eventlist = eventService.getAllPen();
	 * model.addObject("Eventlist", Eventlist); model.setViewName("ViewEvents");
	 * 
	 * return model; }
	 */
	 @GetMapping("/Event")
     public String displayDoctor(ModelMap model) {
       
       
       return eventService.displayDoctor(model);
         
     }
	 
	  @RequestMapping(value="/admindeleteevent/{id}", method=RequestMethod.GET)
		 public ModelAndView delete(@PathVariable("id") int id) {
			 
		  eventService.deleteEvent(id);
		  return new ModelAndView("deletEvent");
		  
		 }
	  
	  @GetMapping("/deleteevent")
	  public String deleteEvent() {
		return "adminDeleteEvent";
		  
		  
	  }
	  
}
 
