package com.digisprint.Event_Management1.Repository;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.digisprint.Event_Management1.Model.Event;
import com.digisprint.Event_Management1.Model.User;

@Repository
public interface EventRepository extends CrudRepository<Event, Integer>{

	List<Event> findAllByEventname(String uname);

	Event findByEventname(String eventname);

    Event findById(int id);
	
	//Event findByDescription(String description);

	//Event findByEventName(String eventname);
	
	

}
