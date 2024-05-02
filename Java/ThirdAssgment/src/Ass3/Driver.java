package Ass3;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Driver {
 	public static void main(String[] args) {
		int choice=0;
		Date date= new Date();
		//Order o=new Order( C1, C1, date);
		Scanner input = new Scanner(System.in);
		Customer C1 = new Customer(1452,"zainab", "hi");
		 ArrayList<Customer> customerList = new ArrayList<>();
		 while(choice!=6) {
			 menu();
			 System.out.println("Enter Your Choice");
				choice=input.nextInt();
				if(choice==1) {
					System.out.println("Write customer’s details");
					System.out.println("Enter the customer Id");
					C1.setCustomerId(input.nextLong());
					System.out.println("Enter the customer name");
					C1.setName(input.nextLine());
					System.out.println("Enter the customer Address");
					C1.setAddress(input.nextLine());
					for(int i=0;i<customerList.size();i++) {
						if(customerList.get(i).getCustomerId()==customerList.get(i+1).getCustomerId()) {
							System.out.println(customerList.get(i).equal(customerList.get(i+1))); 
							customerList.remove(i);
						}
					}
					customerList.add(C1);
					
				}
				if(choice==2) {
					newOrder( customerList);
				}
				if(choice==3) {
					System.out.println("Enter the customer Id");
					C1.setCustomerId(input.nextLong());
					
					for(int i=0;i<customerList.size();i++) {
						if(customerList.get(i).getCustomerId()==customerList.get(i+1).getCustomerId()) {
							 
						//	customerList.sort(o.getOrderData);
						}
					}
				}
				if(choice==4) {
					System.out.println("the customer is already on the list : "+customerList);
				}
				
		 }
	}
	public static void menu() {
		System.out.println("1) Adding a new customer to the customer list\n2) Make a new Order\n3) Display Customer’s Orders\n4) Quit");
	}
	private static void newOrder(ArrayList<Customer> customerList) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Enter the customer ID:");
        int Id = scanner.nextInt();
        Date date =new Date();
        Customer C1 = new Customer(Id,"zainab", "hi");
        for(int i=0;i<customerList.size();i++) {
			if(customerList.get(i).getCustomerId()==customerList.get(i+1).getCustomerId()) {
				System.out.println(customerList.get(i).equal(customerList.get(i+1))); 
				Order order = null ;
		        System.out.println("Enter the order type (1 for Mail order, 2 for Phone order):");
		        int choice = scanner.nextInt();
		        scanner.nextLine(); // Consume the newline character

		        switch (choice) {
		            case 1:
		                order = new MailOrder( Id,"zainab", "hi",C1, date);
		                break;
		            case 2:
		                order = new PhoneOrder( Id,"zainab", "hi",C1, date);
		                break;
		            
		        }

		       
		        customerList.add(order);
		        order.createOrder();
		        order.printOrder();
		        //order.pritOrderItem();
			}
		
        }
       
        
        
    }
}
