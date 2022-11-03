package com.digisprint.Event_Management1.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.digisprint.Event_Management1.Model.Marriage;
import com.digisprint.Event_Management1.Model.birthday;

public interface MarriageRepository extends CrudRepository<Marriage, Integer> {


	public List<Marriage> findAllByPhoneno(String phoneno);
	public void deleteByPhoneno(String phoneno);


}
