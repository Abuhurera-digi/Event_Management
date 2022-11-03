package com.digisprint.Event_Management1.Service;

import java.util.Optional;

import com.digisprint.Event_Management1.Model.Admin;
import com.digisprint.Event_Management1.Model.Event;
import com.digisprint.Event_Management1.Model.User;

public interface UserService1 {
	
	 public void deleteEvent(int id);
	 public User getStudentById(int id);
	 public User addUser(User user);
	 public User getUserId(int id);
	 
	 User exitsPhoneno(String phoneno);


}
