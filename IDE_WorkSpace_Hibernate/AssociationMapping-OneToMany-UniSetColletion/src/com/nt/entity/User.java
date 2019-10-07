package com.nt.entity;

import java.io.Serializable;
import java.util.Set;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class User  implements Serializable{
	
	private int userId;
	private String userName;
	private Set<PhoneNumber> phones;
	
	
	public User() {
		System.out.println("User:0-param constructor");
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + "]";
	}
	
	
	

}
