package com.prowings.propertyconfig;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

//@Component
//@PropertySource("classpath:db.properties")
public class MyDatabaseDetails {
	
//	@Value("${dburl}")
	String username;
	
//	@Value("${dbusername}")
	String url;
	
//	@Value("${dbpwd}")
	String password;
	
//	@Value("${myarray}")
	String[] myArray;
	
//	@Value("${mylist}")
	List<String> myList;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String[] getMyArray() {
		return myArray;
	}

	public void setMyArray(String[] myArray) {
		this.myArray = myArray;
	}

	public List<String> getMyList() {
		return myList;
	}

	public void setMyList(List<String> myList) {
		this.myList = myList;
	}

	@Override
	public String toString() {
		return "MyDatabaseDetails [username=" + username + ", url=" + url + ", password=" + password + ", myArray="
				+ Arrays.toString(myArray) + ", myList=" + myList + "]";
	}

	
	
	
	
}
