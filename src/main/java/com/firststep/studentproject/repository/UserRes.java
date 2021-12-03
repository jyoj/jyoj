package com.firststep.studentproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.firststep.studentproject.registrationModel.User;
@Repository
public interface UserRes extends JpaRepository<User, Integer>{

	
	@Query("SELECT u FROM User u WHERE u.user_first_name LIKE ?1% ORDER BY u.user_join_date ASC")
	List<User> searchDataById(String searchText);

}
