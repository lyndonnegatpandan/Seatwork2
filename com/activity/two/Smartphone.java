package com.activity.two;
import java.util.*;
public class Smartphone extends Telephone{
	private String phoneNo;
	private String operatingSystem;
	private Map<String, String> contacts = new HashMap<>();

	//constructor
	public Smartphone(String phoneNo, String operatingSystem){
		this.phoneNo = phoneNo;
		this.operatingSystem = operatingSystem;
	}

	//getter
	public String getPhoneNo(){
		return phoneNo;
	}

	public String getOperatingSystem(){
		return operatingSystem;
	}

	public void addContact(String name, String phoneNo){
		contacts.put(name, phoneNo);
	}

	public void removeContact(String name){
		contacts.remove(name);
	}

	@Override
	public void call(String phoneNo){
		if(this.phoneNo == phoneNo){
			System.out.println("You cannot call yourself");
		}else{
			super.call(phoneNo);
		}
	}

	public void call(String name, String phoneNo){
		if(contacts.containsKey(name)){
			System.out.println("Calling from contacts");
			call(phoneNo);
		}
	}

	public void displayContacts(){
		for(String key: contacts.keySet()){
			System.out.println(key + " " + contacts.get(key));
		}
	}
}