package Ass3;

import java.util.*;

public class PhoneOrder extends Order  {
private int callDuration;
private String customerRepresntive;
Scanner input = new Scanner(System.in);
public PhoneOrder( long customerId,String name,String address,Customer customer,Date date) {
   super(customerId,name,address,customer,date);
}

public int getCallDuration() {
	return callDuration;
}

public void setCallDuration(int callDuration) {
	this.callDuration = callDuration;
}

@Override
public String toString() {
	return super.toString()+"PhoneOrder [callDuration=" + callDuration + ", customerRepresntive=" + customerRepresntive + "]";
}
@Override
public void createOrder() {
	  System.out.println("Enter the name of the customer representative:");
	  customerRepresntive = input.nextLine();
      System.out.println("Enter the call duration:");
      callDuration = input.nextInt();
       
}
@Override
public int compareTo() {
	return this.getOrderData().compareTo(this.getOrderData());
	 
}

}
