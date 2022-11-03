package com.digisprint.Event_Management1.Service;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.digisprint.Event_Management1.EventManagement1Application;
import com.digisprint.Event_Management1.Model.Event;
import com.digisprint.Event_Management1.Model.Marriage;
import com.digisprint.Event_Management1.Model.User;
import com.digisprint.Event_Management1.Repository.EventRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service

public class EventService implements EventService1 {


	Event event;
	@Autowired
	EventRepository eventRepository;




	public void insert(HttpServletRequest request, MultipartFile file, String directory) throws ParseException {
		Event event = new Event();

		//		  int id=Integer.parseInt(request.getParameter("event_id"));
		//		  event.setEvent_id(id);

		Boolean status= false;
		event.setEventname(request.getParameter("eventname"));
		event.setEvent_venue(request.getParameter("event_venue"));

		String date2=request.getParameter("event_date");

		Date date12=new SimpleDateFormat("yyyy-MM-dd").parse(date2);

		event.setEvent_date(date12);


		event.setStart_time(request.getParameter("start_time"));
		event.setEnd_time(request.getParameter("end_time"));
		event.setDescription(request.getParameter("description"));
		event.setEvent_guest(request.getParameter("event_guest"));



		//event.setPhoto(request.getParameter("photo"));
		try {
			InputStream stream= file.getInputStream();
			byte[] buffer= new byte[stream.available()];
			stream.read(buffer);
			//   fos.write(buffer);
			event.setPhoto(buffer);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		List<Event> list= new ArrayList<>();
		eventRepository.findAll().forEach(e->list.add(e));
		for(Event event1:list) {
			if(!event1.getEvent_date().equals(date12))
			{
				status=true;
				break;   
			}
			break;
		}
		if(status)
		{
			this.eventRepository.save(event);
		}







	}



	//deleting 
	@Override
	public void deleteEvent(int id) {
		eventRepository.deleteById(id);
	}




	//fectching with image
	public ModelAndView displayEvent(ModelMap model) {
		// TODO Auto-generated method stub
		ModelAndView modelAndView = new ModelAndView("ViewEvents");
		List<Event> list =new ArrayList<Event>();
		eventRepository.findAll().forEach(i->list.add(i));
		for(Event x:list)
		{
			byte[] imgdata=x.getPhoto();
			if(imgdata!=null)
			{
				String base64EncodedImageBytes = Base64.getEncoder().encodeToString(imgdata);
				x.setBase64photo(base64EncodedImageBytes);
			}
		}
		model.addAttribute("result", list);

		return modelAndView;
	}


	public ModelAndView displayEvent1(ModelMap model) {
		// TODO Auto-generated method stub
		ModelAndView modelAndView = new ModelAndView("userViewEvent");
		List<Event> list =new ArrayList<Event>();
		eventRepository.findAll().forEach(i->list.add(i));
		model.addAttribute("result", list);

		return modelAndView;
	}
	//updateing
	//@Override
	public Event getEventById(int id) {
		return eventRepository.findById(id);
	}



	@Override
	public void addStudent(Event student) {
		eventRepository.save(student);
	}

	//images
	public List<Event> userpost(String eventname) throws UnsupportedEncodingException
	{
		List<Event> list= new ArrayList<>();
		eventRepository.findAllByEventname(eventname).forEach(x->list.add(x));
		for(Event x:list)
		{
			byte[] imgdata=x.getPhoto();
			if(imgdata!=null)
			{
				String base64EncodedImageBytes = Base64.getEncoder().encodeToString(imgdata);

				x.setBase64photo(eventname);
			}

		}

		return list;
	}
	public Event getdatabyname(String eventname)
	{
		Event event= eventRepository.findByEventname(eventname);
		return event;
	}

	//now doing update
	//@Override
	public Event userdatafetching(int id) {
		Event  event=eventRepository.findById(id);
		System.out.println(event);
		return event;

	}




	@Override
	public Event userupdate(HttpServletRequest request) throws ParseException {
		// TODO Auto-generated method stub


		Event  event= new Event();
		Event user1=eventRepository.findById(Integer.parseInt(request.getParameter("id")));
		event.setId(user1.getId());
		//	        int id = Integer.parseInt(request.getParameter("id"));
		//	        event.setId(id);
		event.setEventname(request.getParameter("eventname"));
		event.setEvent_venue(request.getParameter("event_venue"));
		String date=request.getParameter("event_date");
		Date date1=new SimpleDateFormat("yyyy-MM-dd").parse(date);  
		event.setEvent_date(date1);

		event.setStart_time(request.getParameter("start_time"));
		event.setEnd_time(request.getParameter("end_time"));
		event.setDescription(request.getParameter("description"));
		event.setEvent_guest(request.getParameter("event_guest"));
		byte[] imgdata=event.getPhoto();
		if(imgdata!=null)
		{
			String base64EncodedImageBytes = Base64.getEncoder().encodeToString(imgdata);

			event.setBase64photo(base64EncodedImageBytes);
		}


		this.eventRepository.save(event);
		return event;
	}
}