 

import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.digisprint.Event_Management1.Model.Admin;
import com.digisprint.Event_Management1.Model.Event;
import com.digisprint.Event_Management1.Model.User;
import com.digisprint.Event_Management1.Model.birthday;
import com.digisprint.Event_Management1.Repository.EventRepository;
import com.digisprint.Event_Management1.Service.EventService;

@Controller
public class EventContoller {
	Admin user;
	@Autowired
	EventService eventService;
	EventRepository eventRepository;
	
	

	public static String directory="D:\\socialmediapage\\digi-page\\src\\main\\resources\\static\\images";


	@PostMapping("/event")
	  public ModelAndView detatils(HttpServletRequest request, @RequestParam("photo") MultipartFile file, ModelMap map) throws  UnsupportedEncodingException, ParseException{
			 
		eventService.insert(request,file,directory);
		ModelAndView modelAndView = new ModelAndView("ViewEvents");
//			   map.put("user", user);
//			   String name=user.getname();
//			   List<Event>  list= eventService.userpost(name);
//			   map.put("userlist", list);
			  System.out.println("inserted");
			  return modelAndView;	
	}
	/*
	 * @GetMapping("/Event") public ModelAndView listEmployee(ModelAndView model)
	 * throws IOException {
	 * 
	 * List<Event> Eventlist = eventService.getAllPen();
	 * model.addObject("Eventlist", Eventlist); model.setViewName("ViewEvents");
	 * 
	 * return model; }
	 */
	 @GetMapping("/Event")
     public String displayEvent(ModelMap model) {
       
       
       return eventService.displayEvent(model);
         
     }
	 
	 @GetMapping("/Event1")
     public String displayEvent1(ModelMap model) {
       
       
       return eventService.displayEvent1(model);
         
     }
	 
	 
	//delete
	 @RequestMapping(value="/event/deleteEvent/{event_id}", method=RequestMethod.GET)
	 public ModelAndView delete(@PathVariable("event_id") int event_id) {
		 
	  eventService.deleteEvent(event_id);
	  System.out.println("Coming");
	  return new ModelAndView("/ViewEvents");
	  
	 }
	 
	 //updating
	 
	 
		
		  @RequestMapping(value=" /event/editFundraiser/{event_id}",
		  method=RequestMethod.GET) public ModelAndView editStudent(@PathVariable int
		  event_id) { ModelAndView model = new ModelAndView("/ViewEvents");
		  
		  Event event = eventService.getEventById(event_id);
		  System.out.println("coming inside"); 
		  model.addObject("studentForm", event);
		  model.getModel();
		  System.out.println("come"); 
		  model.setViewName("/addEvents");
		  System.out.println("vivek");
		  
		  return model; }
	  
	/*
	 * @PostMapping("/birthBook") public String check(HttpServletRequest request)
	 * throws ParseException { String redirect="";
	 * if(eventService.availabality(request)) { eventService.insert(request);
	 * redirect="birthdayRegistersuccess"; } else {
	 * System.out.println("noavailability"); redirect="birthdayRegisterError"; }
	 * return redirect; } 
	 */
	
	 
	 
}