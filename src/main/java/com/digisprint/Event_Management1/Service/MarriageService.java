package com.digisprint.Event_Management1.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.digisprint.Event_Management1.Model.Marriage;
import com.digisprint.Event_Management1.Repository.MarriageRepository;

@Service
@Configuration
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


		//marriage.setNo_of_relatives(request.getParameter("no_of_relatives"));
		int no_of_relatives=Integer.parseInt(request.getParameter("no_of_relatives"));
		marriage.setNo_of_relatives(no_of_relatives);
		

		marriage.setCatering(request.getParameter("catering"));
		marriage.setDecoration(request.getParameter("decoration"));
		marriage.setPhotographer(request.getParameter("photographer"));



		System.out.println(marriage.getDate_of_arrival());

		this.marriageRepository.save(marriage); }

}


