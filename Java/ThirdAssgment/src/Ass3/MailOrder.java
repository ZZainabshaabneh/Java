package Ass3;

import java.util.*;

public class MailOrder extends Order implements Comparable{
Scanner input = new Scanner(System.in);
private Date postDate;

public MailOrder( long customerId,String name,String address,Customer customer,Date date) {
	   super(customerId,name,address,customer,date);
}
public Date getPostDate() {
	return postDate;
}
public void setPostDate(Date postDate) {
	this.postDate = new Date();
}
@Override
public String toString() {
	return super.toString()+"MailOrder [postDate=" + postDate + "]";
}
@Override
public void createOrder() {
     System.out.println("Enter  post date:");
     this.postDate = postDate;
}
 
public int compareTo() {
	System.out.println("hello");
	return 0;
}
}
