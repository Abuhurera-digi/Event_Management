 package com.digisprint.Event_Management1.Service;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import com.digisprint.Event_Management1.Model.User;
import com.digisprint.Event_Management1.Repository.UserRepository;

@Service

public class UserService{


	private UserRepository userRepository;


	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public void viewDetails(@RequestParam("id") int id,
			@RequestParam("name") String name,
			@RequestParam("email_id")  String email_id ,
			@RequestParam("college_name") String college_name,
			@RequestParam("phoneno" ) String phoneno,
			@RequestParam("password") String password,
			//@RequestParam("passConfirm") String passConfirm,

			@RequestParam("gender") String gender
			, ModelMap modelMap){ 
		User user=new User();
		int id1 = Integer.valueOf(id);
		user.setId(id1);
		user.setName(name);
		user.setEmail_id(email_id);
		user.setCollege_name(college_name);
		user.setPhoneno(phoneno);
		user.setPassword(password);
		//user.setPassConfirm(passConfirm);
		user.setGender(gender);
		this.userRepository.save(user);
		modelMap.put("cname",name);
		modelMap.put("cemail", email_id);
		modelMap.put("college_name", college_name);
		modelMap.put("phoneno", phoneno);
		modelMap.put("password", password);
		//modelMap.put("passConfirm", passConfirm);
		modelMap.put("gender", gender);
	}

	


	public User forgetpass(String name, String phoneno) {
		User user = userRepository.findBynameAndPhoneno(name, phoneno);
		return user;
	}
	
	



	public User login(String phoneno, String password) {
		User user= userRepository.findByPhonenoAndPassword(phoneno, password);
		return user;
	}
	
	
	public void deleteStudent(int id) {
		
		userRepository.deleteById(id);
		System.out.println("Coming");
	}
	
	public String displayUser(ModelMap model) {
	    // TODO Auto-generated method stub
	      List<User>list=new ArrayList<User>();
	     userRepository.findAll().forEach(i->list.add(i));
	     model.addAttribute("result", list);
	    
	     return "viewuser";
	}
	
	
	public void yourProfile(ModelMap model,  String phoneno, String password) {
	    // TODO Auto-generated method stub
	      List<User>list=new ArrayList<User>();
	     userRepository.findByPhonenoAndPassword(phoneno, password);
	     model.addAttribute("result", list);
	    
	     //return "pofile";
	}
}
