
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

@XmlRootElement(name = "setISBN", namespace = "http://bean.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setISBN", namespace = "http://bean.com/")

public class SetISBN {

    @XmlElement(name = "arg0")
    private java.lang.String arg0;

    public java.lang.String getArg0() {
        return this.arg0;
    }

    public void setArg0(java.lang.String newArg0)  {
        this.arg0 = newArg0;
    }

}

