package come.bookstore;

import java.util.*; 


public class Bookstore {

	
	//add book to bookstore 
	//search for book in bookstore
	//purchase books 
	//order books 
	//retrieve order status 
	//cancel order
	
	//public void addBooks()
	//{
	//	Book b = new Book(); 
	//}
	
	 public static void main(String[] args) throws Exception {
         double amount = 0.0;
         double sum = 0.0;
         int count = 1;
         //List list = new ArrayList();
         
         LinkedList list = new LinkedList(); 
         Scanner scan = new Scanner(System.in);
         int menu = 0;
         System.out.println("Book Store");
         System.out.println();
         System.out.println("1. Buy book");
         System.out.println("2. Receipt");
         System.out.println("3. Receive Payment");
         System.out.println("4. Exit");
         boolean quit = false;
         boolean cancel = false; 
         do {
                 if (count > 5) {
                         System.out
                                         .println("You cannot buy more than 5 books at a time.");
                 }
         System.out.print("Please enter your choice: ");
         menu = scan.nextInt();
         System.out.println();
         
         //case1: buy book
         //case2:receipt
         //case3:receive payment
         //case4: exit
         
         
         
         switch (menu) {
         case 1:
         count++;
         System.out.println("Book Title: ");
         String booktitle = scan.next();
         System.out.println("Author: ");
         String auth = scan.next();
         System.out.println("ISBN: ");
         //int no = scan.nextInt();
         String no = scan.next(); 
         System.out.println("Price: ");
         double p = scan.nextDouble();
         //System.out.println("Discount: ");
         //double dis = scan.nextDouble();
         //double total = p - (dis * p);
         double total = p; 
         //list.add(new Books(booktitle,auth, no, p,dis, total)); 
         list.add(new Book(booktitle, auth, no, total));
         break;
         case 2:
         System.out.println("Title Author ISBN Price Discount Total");
         //for (Books s : list) {
         //for(Book s : list){
          
         for(Book s = new Book(); ((Iterator<String>) list).hasNext()== true; ){
         //System.out.println(s.getTitle() + " " + s.getAuthor()  
         //+ " "   + s.getIsbn() + " "+ s.getPrice() + " "+ 
         //s.getDiscount() + " " + s.getTotal());
         System.out.println(s.getTitle()+ " "+ s.getAuthor()+ " "+ s.getISBN()+" "+s.getPrice()); 
        	 
        	 sum += s.getPrice();
                         }
                 System.out.println("Total= " + sum);
                 break;
                 case 3:
                 System.out.println("Customer Pays: ");
                 amount = scan.nextDouble();
                 double balance = amount - sum;
                 System.out.println("Balance is: " + balance);
                 quit = true;
                 break; 
                 //case 4:
                 //quit = true;
                 //break;
                 //default:
                 //System.out.println("Invalid Entry!");
                 case 4: 
                 cancel = true;
                 for(int i =0; i<1; i++)
                 {
                	 list.pop(); 
                 }
                 break; 
                 case 5:
                     quit = true;
                     break;
                     default:
                     System.out.println("Invalid Entry!");
                	 
                 }
         } while (!quit);
 }
}
	
