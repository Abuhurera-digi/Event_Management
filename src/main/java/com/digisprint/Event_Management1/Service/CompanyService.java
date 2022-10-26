package com.digisprint.Event_Management1.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digisprint.Event_Management1.Model.Company;
import com.digisprint.Event_Management1.Model.Marriage;
import com.digisprint.Event_Management1.Repository.ComapnyRepository;

@Service
public class CompanyService {

	@Autowired
	ComapnyRepository comapnyRepository;
	
	
	
	public void insert(HttpServletRequest request) throws ParseException {
		Company company = new Company();
		int id=Integer.parseInt(request.getParameter("userid"));
		company.setUserid(id);
		company.setOrganization_name(request.getParameter("organization_name"));
		company.setOrganizer_name(request.getParameter("organizer_name"));
		
		
		int no_of_attendees=Integer.parseInt(request.getParameter("no_of_attendees"));
		company.setNo_of_attendees(no_of_attendees);
		int no_of_rooms= Integer.parseInt(request.getParameter("no_of_rooms"));
		company.setNo_of_rooms(no_of_rooms);
		company.setCatering(request.getParameter("catering"));
		company.setAlcohol(request.getParameter("alcohol"));
		String date2=request.getParameter("date_of_arrival");
		Date date12=new SimpleDateFormat("yyyy-MM-dd").parse(date2);
		company.setDate_of_arrival(date12);
		String date21=request.getParameter("date_of_departure"); 
		Date date123=new SimpleDateFormat("yyyy-MM-dd").parse(date21);
		company.setDate_of_departure(date123);
		company.setPhone_no(request.getParameter("phone_no"));



		System.out.println(company.getDate_of_arrival());

		this.comapnyRepository.save(company); }

}
