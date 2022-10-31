package com.digisprint.Event_Management1.Contoller;

import java.sql.Date;
import java.text.ParseException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.digisprint.Event_Management1.Model.birthday;
import com.digisprint.Event_Management1.Repository.birthdayRepository;
import com.digisprint.Event_Management1.Service.birthdayService;


@Controller
@Configuration
@Component
public class birthdayController {
	
	@Autowired
	birthdayService birthdayService;
	@Autowired
	birthdayRepository birthdayRepository;
	
	
	
	@PostMapping("/birthBook")
	public String InsertDetails(@RequestParam("name_of_child") String name_of_child,
			@RequestParam("date_of_birth")  Date date_of_birth ,
			@RequestParam("venue") String venue,
			@RequestParam("date_of_arrival" ) Date date_of_arrival,
			@RequestParam("date_of_departure") Date date_of_departure,
			@RequestParam("decoration") String decoration,
			@RequestParam("material") String material,
			@RequestParam("cake") String cake,
			@RequestParam("phoneno") String phoneno
			, ModelMap modelMap){ 
		
		birthdayService.birthInsert( name_of_child, date_of_birth, venue, date_of_arrival, date_of_departure, decoration, material, cake, phoneno,modelMap);
		return "birthdayRegistersuccess";
	}
		
		/*birthday birthday = new birthday();
		 List<birthday> b=birthdayRepository.findByDate_of_arrival();
		if(b.equals(date_of_arrival))
		{
			return "birthdayRegisterError.jsp";
			
		}
		else {
			return "birthdayRegistersuccess.jsp";
		}
		
	}*/
	
	
//	
//	@PostMapping("/birthBook")
//	public ModelAndView value1(HttpServletRequest request) throws ParseException {
//
//		ModelAndView modelAndView = new ModelAndView("./birthdayRegistersuccess.jsp");
//
//
//		birthdayService.insert(request);
//		System.out.println("inserted");
//		return modelAndView;
//		
//		
//		
//	}
	
	@GetMapping("/abu")
	public String getin() {
		System.out.println("sumanth");
		return "cancel";
	}
	
	//@DeleteMapping("/Hurera")
	@RequestMapping("/Hurera")
	public String delete(@RequestParam("id") int id) {
		birthdayService.cancle(id);
		System.out.println("deleette");
		return "cancel-success";
		
	}
	/*
	 * @GetMapping("/deletebirthday") public String deletebirthday() {
	 * 
	 * return "adminLogin"; }
	 */
	
	/*
	 * @GetMapping("/addevents") public String going() {
	 * 
	 * return "addEvents"; }
	 */
	
	  @RequestMapping(value="/birthday/cancleEvent/{phoneno}",
	  method=RequestMethod.GET) public ModelAndView cancle(@PathVariable("phoneno")
	  String phoneno) {
	  
	  birthdayService.cancle(phoneno); System.out.println("Coming"); return new
	  ModelAndView("/cancel-success");
	  
	  }
	 
	 
	 
	/*
	 * @RequestMapping(value="/birthday/cancleEvent/{b_id}",
	 * method=RequestMethod.GET) public ModelAndView cancle(@PathVariable("b_id")
	 * int b_id) {
	 * 
	 * birthdayService.cancle(b_id); return new ModelAndView("/cancel-success");
	 * 
	 * }
	 */
}
