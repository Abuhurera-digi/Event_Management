package com.digisprint.Event_Management1.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.digisprint.Event_Management1.Model.User;


@Repository

public interface UserRepository  extends JpaRepository<User, Integer>{
	
	//@Query(value="select phoneno,password from User", nativeQuery= true)
	//boolean existsByEmail(String email);
	//public List<User> findUserByPhonenoAndPassword(String phoneno);
	User findByPhonenoAndPassword(String phoneno, String password);
	User findBynameAndPhoneno(String name, String phoneno);

	

}
