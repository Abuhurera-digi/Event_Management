package com.digisprint.Event_Management1.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.digisprint.Event_Management1.Model.User;


@Repository

public interface UserRepository  extends JpaRepository<User, Integer>{
	
	//@Query(value="select phoneno,password from User", nativeQuery= true)
	//boolean existsByEmail(String email);
	//public List<User> findUserByPhonenoAndPassword(String phoneno);
	@Modifying
	@Query("update 	User u set u.password= :password1 where u.name=:username and u.phoneno=:phoneno")
	public void updatepassword(@Param("password1") String password1,@Param("username") String username, @Param("phoneno") String phoneno);
	
	
	User findByPhonenoAndPassword(String phoneno, String password);
	User findBynameAndPhoneno(String name, String phoneno);
	
	User findByPassword(String password);
	User getUserByName(String name);

	

}
