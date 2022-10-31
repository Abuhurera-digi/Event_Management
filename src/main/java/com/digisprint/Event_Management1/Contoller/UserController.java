package com.digisprint.Event_Management1.Contoller;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
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
import com.digisprint.Event_Management1.Model.birthday;
import com.digisprint.Event_Management1.Repository.UserRepository;
import com.digisprint.Event_Management1.Repository.birthdayRepository;
import com.digisprint.Event_Management1.Service.AdminService;
import com.digisprint.Event_Management1.Service.UserService;


@Controller

public class UserController {

		private UserRepository repository;
		@Autowired
		private birthdayRepository birthdayRepository;
	private UserService userService;
	AdminService adminService;
	
	 User user1; 	

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
	public String InsertDetails( @RequestParam("name") String name, @RequestParam("email_id") String email_id,
			@RequestParam("college_name") String college_name, @RequestParam("phoneno") String phoneno,
			@RequestParam("password") String password,
			//@RequestParam("passConfirm") String passConfirm,

			@RequestParam("Gender") String gender, ModelMap modelMap) {

		userService.viewDetails(name, email_id, college_name, phoneno, password, gender,   modelMap);
		return "Register_success";

	}

	
	  @PostMapping("/login")
	  public String login(@ModelAttribute ("user") User user) 
	  {
		  user1 = userService.login(user.getPhoneno(), user.getPassword());
		  System.out.println("user1"+user1);
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
			  return "changePassword";
		  }
		  else {
			  return "forpassword";
		  }
		  
	  }
	  
		
		 
		
	  
	  
	  //delete
	  @RequestMapping(value="/user/deleteStudent/{id}", method=RequestMethod.GET)
		 public ModelAndView delete(@PathVariable("id") int id) {
			 
		  userService.deleteEvent(id);
		  return new ModelAndView("redirect:/viewuser");
		  
		 }
		
		 
	  
	  @GetMapping("/viewuser")
      public String displayUser(ModelMap model) {
        
        
        return userService.displayUser(model);
          
      }
		 
	  
	  //your profile
	  @GetMapping("/yourprofile")
      public String yourProfile(ModelMap model) {
        
       
        model.put("user", user1);
        List<birthday> list = new ArrayList<>();
		birthdayRepository.findAllByPhoneno(user1.getPhoneno()).forEach(x->list.add(x));
		System.out.println(list);
        model.put("birthday", list);

         return "Pofile";
          
      }
	  
	  
	  //update password
	  @PostMapping("/changepass")
	  public String  changePassword(@ModelAttribute ("user") User user)
	  {
		  User user2 = userService.changepassword(user.getPassword());
		  System.out.println(user2);
		  if(Objects.nonNull(user2))
		  {
			  return "changePassword";
		  }
		  else {
			  return "password";
		  }
		  
	  }
	  
		
		/*
		 * @PostMapping("/changepassword1") public String changePassword1(@RequestParam
		 * ("password") String password , @RequestParam("phoneno") String phoneno, User
		 * user) {
		 * 
		 * user.setPassword(password);
		 * 
		 * System.out.println("password"+password); String password1=user.getPassword();
		 * String username= user.getName(); User currentUser=
		 * this.repository.getUserByName(username);
		 * userService.updatePassword(password1, username, phoneno);
		 * //System.out.println(currentUser.getPassword());
		 * 
		 * 
		 * return "Register_success"; }
		 */
		 
	

}
