package com.bookservices;



public class Order {

	String status; 
	
	//order status 
	protected String status(String ordernumber)
	{
		return status; 
	}
	?
	protected void cancel(String ordernumber)
	{
		
	}
	
	//ship order
	protected void ship(String ordernumber)
	{
		status = "shipped"; 
	}
	
	//Google API pickup locations
	protected void pickupLocations(String ordernumber)
	{
		
	}
	
	//place order
	protected void placeOrder(String ordernumber)
	{
		
	}
	
	
	
	
	
	
	
	
	
}
