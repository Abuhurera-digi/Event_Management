package com.digisprint.Event_Management1.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.digisprint.Event_Management1.Model.Event;
import com.digisprint.Event_Management1.Model.User;

@Repository
public interface EventRepository extends CrudRepository<Event, Integer>{
	
	

}
