package com.digisprint.Event_Management1.Contoller;

import java.util.Objects;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.digisprint.Event_Management1.Model.User;
import com.digisprint.Event_Management1.Repository.UserRepository;
import com.digisprint.Event_Management1.Service.AdminService;
import com.digisprint.Event_Management1.Service.UserService;

@Controller

public class UserController {

	private UserRepository repository;
	private UserService userService;
	AdminService adminService;

	public UserController(UserRepository repository, UserService userService,AdminService adminService) {
		this.repository = repository;
		this.userService = userService;
		this.adminService=adminService;
	}

	@RequestMapping("/")
	public String Entry() {

		return "index";
	}

	@GetMapping("/User1")
	public String Get() {
		return "UserLogin";
	}
	

	@GetMapping("/Create")
	public String Getin() {
		return "UserRegister";
	}

	@PostMapping("/Register")
	public String InsertDetails( @RequestParam("id") int id,@RequestParam("name") String name, @RequestParam("email_id") String email_id,
			@RequestParam("college_name") String college_name, @RequestParam("phoneno") String phoneno,
			@RequestParam("password") String password,
			//@RequestParam("passConfirm") String passConfirm,

			@RequestParam("Gender") String gender, ModelMap modelMap) {

		userService.viewDetails(id,name, email_id, college_name, phoneno, password, gender,   modelMap);
		return "Register_success";

	}

	
	  @PostMapping("/login")
	  public String login(@ModelAttribute ("user") User user) 
	  {
		  User user1 = userService.login(user.getPhoneno(), user.getPassword());
		  System.out.println(user1);
		  if(Objects.nonNull(user1))
		  {
			  return "login-success";
		  }
			  else {
				  
				  return "login-error";
			  }
		  
		 
	  
	  }
	  
	  @PostMapping("/pass")
	  public String  paasword(@ModelAttribute ("user") User user)
	  {
		  User user2 = userService.forgetpass(user.getName(), user.getPhoneno());
		  System.out.println(user2);
		  if(Objects.nonNull(user2))
		  {
			  return "viewpassword";
		  }
		  else {
			  return "forpassword";
		  }
		  
	  }
	  
		
		 
		
	  
	  
	  
	  @RequestMapping(value="/user/deleteStudent/{id}", method=RequestMethod.GET)
		 public ModelAndView delete(@PathVariable("id") int id) {
			 
		  userService.deleteStudent(id);
		  return new ModelAndView("redirect:/viewuser");
		  
		 }
		
		 
	  
	  @GetMapping("/viewuser")
      public String displayUser(ModelMap model) {
        
        
        return userService.displayUser(model);
          
      }
		/*
		 * @GetMapping("/deleteuser") public String detlete() { return
		 * "admindeleteuser";
		 * 
		 * 
		 * }
		 */
	  @GetMapping("/yourprofile")
      public String yourProfile(ModelMap model,  String phoneno,String password) {
        
        
         userService.yourProfile(model,  phoneno, password);
         return "Pofile";
          
      }
	 
	  
	

}
