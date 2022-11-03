package com.digisprint.Event_Management1.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestParam;

import com.digisprint.Event_Management1.Model.Marriage;
import com.digisprint.Event_Management1.Model.birthday;
import com.digisprint.Event_Management1.Model.family;
import com.digisprint.Event_Management1.Repository.FamilyRepository;
import com.digisprint.Event_Management1.Repository.MarriageRepository;
import com.digisprint.Event_Management1.Repository.birthdayRepository;

import javassist.bytecode.stackmap.BasicBlock.Catch;

@Service
@Configuration
@Transactional
public class BirthdayService {

	@Autowired
	birthdayRepository birthdayRepository;
	@Autowired
	MarriageRepository marriageRepository;
	@Autowired
	FamilyRepository familyRepository;

	public String birthInsert(
			//@RequestParam("id")int id,
			@RequestParam("name_of_child") String name_of_child,
			@RequestParam("date_of_birth")  Date date_of_birth ,
			@RequestParam("venue") String venue,
			@RequestParam("date_of_arrival" ) Date date_of_arrival,
			@RequestParam("date_of_departure") Date date_of_departure,
			@RequestParam("decoration") String decoration,
			@RequestParam("material") String material,
			@RequestParam("cake") String cake,
			@RequestParam("phoneno") String phoneno
			, ModelMap modelMap)
	{
		birthday birthday=new birthday();
		String status;


		//birthday.setId(id);
		birthday.setName_of_child(name_of_child);
		birthday.setDate_of_birth(date_of_birth);
		birthday.setVenue(venue);

		birthday.setDate_of_arrival(date_of_arrival);
		birthday.setDate_of_departure(date_of_departure);
		birthday.setDecoration(decoration);
		birthday.setMaterial(material);
		birthday.setCake(cake);
		birthday.setPhoneno(phoneno);

		this.birthdayRepository.save(birthday);
		modelMap.put("name_of_child", name_of_child);
		modelMap.put("date_of_birth", date_of_birth);
		modelMap.put("venue", venue);
		modelMap.put("date_of_arrival", date_of_arrival);
		modelMap.put("date_of_departure", date_of_departure);
		modelMap.put("decoration", decoration);
		modelMap.put("material", material);
		modelMap.put("cake", cake);
		modelMap.put("phoneno", phoneno);
		System.out.println(birthday.getB_Id());

		List<birthday> list= new ArrayList<>(); String redirect="";
		birthdayRepository.findAll().forEach(e->list.add(e));



		return "birthdayRegistersuccess";


	}







	// check availability
	public boolean availabality(@RequestParam("date_of_arrival") Date date_of_arrival, @RequestParam("venue") String venue){
		Boolean status=false;
		List<birthday> list = new ArrayList<>();
		birthdayRepository.findAll().forEach(x->list.add(x)); 
		System.out.println("coming");

		for(birthday e:list) {
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



	public void cancle(int b_id) {

		birthdayRepository.deleteById(b_id);
		System.out.println("delete");
	}

	//cancle
	public void cancle1(String phoneno) {

		birthdayRepository.deleteByPhoneno(phoneno);
	}

	// getdetails book

	public List<birthday> delete(String phoneno){

		List<birthday> list = new ArrayList<>();
		birthdayRepository.findAllByPhoneno(phoneno).forEach(x->list.add(x));
		List<Marriage> user = new ArrayList<>();
		marriageRepository.findAllByPhoneno(phoneno).forEach(y->user.add(y));
		return list;
	}

	// BookEd user
	public String data(ModelMap model) {
		List<birthday>user=new  ArrayList<>();
		birthdayRepository.findAll().forEach(i->user.add(i));
		List<Marriage> user1= new ArrayList<>();
		marriageRepository.findAll().forEach(y->user1.add(y));
		List<family> user2= new ArrayList<>();
		familyRepository.findAll().forEach(y->user2.add(y));
		System.out.println(user2);
		System.out.println(user1);
		System.out.println(user);
		model.addAttribute("result", user);
		model.addAttribute("marriage", user1);
		model.addAttribute("family", user2);
		return "ViewBookedUser";
	}

	// cancel booked user

	public void deleteBookedEvent(int b_id) {

		birthdayRepository.deleteById(b_id);
	}
}
