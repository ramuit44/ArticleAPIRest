package com.blue.api.rest.internal;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import com.blue.api.rest.model.ArticleIdentifier;


/**
 * @author Sriram Puvvada
 */
public class ArticleIdentifierTypeAdapter extends
        XmlAdapter<String, ArticleIdentifier> {

    /*
     * (non-Javadoc)
     * 
     * @see
     * javax.xml.bind.annotation.adapters.XmlAdapter#marshal(java.lang.Object)
     */
    @Override
    public String marshal(ArticleIdentifier v) throws Exception {

        return v.getNumber();
    }


    /*
     * (non-Javadoc)
     * 
     * @see
     * javax.xml.bind.annotation.adapters.XmlAdapter#unmarshal(java.lang.Object)
     */
    @Override
    public ArticleIdentifier unmarshal(String v) throws Exception {

        return new ArticleIdentifier(v);
    }
}
