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




	User findByPhonenoAndPassword(String phoneno, String password);
	User findBynameAndPhoneno(String name, String phoneno);

	User findByPassword(String password);
	User getUserByName(String name);
	User findByPhoneno(String phoneno);


}
