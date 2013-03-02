package com.dao;

import java.util.*;

import com.bean.Book;

public class BookDAO {
	
	private Book book = new Book(); 
	
	public BookDAO(){
		book.setAuthor("John");
		book.setTitle("The moves like jagger"); 
		book.setISBN("1053"); 
		Set privileges = new HashSet();
		privileges.add("baby doll"); 
		book.setPrivileges(privileges); 
		book.setGid("10531053"); 
	}
	
	public Book getAuthor(String gid){
		return book; 
	}
	

}
