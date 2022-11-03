 package com.digisprint.Event_Management1.Service;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import com.digisprint.Event_Management1.Model.Admin;
import com.digisprint.Event_Management1.Model.User;
import com.digisprint.Event_Management1.Repository.UserRepository;

@Service
@Transactional
public class UserService implements UserService1{

	User user;
@Autowired
	private UserRepository userRepository;


	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public String viewDetails(
			@RequestParam("name") String name,
			@RequestParam("email_id")  String email_id ,
			@RequestParam("college_name") String college_name,
			@RequestParam("phoneno" ) String phoneno,
			@RequestParam("password") String password,

			@RequestParam("gender") String gender
			, ModelMap modelMap, HttpServletRequest request){ 
		User user=new User();
		user.setName(name);
		user.setEmail_id(email_id);
		user.setCollege_name(college_name);
		user.setPhoneno(phoneno);
		user.setPassword(password);
		user.setGender(gender);
		this.userRepository.save(user);
		modelMap.put("cname",name);
		modelMap.put("cemail", email_id);
		modelMap.put("college_name", college_name);
		modelMap.put("phoneno", phoneno);
		modelMap.put("password", password);
		modelMap.put("gender", gender);
		return "Register_success";
	}

	
	


	public User forgetpass(String name, String phoneno) {
		User user = userRepository.findBynameAndPhoneno(name, phoneno);
		return user;
	}
	
	



	public User login(String phoneno, String password) {
		User user= userRepository.findByPhonenoAndPassword(phoneno, password);
		return user;
	}
	
	
	
	@Override
	public void deleteEvent(int id) {
		userRepository.deleteById(id);
	}
	
	
	public String displayUser(ModelMap model) {
	    // TODO Auto-generated method stub
	      List<User>list=new ArrayList<User>();
	     userRepository.findAll().forEach(i->list.add(i));
	     model.addAttribute("result", list);
	    
	     return "viewuser";
	}
	
	
	//update password
	
	public User changepassword( String password) {
		
		List <User> list = new ArrayList<>();
		return userRepository.findByPassword(password);
		
		
		
	}

	public void updatePassword(	String password,String username, String phoneno) {
		
		 userRepository.updatepassword(password,username, phoneno);
	}


	
	@Override
	public User getStudentById(int id) {
		return userRepository.findById(id).get();
	}
//inserting
	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}
	
	//Updating
	@Override
	public User getUserId(int id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id).get();
	}
// no register same phone number
	@Override
	public User exitsPhoneno(String phoneno) {
		// TODO Auto-generated method stub
		user= userRepository.findByPhoneno(phoneno);
		return user;
	}
	

	
	
	
	
	
}
