package com.digisprint.Event_Management1.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestParam;

import com.digisprint.Event_Management1.Model.Marriage;
import com.digisprint.Event_Management1.Model.birthday;
import com.digisprint.Event_Management1.Repository.MarriageRepository;

@Service
@Configuration
@Transactional 
public class MarriageService {

	@Autowired
	MarriageRepository marriageRepository;




	public void insert(HttpServletRequest request) throws ParseException {
		Marriage marriage = new Marriage();
//		int id=Integer.parseInt(request.getParameter("id"));
//		marriage.setId(id);
		marriage.setBride_name(request.getParameter("bride_name"));
		marriage.setGroom_name(request.getParameter("groom_name"));
		marriage.setVenue(request.getParameter("venue"));
		String date2=request.getParameter("date_of_arrival");
		Date date12=new SimpleDateFormat("yyyy-MM-dd").parse(date2);

		marriage.setDate_of_arrival(date12);


		String date21=request.getParameter("date_of_departure"); Date date123=new
				SimpleDateFormat("yyyy-MM-dd").parse(date21);

		marriage.setDate_of_departure(date123);


		int no_of_relatives=Integer.parseInt(request.getParameter("no_of_relatives"));
		marriage.setNo_of_relatives(no_of_relatives);
		

		marriage.setCatering(request.getParameter("catering"));
		marriage.setDecoration(request.getParameter("decoration"));
		marriage.setPhotographer(request.getParameter("photographer"));
		marriage.setPhoneno(request.getParameter("phoneno"));



		System.out.println(marriage.getDate_of_arrival());

		this.marriageRepository.save(marriage); }
	

	
//checking avilabality
	public boolean availabality(@RequestParam("date_of_arrival") Date date_of_arrival, @RequestParam("venue") String venue){
	  Boolean status=false;
	  List<Marriage> list = new ArrayList<>();
	  marriageRepository.findAll().forEach(x->list.add(x)); 
	  System.out.println("coming");
	  
	  for(Marriage e:list) {
		  Date d1=e.getDate_of_arrival();
		  Date d2 = date_of_arrival;
	  if(d1.compareTo(d2)==0&&e.getVenue().equals(venue)) 
	  {
		  System.out.println(date_of_arrival);
		  status=true;
		  break;
	  }
	  
	  }
	  		return status;
	  }
	
	
	//cancle
		public void cancle1(String phoneno) {
			
			marriageRepository.deleteByPhoneno(phoneno);
		}
		
		
		// cancel booked user

		public void deleteBookedEvent(int b_id) {
			
			marriageRepository.deleteById(b_id);
			System.out.println("Coming");
		}


}


