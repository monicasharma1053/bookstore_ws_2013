package com.bookservices;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.net.*;


public class DirectPayment {
 
/**
  * @param args the command line arguments
  */
//public static void main(String[] args) {

public void implementPaypal(){	
try
{
//Load the caller service
CallerService caller = new CallerService();
//Create a new map to hold the result
Map result = new HashMap();
 
// Construct data request string
String data = URLEncoder.encode("USER", "UTF-8") + "=" + URLEncoder.encode("msharm_1362092318_per@luc.edu", "UTF-8");
data += "&" + URLEncoder.encode("PWD", "UTF-8") + "=" + URLEncoder.encode("362096989", "UTF-8");

//not sure where to find signature value 
data += "&" + URLEncoder.encode("SIGNATURE", "UTF-8") + "=" + URLEncoder.encode("yoursignature", "UTF-8");
data += "&" + URLEncoder.encode("METHOD", "UTF-8") + "=" + URLEncoder.encode("DoDirectPayment", "UTF-8");
data += "&" + URLEncoder.encode("AMT", "UTF-8") + "=" + URLEncoder.encode("4.10", "UTF-8");
data += "&" + URLEncoder.encode("VERSION", "UTF-8") + "=" + URLEncoder.encode("80.0", "UTF-8");
data += "&" + URLEncoder.encode("IPADDRESS", "UTF-8") + "=" + URLEncoder.encode("192.168.1.0", "UTF-8");
data += "&" + URLEncoder.encode("PAYMENTACTION", "UTF-8") + "=" + URLEncoder.encode("Authorization", "UTF-8");
data += "&" + URLEncoder.encode("CREDITCARDTYPE", "UTF-8") + "=" + URLEncoder.encode("Visa", "UTF-8");
data += "&" + URLEncoder.encode("ACCT", "UTF-8") + "=" + URLEncoder.encode("4322713247967434", "UTF-8");
data += "&" + URLEncoder.encode("EXPDATE", "UTF-8") + "=" + URLEncoder.encode("102013", "UTF-8");
data += "&" + URLEncoder.encode("CVV2", "UTF-8") + "=" + URLEncoder.encode("123", "UTF-8");
data += "&" + URLEncoder.encode("FIRSTNAME", "UTF-8") + "=" + URLEncoder.encode("Monica", "UTF-8");
data += "&" + URLEncoder.encode("LASTNAME", "UTF-8") + "=" + URLEncoder.encode("Sharma", "UTF-8");
data += "&" + URLEncoder.encode("STREET", "UTF-8") + "=" + URLEncoder.encode("123", "UTF-8");
data += "&" + URLEncoder.encode("CITY", "UTF-8") + "=" + URLEncoder.encode("Papillion", "UTF-8");
data += "&" + URLEncoder.encode("STATE", "UTF-8") + "=" + URLEncoder.encode("NE", "UTF-8");
data += "&" + URLEncoder.encode("ZIP", "UTF-8") + "=" + URLEncoder.encode("68046", "UTF-8");
data += "&" + URLEncoder.encode("COUNTRYCODE", "UTF-8") + "=" + URLEncoder.encode("US", "UTF-8");
 
//Use the CallerService class and post the data to PayPal
result = caller.post(data);
 
//This will iterate through the entire response map
Iterator iter = result.entrySet().iterator();
while (iter.hasNext()) {
Map.Entry mEntry = (Map.Entry) iter.next();
System.out.println(mEntry.getKey() + " : " + mEntry.getValue());
}
 
//Now that you have a response check to see if it is a success
String ack = "" + result.get("ACK");
if("Success".equals(ack))
{
System.out.println("Congratulations your transaction was a success");
}
else
{
System.out.println("There was an error with your request.");
}
}
catch (Exception e)
{
System.out.println(e.toString());
}
}
}