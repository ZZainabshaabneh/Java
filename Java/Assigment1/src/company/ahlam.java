package company;

import java.util.*;

public class ahlam {

	public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        double[][] sales = new double[5][4];
	        int salesperson;
	        int product;
	        double value;
	        for(int i=0;i<sales.length;i++) {
				for(int j=0;j<sales[i].length;j++) {
					System.out.printf(" the sale [%d][%d]",i,j);
					sales [i][j] = input.nextDouble(); //fill the array 
				}
			 
			}
	        System.out.printf("%10s%10s%10s%10s%10s%10s\n", "Product", "Salesperson 1", "Salesperson 2", "Salesperson 3", "Salesperson 4", "Total");
	        for (int i = 0; i < 5; i++) {
	            double total = 0;
	            System.out.printf("%10d", i + 1);
	            for (int j = 0; j < 4; j++) {
	                System.out.printf("%10.2f", sales[i][j]);
	                total += sales[i][j];
	            }
	            System.out.printf("%10.2f\n", total);
	        
	        }
	}
	public static double  row(double sales [][],int i) {
		 
		 double total = 0.0;
		    for (int j = 0; j < sales[i].length; j++) {
		        total += sales[i][j];
		    }
		return total;
		 
	}
	
	public static double colums(double sales [][],int r) {
		 
		 double total = 0.0;
		    for (int i = 0; i < sales.length; i++) {
		        total += sales[i][r];
		    }
		    return total;
		  
	}
	

}