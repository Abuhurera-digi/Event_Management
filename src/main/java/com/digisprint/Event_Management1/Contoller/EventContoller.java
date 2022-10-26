package com.digisprint.Event_Management1.Contoller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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

import com.digisprint.Event_Management1.Model.Company;
import com.digisprint.Event_Management1.Model.Event;
import com.digisprint.Event_Management1.Model.birthday;
import com.digisprint.Event_Management1.Repository.EventRepository;
import com.digisprint.Event_Management1.Service.EventService;

@Controller
public class EventContoller {
	@Autowired
	EventService eventService;
	 EventRepository eventRepository;
	
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
	 
	 
	//delete
	 @RequestMapping(value="/event/deleteEvent/{event_id}", method=RequestMethod.GET)
	 public ModelAndView delete(@PathVariable("event_id") int event_id) {
		 
	  eventService.deleteEvent(event_id);
	  System.out.println("Coming");
	  return new ModelAndView("/ViewEvents");
	  
	 }
	 
	 //updating
	 
	 
		
		  @RequestMapping(value="/event/editEvent/{event_id}",
		  method=RequestMethod.GET) public void insert(HttpServletRequest request) throws ParseException {
				Event event = new Event();
				int id=Integer.parseInt(request.getParameter("event_id"));
				event.setEvent_id(id);
				event.setEvent_name(request.getParameter("event_name"));
				event.setEvent_venue(request.getParameter("event_venue"));
				
				String date21=request.getParameter("event_date"); 
				Date date123=new SimpleDateFormat("yyyy-MM-dd").parse(date21);
				event.setEvent_date(date123);
				event.setStart_time(request.getParameter("start_time"));
				event.setEnd_time(request.getParameter("end_time"));
				event.setDescription(request.getParameter("description"));
				event.setEvent_guest(request.getParameter("event_guest"));
				event.setPhoto(request.getParameter("photo"));


				
				this.eventRepository.save(event); }



		/*
		 * @RequestMapping(value="/event/editEvent/{event_id}",
		 * method=RequestMethod.GET) public String seedatils(HttpServletRequest
		 * request, @PathVariable ("event_id") int event_id,
		 * 
		 * @RequestParam(required=false,value="event_name") String event_name,
		 * 
		 * @RequestParam(required=false,value="event_venue") String event_venue ,
		 * 
		 * @RequestParam(required=false,value="event_date") Date event_date,
		 * 
		 * @RequestParam(required=false,value="start_time" ) String start_time,
		 * 
		 * @RequestParam(required=false,value="end_time") String end_time,
		 * 
		 * @RequestParam(required=false,value="description") String description,
		 * 
		 * @RequestParam(required=false,value="event_guest") String event_guest,
		 * 
		 * @RequestParam(required=false,value="photo") String photo , ModelMap modelMap)
		 * { //Event event = new Event(); Event event=
		 * eventRepository.findById(event_id).get(); event.setEvent_name(event_name);
		 * event.setEvent_venue(event_venue); event.setEvent_date(event_date);
		 * event.setStart_time(start_time); event.setEnd_time(end_time);
		 * event.setDescription(description); event.setEvent_guest(event_guest);
		 * event.setPhoto(photo);
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * this.eventRepository.save(event);
		 * 
		 * 
		 * 
		 * modelMap.put("event_name",event_name ); modelMap.put("event_venue",
		 * event_venue); modelMap.put("event_date", event_date);
		 * modelMap.put("start_time", start_time); modelMap.put("end_time", end_time);
		 * 
		 * modelMap.put("description", description); modelMap.put("event_guest",
		 * event_guest); modelMap.put("photo", photo); return "ViewEvents";
		 * 
		 * }
		 * 
		 */
	
	 }
