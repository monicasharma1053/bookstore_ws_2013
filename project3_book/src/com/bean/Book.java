package com.bean;

import java.io.Serializable;
import java.util.Set;

import javax.jws.WebService;

@WebService(targetNamespace = "http://bean.com/", portName = "BookPort", serviceName = "BookService")
public class Book implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String gid;
	private String author;
	private String title;
	private String ISBN; 
	private double price; 
	private Set<String> privileges;
	
	public Book() {} 
	
	public Set<String> getPrivileges() {
		return privileges;
	}
	
	public void setPrivileges(Set<String> privileges) {
		this.privileges = privileges;
	}
	
	public void setPrice(double price){
		this.price = price; 
	}
	
	public double getPrice(){
		return price; 
	}
	
	public String getAuthor() {
		return author; 
	}
	
	public void setAuthor(String author)
	{
		this.author=author; 
	}
	
	public String getGid() {
		return gid;
	}

	public void setGid(String gid) {
		this.gid = gid;
	}
	
	public String getTitle(){
		return title; 
	}
	
	public void setTitle(String title)
	{
		this.title = title; 
	}
	
	public String getISBN(){
		return ISBN;
	}
	
	public void setISBN(String ISBN)
	{
		this.ISBN=ISBN; 
	}
	
	public boolean isUserInRole(String role) {
		if(privileges == null) { return false; }
		else { return privileges.contains(role); }
	}

	
	
	
}
