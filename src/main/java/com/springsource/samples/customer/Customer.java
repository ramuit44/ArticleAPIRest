package com.springsource.samples.customer;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;


/**
 * Domain class for customers.
 * 
 * @author Sriram Puvvada
 */
@Data
@XmlRootElement
public class Customer {

    private CustomerNumber number;

    public CustomerNumber getNumber() {
		return number;
	}


	public void setNumber(CustomerNumber number) {
		this.number = number;
	}


	private String firstname;
    public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	private String lastname;


    protected Customer() {

    }


    public Customer(CustomerNumber number, String firstname, String lastname) {

        this.number = number;
        this.firstname = firstname;
        this.lastname = lastname;
    }


    public String getName() {

        return String.format("%s %s", firstname, lastname);
    }


    public boolean isNew() {

        return number == null;
    }
}
