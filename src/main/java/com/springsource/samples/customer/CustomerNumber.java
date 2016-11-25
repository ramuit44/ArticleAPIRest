package com.springsource.samples.customer;

import java.util.UUID;

import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import lombok.Data;

import com.springsource.samples.customer.internal.CustomerNumberTypeAdapter;


/**
 * Value object for {@link Customer} numbers.
 * 
 * @author Sriram Puvvada
 */
@Data
@XmlType
@XmlJavaTypeAdapter(CustomerNumberTypeAdapter.class)
public class CustomerNumber {
	
	public CustomerNumber (String number){
		this.number = number;
	}

    private String number;


    @Override
    public String toString() {
        
        return number;
    }


    /**
     * Creates a new random {@link CustomerNumber}.
     * 
     * @return
     */
    public static CustomerNumber next() {

        return new CustomerNumber(UUID.randomUUID().toString());
    }


	public String getNumber() {
		return number;
	}


	public void setNumber(String number) {
		this.number = number;
	}
    
    
}
