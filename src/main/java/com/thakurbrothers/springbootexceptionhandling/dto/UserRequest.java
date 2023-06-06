package com.thakurbrothers.springbootexceptionhandling.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class UserRequest {
	
	private String name;
	private String email;
	private String mobile;
	private String gender;
	private int age;
	private String nationality;

}
