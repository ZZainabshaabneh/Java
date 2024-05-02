package Ass3;
import java.util.ArrayList;
import java.util.Date;
public class Customer  {
private long customerId;
private String name;
private String address;
private ArrayList<Order> orderList = new ArrayList<Order>();


public Customer( long customerId,String name,String address) {
 
	this.address=address;
	this.customerId=customerId;
	this.name=name;
}

public long getCustomerId() {
	return customerId;
}

public void setCustomerId(long customerId) {
	this.customerId = customerId;
}

public void setName(String name) {
	this.name = name;
}

public String getName() {
	return name;
}

 

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

@Override
public String toString() {
	return "Customer [customerId=" + customerId + ", name=" + name + ", address=" + address + "]";
}

public void displayOrder() {
     System.out.println(" Customer Orders ");
   
}
public boolean equal(Object Ob) {
	return true;
}

 
 
}
