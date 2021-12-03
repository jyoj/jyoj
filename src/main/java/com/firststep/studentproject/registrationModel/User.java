package com.firststep.studentproject.registrationModel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users123")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private	int user_id;
	private String	user_first_name;
	private String	user_surname;
	private int	user_pin_code;
	private String	user_join_date;
	private String	user_dob;
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_first_name() {
		return user_first_name;
	}
	public void setUser_first_name(String user_first_name) {
		this.user_first_name = user_first_name;
	}
	public String getUser_surname() {
		return user_surname;
	}
	public void setUser_surname(String user_surname) {
		this.user_surname = user_surname;
	}
	public int getUser_pin_code() {
		return user_pin_code;
	}
	public void setUser_pin_code(int user_pin_code) {
		this.user_pin_code = user_pin_code;
	}
	public String getUser_join_date() {
		return user_join_date;
	}
	public void setUser_join_date(String user_join_date) {
		this.user_join_date = user_join_date;
	}
	public String getUser_dob() {
		return user_dob;
	}
	public void setUser_dob(String user_dob) {
		this.user_dob = user_dob;
	}
	

}
