package com.digisprint.Event_Management1.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.digisprint.Event_Management1.Model.Marriage;
import com.digisprint.Event_Management1.Model.family;

public interface FamilyRepository extends CrudRepository<family, Integer>{


	public List<family> findAllByPhoneno(String phoneno);
}
