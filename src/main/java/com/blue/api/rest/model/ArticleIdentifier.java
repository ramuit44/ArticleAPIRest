package com.blue.api.rest.model;

import java.util.UUID;

import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import lombok.Data;

import com.blue.api.rest.internal.ArticleIdentifierTypeAdapter;


/**
 * Value object for {@link Customer} numbers.
 * 
 * @author Sriram Puvvada
 */
@Data
@XmlType
@XmlJavaTypeAdapter(ArticleIdentifierTypeAdapter.class)
public class ArticleIdentifier {
	
	public ArticleIdentifier (String number){
		this.number = number;
	}

    private String number;


    @Override
    public String toString() {
        
        return number;
    }


    /**
     * Creates a new random {@link ArticleIdentifier}.
     * 
     * @return
     */
    public static ArticleIdentifier next() {

        return new ArticleIdentifier(UUID.randomUUID().toString());
    }


	public String getNumber() {
		return number;
	}


	public void setNumber(String number) {
		this.number = number;
	}
    
    
}
