package com.dao;

import java.util.*;

import com.bean.Book;

public class BookDAO {
	
	private Book book = new Book(); 
	protected LinkedList b = new LinkedList(); 
	
	public BookDAO(){
		book.setAuthor("John");
		book.setTitle("The moves like jagger"); 
		book.setISBN("1053"); 
		Set privileges = new HashSet();
		privileges.add("baby doll"); 
		book.setPrivileges(privileges); 
		book.setGid("10531053"); 
	}
	
	public void addBooks()
	{
		b.add(book); 
	}

	public void cancelOrder()
	{
		b.remove(book); 
	}
	
	public void searchBooks(String someTitle)
	{
	Iterator i = b.iterator(); 
	while(i.hasNext()){
		Object element = i.next(); 
		if(element == someTitle)
		{
			System.out.println(someTitle+" is in stock!"); 
		}
	}
	}
	
	public Book getAuthor(String gid){
		return book; 
	}
	

}
