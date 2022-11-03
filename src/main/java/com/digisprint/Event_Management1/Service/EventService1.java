package com.digisprint.Event_Management1.Service;

import java.text.ParseException;

import javax.servlet.http.HttpServletRequest;

import com.digisprint.Event_Management1.Model.Event;

public interface EventService1 
{
	public Event getEventById(int id);
	public void deleteEvent(int id);
	public void addStudent(Event student);
	public Event userupdate(HttpServletRequest request) throws ParseException;


}
