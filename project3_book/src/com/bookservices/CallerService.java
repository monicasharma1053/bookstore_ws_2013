package com.bookservices;

 
import java.util.HashMap;
import java.util.Map;
import java.net.*;
import java.io.*;


public class CallerService {
private Map finalMap = new HashMap();
private String resultString;
 
public void deformatNVP()
{
try
{
String delims = "[&]";
String equals = "[=]";
String[] tokens = this.resultString.split(delims);
 
for(int i = 0; i < tokens.length; i++)
{
String[] newTokens = tokens[i].split(equals);
this.finalMap.put(URLDecoder.decode(newTokens[0], "UTF-8"), URLDecoder.decode(newTokens[1], "UTF-8"));
}
 
} catch (Exception e) {
System.out.println(e.toString());
}
//return finalMap;
}
 
public Map post(String data)
{
try
{
//Connect to the url
URL url = new URL("https://api-3t.sandbox.paypal.com/nvp");
URLConnection conn = url.openConnection();
conn.setDoOutput(true);
OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
//Post the data
wr.write(data);
wr.flush();
 
// Get the response
BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
this.resultString = rd.readLine();
deformatNVP();
wr.close();
rd.close();
 
} catch (Exception e) {
System.out.println(e.toString());
}
return finalMap;
}
}