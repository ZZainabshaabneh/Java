package Ass3;

import java.util.Date;

public class OrderItem extends Order{
private long productID;
private String description;
private double price;
private int quantity;
public OrderItem( long customerId,String name,String address,Customer customer,Date date,long productID,String description,double price,int quantity) {
	super( customerId,  name,  address, customer, date);
	this.description=description;
	this.price=price;
	this.productID=productID;
	this.quantity=quantity;
}

public long getProductID() {
	return productID;
}

public void setProductID(long productID) {
	this.productID = productID;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public int getQuantity() {
	return quantity;
}

public void setQuantity(int quantity) {
	this.quantity = quantity;
}

public double subTotal() {
	
	return ((this.getPrice()) * (this.getQuantity()));
}

public void printOrderItems() {
	   System.out.println("Product ID: "+this.getProductID() );
    System.out.println("Description: " +this.getDescription() );
    System.out.println("Price: " +this.getPrice()  );
    System.out.println("Quantity: " +this.getQuantity() );
    System.out.println("Subtotal: " +this.subTotal() );
}
@Override
public String toString() {
	return "OrderItem [productID=" + productID + ", description=" + description + ", price=" + price + ", quantity="
			+ quantity + "]";
}

@Override
public int compareTo() {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public void createOrder() {
	// TODO Auto-generated method stub
	
}

}
