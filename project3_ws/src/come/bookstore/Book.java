package come.bookstore;


import java.util.LinkedList;

public class Book {

	private String title; 
	private String author; 
	private String ISBN; 
	private double price; 
	
	Book()
	{
	}
	
	Book(String title, String author, String ISBN, double price)
	{
		super(); 
		this.title=title; 
		this.author=author; 
		this.ISBN=ISBN; 
		this.price=price; 
	}
	
	public void addBook(Book b)
	{
		LinkedList a = new LinkedList();
		a.add(b); 
		
	}
	
	public String getTitle()
	{
		return title; 
	}
	
	
	public String getAuthor()
	{
		return author; 
	}
	
	public String getISBN()
	{
		return ISBN; 
	}
	
	public double getPrice()
	{
		return price; 
	}
	
}
