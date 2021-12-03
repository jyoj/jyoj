package com.firststep.studentproject.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.firststep.studentproject.registrationModel.User;

public interface UserService extends JpaRepository<User, Integer>{

	void myhome();

	boolean saveUserReg(String userFirstName, String userSurname, int userPinCode, String userDob, String userJoinDate);

	List<User> searchDataById(String searchText);

	
}
