package com.digisprint.Event_Management1.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestParam;

import com.digisprint.Event_Management1.EventManagement1Application;
import com.digisprint.Event_Management1.Model.Event;
import com.digisprint.Event_Management1.Model.Marriage;
import com.digisprint.Event_Management1.Model.User;
import com.digisprint.Event_Management1.Repository.EventRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service

public class EventService implements EventService1 {

	
	@Autowired
	  EventRepository eventRepository;
	

	

	public void insert(HttpServletRequest request) throws ParseException {
		Event event = new Event();
		
		  int id=Integer.parseInt(request.getParameter("event_id"));
		  event.setEvent_id(id);
		 
		event.setEvent_name(request.getParameter("event_name"));
		event.setEvent_venue(request.getParameter("event_venue"));

		String date2=request.getParameter("event_date");

		Date date12=new SimpleDateFormat("yyyy-MM-dd").parse(date2);

		event.setEvent_date(date12);


		/*
		 * String date=request.getParameter("start_time");
		 * 
		 * Date date1=new SimpleDateFormat(" HH:mm:ss ").parse(date);
		 * 
		 * event.setStart_time(date1);
		 * 
		 * String date4=request.getParameter("end_time");
		 * 
		 * Date date13=new SimpleDateFormat(" HH:mm:ss ").parse(date4);
		 * 
		 * event.setEnd_time(date13);
		 */
		
		event.setStart_time(request.getParameter("start_time"));
		event.setEnd_time(request.getParameter("end_time"));
		event.setDescription(request.getParameter("description"));
		event.setEvent_guest(request.getParameter("event_guest"));




		event.setPhoto(request.getParameter("photo"));





		this.eventRepository.save(event); 
		
	}

	//deleting 
	@Override
	public void deleteEvent(int id) {
		eventRepository.deleteById(id);
	}
	
	
		
	
	//fectching
	public String displayEvent(ModelMap model) {
	    // TODO Auto-generated method stub
	      List<Event> list =new ArrayList<Event>();
	     eventRepository.findAll().forEach(i->list.add(i));
	     model.addAttribute("result", list);
	    
	     return "ViewEvents";
	}
	
	public String displayEvent1(ModelMap model) {
	    // TODO Auto-generated method stub
	      List<Event> list =new ArrayList<Event>();
	     eventRepository.findAll().forEach(i->list.add(i));
	     model.addAttribute("result", list);
	    
	     return "userViewEvent";
	}
//updateing
	@Override
	public Event getEventById(int id) {
		return eventRepository.findById(id).get();
	}
	/*
	 * public Boolean availabality(HttpServletRequest request){
	 * 
	 * List<Event> list = new ArrayList<>(); String status="";
	 * eventRepository.findAll().forEach(x->list.add(x)); for(Event e:list) {
	 * if(e.getEvent_date().equals(request.getParameter("date_of_arrival"))) {
	 * return false; } break;
	 * 
	 * } return true; }
	 */

}