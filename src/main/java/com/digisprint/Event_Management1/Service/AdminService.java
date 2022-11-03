package com.digisprint.Event_Management1.Service;

import java.text.ParseException;

import javax.servlet.http.HttpServletRequest;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.digisprint.Event_Management1.Model.Admin;
import com.digisprint.Event_Management1.Model.Marriage;
import com.digisprint.Event_Management1.Model.User;
import com.digisprint.Event_Management1.Repository.AdminRepositrory;

@Service
@Configuration
public class AdminService implements AdminService1
{
	@Autowired
	AdminRepositrory adminRepositrory;
	

	
	  public void admin(HttpServletRequest request) throws ParseException { Admin
	  admin = new Admin(); 
	  // int id=Integer.parseInt(request.getParameter("id"));
	 //  admin.setId(id);
	   admin.setname(request.getParameter("name"));
	  admin.setEmail_id(request.getParameter("email_id"));
	  admin.setPassword(request.getParameter("password"));
	  
	  this.adminRepositrory.save(admin);
	  
	  }
	 
	
	public Admin login(String name, String password) {
		Admin admin= adminRepositrory.findByNameAndPassword(name, password);
		return admin;
	}

	@Override
	public Admin getAdminId(int id) {
		// TODO Auto-generated method stub
		return adminRepositrory.findById(id).get();
	}

	@Override
	public Admin addAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return adminRepositrory.save(admin);
	}
}
