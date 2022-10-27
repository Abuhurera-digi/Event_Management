package com.digisprint.Event_Management1.Service;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.digisprint.Event_Management1.Model.User;
import com.digisprint.Event_Management1.Model.birthday;
import com.digisprint.Event_Management1.Repository.birthdayRepository;
@Service
@Configuration
public class birthdayService {
	
	@Autowired
	birthdayRepository birthdayRepository;
	
	
	public void birthInsert(
			//@RequestParam("id")int id,
			@RequestParam("name_of_child") String name_of_child,
			@RequestParam("date_of_birth")  Date date_of_birth ,
			@RequestParam("venue") String venue,
			@RequestParam("date_of_arrival" ) Date date_of_arrival,
			@RequestParam("date_of_departure") Date date_of_departure,
			@RequestParam("Decoration") String Decoration,
			@RequestParam("material") String material,
			@RequestParam("cake") String cake
			, ModelMap modelMap)
	{
		birthday birthday=new birthday();
		//birthday.setId(id);
		birthday.setName_of_child(name_of_child);
		//Date Date = birthday.getDate_of_birth();
		birthday.setDate_of_birth(date_of_birth);
		birthday.setVenue(venue);
		
		birthday.setDate_of_arrival(date_of_arrival);
		birthday.setDate_of_departure(date_of_departure);
		birthday.setDecoration(Decoration);
		birthday.setMaterial(material);
		birthday.setCake(cake);
		
		
		
		
		this.birthdayRepository.save(birthday);
		
		
	//modelMap.put("id", id);
	modelMap.put("name_of_child",name_of_child );
	modelMap.put("date_of_birth", date_of_birth);
	modelMap.put("venue", venue);
	modelMap.put("date_of_arrival", date_of_arrival);
	modelMap.put("date_of_departure", date_of_departure);
	
	modelMap.put("Decoration", Decoration);
	modelMap.put("material", material);
	modelMap.put("cake", cake);
	
	}
	
	
	/*
	 * public void insert(HttpServletRequest request) throws ParseException {
	 * birthday birthday = new birthday();
	 * birthday.setId(request.getParameter("id"));
	 * birthday.setName_of_child(request.getParameter("name_of_child"));
	 * 
	 * String date=request.getParameter("date_of_birth"); Date date1=new
	 * SimpleDateFormat("yyyy-MM-dd").parse(date);
	 * 
	 * birthday.setDate_of_birth(date1);
	 * 
	 * birthday.setVenue(request.getParameter("venue"));
	 * 
	 * String date2=request.getParameter("date_of_arrival"); Date date12=new
	 * SimpleDateFormat("yyyy-MM-dd").parse(date2);
	 * 
	 * birthday.setDate_of_arrival(date12);
	 * 
	 * 
	 * String date21=request.getParameter("date_of_departure"); Date date123=new
	 * SimpleDateFormat("yyyy-MM-dd").parse(date21);
	 * 
	 * birthday.setDate_of_departure(date123);
	 * 
	 * 
	 * birthday.setDecoration(request.getParameter("Decoration"));
	 * birthday.setMaterial(request.getParameter("material"));
	 * birthday.setCake(request.getParameter("cake"));
	 * 
	 * 
	 * System.out.println(birthday.getDate_of_arrival());
	 * 
	 * this.birthdayRepository.save(birthday); }
	 */

	
	public void cancle(int id) {
				
		birthdayRepository.deleteById(id);
	  System.out.println("delete");
	}
  
}
