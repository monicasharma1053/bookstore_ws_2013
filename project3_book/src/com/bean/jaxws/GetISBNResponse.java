
package com.bean.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 2.7.2
 * Thu Feb 28 20:50:21 CST 2013
 * Generated source version: 2.7.2
 */

@XmlRootElement(name = "getISBNResponse", namespace = "http://bean.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getISBNResponse", namespace = "http://bean.com/")

public class GetISBNResponse {

    @XmlElement(name = "return")
    private java.lang.String _return;

    public java.lang.String getReturn() {
        return this._return;
    }

    public void setReturn(java.lang.String new_return)  {
        this._return = new_return;
    }

}

