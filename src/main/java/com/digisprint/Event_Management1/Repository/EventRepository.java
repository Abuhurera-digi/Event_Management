package com.digisprint.Event_Management1.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.digisprint.Event_Management1.Model.Event;

@Repository
public interface EventRepository extends CrudRepository<Event, Integer>{

}
