package Ass3;

import java.util.*;

public abstract class Order extends Customer   implements Comparable{
private long id;
private Customer customer;
private Date date;
private int itemCount=0;
private ArrayList<OrderItem>orderItems=new  ArrayList<OrderItem>();
private int orderSequential;
public Order( long customerId,String name,String address,Customer customer,Date date) {
	super(   customerId,  name,  address);
	this.customer=customer;
	this.date=new Date();
}
public abstract void createOrder();

public int compareTo(Order O) {
	//write the code
	return 0;
}
public String getCustomerInfo() {
	 System.out.println(" Customer Details ");
     System.out.println("Customer ID: " +this.getCustomerId());
     System.out.println("Customer Name: " + this.customer.getName());
     System.out.println("Customer Address: " + this.customer.getAddress());
	return getCustomerInfo();
}
public String getOrderData() {
	//your code
	return getOrderData();
}
public long getOrderID() {
	
	
	return getOrderID();
}
public double getTotal() {
	return 0;
}
public void printOrder() {
	 System.out.println(" Order Details ");
     System.out.println("Order ID: " +getOrderID());
     System.out.println("Customer Name: " + Order.super.getName());
     System.out.println("Customer Address: " + Order.super.getAddress());

}

@Override
public String toString() {
	return "Order [id=" + id + ", customer=" + customer + ", date=" + date + ", itemCount=" + itemCount
			+ ", orderSequential=" + orderSequential + "]";
}

}
