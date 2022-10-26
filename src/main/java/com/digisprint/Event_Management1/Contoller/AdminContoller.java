package com.digisprint.Event_Management1.Contoller;

import java.text.ParseException;
import java.util.Objects;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.digisprint.Event_Management1.Model.Admin;
import com.digisprint.Event_Management1.Model.User;
import com.digisprint.Event_Management1.Service.AdminService;

@Controller
public class AdminContoller {
	
	@Autowired
	AdminService adminService;
	
	@GetMapping("/Admin")
	public String Get3() {
		return "adminLogin";
	}

	@GetMapping("/admincreate")
	public String Get4() {
		return "adminregister";
	}
	@PostMapping("/admincreate1")
	 public ModelAndView value1(HttpServletRequest
			  request) throws ParseException {
			  
		  ModelAndView modelAndView = new ModelAndView("admin-success");
			  
			  
			  adminService.admin(request); System.out.println("inserted"); 
			  return modelAndView;
	}
	
	  @PostMapping("/adminlogin")
	  public String login(@ModelAttribute ("admin") Admin admin) 
	  {
		  Admin admin1 = adminService.login(admin.getname(), admin.getPassword());
		//  System.out.println(admin1);
		  if(Objects.nonNull(admin1))
		  {
			  return "admin-login-success";
		  }
			  else {
				  
				  return "admin-login-error";
			  }
		  
		 
	  
	  }
		

}
