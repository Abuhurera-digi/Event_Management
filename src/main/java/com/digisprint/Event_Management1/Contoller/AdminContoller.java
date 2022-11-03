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
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.digisprint.Event_Management1.Model.Admin;
import com.digisprint.Event_Management1.Model.User;
import com.digisprint.Event_Management1.Service.AdminService;

@RestController
public class AdminContoller {

	Admin admin1;
	@Autowired
	AdminService adminService;

	@GetMapping("/Admin")
	public ModelAndView  adminLogin() {
		ModelAndView modelAndView = new ModelAndView("adminLogin");
		return modelAndView;
	}

	@GetMapping("/admincreate")
	public ModelAndView createAdmin() {
		ModelAndView modelAndView = new ModelAndView("adminregister");
		return modelAndView;
	}


	@PostMapping("/adminlogin")
	public ModelAndView login(@ModelAttribute ("admin") Admin admin, ModelMap model) 
	{
		admin1 = adminService.login(admin.getname(), admin.getPassword());
		if(Objects.nonNull(admin1))
		{
			ModelAndView modelAndView = new ModelAndView("admin-login-success");
			return modelAndView ;
		}
		else {
				ModelAndView view = new ModelAndView("adminLogin");
				model.addAttribute("error", "admin not found");
			return view;
		}



	}

	//your profile
	@GetMapping("/yourprofile1")
	public ModelAndView yourProfile(ModelMap model) {
		//checking
		ModelAndView modelAndView = new ModelAndView("adminProfile");
		model.put("admin", admin1);
		return modelAndView;
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
