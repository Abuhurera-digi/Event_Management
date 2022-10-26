package com.digisprint.Event_Management1.Contoller;

import java.text.ParseException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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
     public String displayEvent(ModelMap model) {
       
       
       return eventService.displayEvent(model);
         
     }
	 
	 @GetMapping("/Event1")
     public String displayEvent1(ModelMap model) {
       
       
       return eventService.displayEvent1(model);
         
     }
	 
	 
	
	  @RequestMapping(value="event/deleteEvent/{event_id}", method=RequestMethod.GET)
		 public ModelAndView editStudent(@PathVariable int event_id) {
		 
		  
		   eventService.getEventById(event_id);
		 
		  
		   return new ModelAndView("redirect:/ViewEvents");
		 }
	  
}
 
