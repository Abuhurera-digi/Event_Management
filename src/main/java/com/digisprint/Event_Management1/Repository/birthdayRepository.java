package com.digisprint.Event_Management1.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.digisprint.Event_Management1.Model.birthday;

public interface birthdayRepository extends JpaRepository<birthday, Integer>{
	
	@Query("select date_of_arrival from birthday")
	public List<birthday> findByDate_of_arrival();

	 public void deleteByPhoneno(String phoneno);
	 public List<birthday> findAllByPhoneno(String phoneno);

	

}
