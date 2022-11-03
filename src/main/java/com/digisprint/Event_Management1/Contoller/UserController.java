package com.digisprint.Event_Management1.Contoller;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.digisprint.Event_Management1.Model.Admin;
import com.digisprint.Event_Management1.Model.Marriage;
import com.digisprint.Event_Management1.Model.User;
import com.digisprint.Event_Management1.Model.birthday;
import com.digisprint.Event_Management1.Model.family;
import com.digisprint.Event_Management1.Repository.AdminRepositrory;
import com.digisprint.Event_Management1.Repository.FamilyRepository;
import com.digisprint.Event_Management1.Repository.MarriageRepository;
import com.digisprint.Event_Management1.Repository.UserRepository;
import com.digisprint.Event_Management1.Repository.birthdayRepository;
import com.digisprint.Event_Management1.Service.AdminService;
import com.digisprint.Event_Management1.Service.UserService;

@RestController

public class UserController {

	private UserRepository repository;
	@Autowired
	private birthdayRepository birthdayRepository;
	@Autowired
	private AdminRepositrory adminRepositrory;
	@Autowired
	private MarriageRepository marriageRepository;
	@Autowired
	private FamilyRepository familyRepository;
	
	private UserService userService;
	
	private AdminService adminService;

	User user1= new User();
	User user4;
	Admin admin;

	public UserController(UserRepository repository, UserService userService, AdminService adminService) {
		this.repository = repository;
		this.userService = userService;
		this.adminService = adminService;
	}

	@RequestMapping("/")
	public ModelAndView FirstMapping() {
		ModelAndView modelAndView = new ModelAndView("index");
		return modelAndView;
	}

	@GetMapping("/User1")
	public ModelAndView UserLogin() {
		ModelAndView modelAndView = new ModelAndView("UserLogin");
		return modelAndView;
	}
	// no register with same number
	@GetMapping("/Create")
	public ModelAndView CreateAccount(@ModelAttribute("userForm") User user, Model model) {
		ModelAndView modelAndView = new ModelAndView("UserRegister");

		return modelAndView;
	}

	//		return "UserRegister";  
	//}
	//inserting
	@PostMapping("/addAdmin")
	public ModelAndView userRegister(@ModelAttribute("userForm") User user,@RequestParam("name") String name,
			@RequestParam("email_id")  String email_id ,
			@RequestParam("college_name") String college_name,
			@RequestParam("phoneno" ) String phoneno,
			@RequestParam("password") String password,

			@RequestParam("gender") String gender
			, ModelMap modelMap, HttpServletRequest request) {
		user1=userService.exitsPhoneno(phoneno);
		if(user1==null) {
			
			return userService.viewDetails(name, email_id, college_name, phoneno, password, gender, modelMap, request);
		}
		else {
			ModelAndView view = new ModelAndView("UserRegister");
			modelMap.addAttribute("error", "This phone Number is already exits");
			return view;
		}
	}

	@PostMapping("/login")
	public ModelAndView login(@ModelAttribute("user") User user,Model  model) {
		
		user1 = userService.login(user.getPhoneno(), user.getPassword());
		System.out.println("user1" + user1);
		if (Objects.nonNull(user1)) {
			ModelAndView modelAndView =new ModelAndView("login-success");
			return modelAndView;
		} else {
			ModelAndView View =new ModelAndView("UserLogin");
			model.addAttribute("error", "user not found");
			return View;
		}

	}

	@PostMapping("/pass")
	public ModelAndView paasword(@ModelAttribute("user") User user) {
		ModelAndView modelAndView = new ModelAndView("forpassword");
		user4 = userService.forgetPassword(user.getName(), user.getPhoneno());
		System.out.println(user4);
		if (Objects.nonNull(user4)) {
			modelAndView.addObject("userForm", user4);
			modelAndView.setViewName("/updateUser");
		}
		return modelAndView;
	}



	// delete
	@RequestMapping(value = "/user/deleteStudent/{id}", method = RequestMethod.GET)
	public ModelAndView delete(@PathVariable("id") int id) {

		userService.deleteEvent(id);
		return new ModelAndView("redirect:/viewuser");

	}

	@GetMapping("/viewuser")
	public ModelAndView displayUser(ModelMap model) {
		//ModelAndView modelAndView = new ModelAndView();
		return userService.displayUser(model);

	}

	// your profile
	@GetMapping("/yourprofile")
	public ModelAndView yourProfile(ModelMap model) {

		ModelAndView modelAndView = new ModelAndView("Pofile");
		model.put("user", user1);

		List<birthday> list = new ArrayList<>();
		birthdayRepository.findAllByPhoneno(user1.getPhoneno()).forEach(x -> list.add(x));
		System.out.println(list);
		List<Marriage> user2 = new ArrayList<>();
		marriageRepository.findAllByPhoneno(user1.getPhoneno()).forEach(y -> user2.add(y));
		System.out.println(user2);
		List<family> user3 = new ArrayList<>();
		familyRepository.findAllByPhoneno(user1.getPhoneno()).forEach(y -> user3.add(y));
		System.out.println(user3);

		model.put("birthday", list);
		model.put("marriage", user2);
		model.put("family", user3);

		return modelAndView;

	}

	// update password
	@PostMapping("/changepass")
	public String changePassword(@ModelAttribute("user") User user) {
		//adding new line to code	
		User user2 = userService.changepassword(user.getPassword());
		System.out.println(user2);
		if (Objects.nonNull(user2)) {
			return "changePasswordRrgister";
		} else {
			return "password";
		}
	}

	//updating
	@RequestMapping("/editUser/{id}")
	public ModelAndView changePassword(@PathVariable("id") int id) {
		ModelAndView modelAndView = new ModelAndView();
		User user = userService.getUserId(id);
		modelAndView.addObject("userForm", user);
		modelAndView.setViewName("/updateUser");
		return modelAndView;

	}
	//inserting after update
	@RequestMapping(value = "/UpdateUser", method = RequestMethod.POST)
	public ModelAndView add(@ModelAttribute("userForm") User user ) {

		userService.addUser(user); 

		ModelAndView modelAndView = new ModelAndView("index");
		return modelAndView;
	}



}
