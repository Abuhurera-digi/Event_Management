package com.digisprint.Event_Management1.Contoller;

import java.text.ParseException;
import java.util.Objects;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.digisprint.Event_Management1.Model.Admin;
import com.digisprint.Event_Management1.Model.User;
import com.digisprint.Event_Management1.Service.AdminService;

@Controller
public class AdminContoller {

	Admin admin1;
	@Autowired
	AdminService adminService;

	@GetMapping("/Admin")
	public String adminLogin() {
		return "adminLogin";
	}

	@GetMapping("/admincreate")
	public String createAdmin() {
		return "adminregister";
	}


	@PostMapping("/adminlogin")
	public String login(@ModelAttribute ("admin") Admin admin) 
	{
		admin1 = adminService.login(admin.getname(), admin.getPassword());
		//  System.out.println(admin1);
		if(Objects.nonNull(admin1))
		{
			return "admin-login-success";
		}
		else {

			return "admin-login-error";
		}



	}

	//your profile
	@GetMapping("/yourprofile1")
	public String yourProfile(ModelMap model) {
		//checking
		model.put("admin", admin1);
		return "adminProfile";
	}


	@RequestMapping("/editAdmin/{id}")
	public ModelAndView changePassword(@PathVariable("id") int id)
	{
		ModelAndView modelAndView = new ModelAndView();
		Admin admin = adminService.getAdminId(id);
		modelAndView.addObject("adminForm", admin);
		modelAndView.setViewName("/adminregister");
		return modelAndView;

	}
	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public ModelAndView add(@ModelAttribute("adminForm") Admin admin)
	{
		adminService.addAdmin(admin);
		return new ModelAndView("redirect:");
	}

}
