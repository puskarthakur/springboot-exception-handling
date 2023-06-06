package com.thakurbrothers.springbootexceptionhandling.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "USER_TBL")
@Data
@NoArgsConstructor
@Setter
@Getter
public class User {

	@Id
	@GeneratedValue
	private int userId;
	private String name;
	private String email;
	private String mobile;
	private String gender;
	private int age;
	private String nationality;
	

}
