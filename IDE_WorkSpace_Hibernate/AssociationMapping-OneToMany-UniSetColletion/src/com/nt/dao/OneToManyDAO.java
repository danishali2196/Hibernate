package com.nt.dao;

import com.nt.entity.User;

public interface OneToManyDAO {
	
	public void saveData();
	public void addNewPhoneNumberExistingUser();
	public User loadData();

}
