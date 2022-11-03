package com.digisprint.Event_Management1.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.digisprint.Event_Management1.Model.Company;
import com.digisprint.Event_Management1.Model.family;
import com.digisprint.Event_Management1.Repository.FamilyRepository;

@Service
public class FamilyService {
	
	@Autowired
	FamilyRepository familyRepository;
	
	public void insert(HttpServletRequest request) throws ParseException {
		family fam = new family();
		
		 // int id=Integer.parseInt(request.getParameter("id")); fam.setid(id);
		 
		fam.setFamilyname(request.getParameter("familyname"));
		fam.setAddress(request.getParameter("address"));
		
		
		
		int no_of_attendees=Integer.parseInt(request.getParameter("no_of_attendees"));
		fam.setNo_of_attendees(no_of_attendees);
		int no_of_rooms= Integer.parseInt(request.getParameter("no_of_rooms"));
		fam.setNo_of_rooms(no_of_rooms);
		fam.setCatering(request.getParameter("catering"));
		fam.setAlcohol(request.getParameter("alcohol"));
		String date2=request.getParameter("date_of_arrival");
		Date date12=new SimpleDateFormat("yyyy-MM-dd").parse(date2);
		fam.setDate_of_arrival(date12);
		String date21=request.getParameter("date_of_departure"); 
		Date date123=new SimpleDateFormat("yyyy-MM-dd").parse(date21);
		fam.setDate_of_departure(date123);
		fam.setPhoneno(request.getParameter("phone_no"));



		System.out.println(fam.getDate_of_arrival());

		this.familyRepository.save(fam); }
	
	// check availabality
			public boolean availabality(@RequestParam("date_of_arrival") Date date_of_arrival){
			  Boolean status=false;
			  List<family> list = new ArrayList<>();
			  familyRepository.findAll().forEach(x->list.add(x)); 
			  System.out.println("coming");
			  
			  for(family e:list) {
				  Date d1=e.getDate_of_arrival();
				  Date d2 = date_of_arrival;
			  if(d1.compareTo(d2)==0) 
			  {
				  System.out.println(date_of_arrival);
				  status=true;
				  break;
			  }
			  
			  }
			  		return status;
			  }
	
	
	//cancle bokk user
		public void deleteBookedEvent(int b_id) {
			
			familyRepository.deleteById(b_id);
			System.out.println("Coming");
		}

}
