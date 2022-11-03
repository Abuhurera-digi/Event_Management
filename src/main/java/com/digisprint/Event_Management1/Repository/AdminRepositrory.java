package com.digisprint.Event_Management1.Repository;

import org.springframework.data.repository.CrudRepository;

import com.digisprint.Event_Management1.Model.Admin;
import com.digisprint.Event_Management1.Model.User;

public interface AdminRepositrory extends CrudRepository<Admin, Integer>{

	Admin findByNameAndPassword(String admin_name, String password);

}
