package com.bridgeit.objectorientedprograms;

public class Person {
	String firstName;
	String lastName;
	Address address;
	String phoneNumber;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
public String toString()
{
	return ("firstname: "+getFirstName()+" "+"lastname: "+getLastName()+" "+"address:"+getAddress()+" "+"mobilenumber"+getPhoneNumber());
}
}
