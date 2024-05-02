package company;
import java.util.*;
public class salespeople {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		double Sales [][]=new double [4][5];
		double []Total=new double [4];
		int n=0;
		 while(n!=30) {
		for(int i=0;i<Sales.length;i++) {
			for(int j=0;j<Sales[i].length;j++) {
				System.out.printf("enter the sale [%d][%d]",i,j);
				Sales [i][j] = input.nextDouble(); //fill the array 
			}
		 
		}
		n++;
		 }
		int s=0;
		System.out.printf("pro\t",s+1);
		while(s!=5) {
			System.out.printf("Sp%d\t",s+1);
		s++;
		
		}
		System.out.println("");
		for(int i=0;i<Sales.length;i++) {
			System.out.printf("p%d\t",i+1);
			for(int j=0;j<Sales[i].length;j++) {
				
				 System.out.print( +Sales[i][j]+"\t");
			 }
			
			System.out.println(" ");
				
			}
		System.out.print("\t");
		s=0;
		while(s!=5) {
			System.out.print("the total sales is \t"+SumColums(Sales,5));
		s++;
		
		}
		s=0;
		while(s!=5) {
			System.out.print("the total products is \t"+SumRows(Sales,5));
		s++;
		
		}
		
		
			}
	
public static double SumColums(double sales [][],int Index) {
 
	 double total = 0.0;
	    for (int i = 0; i < sales.length; i++) {
	        total += sales[i][Index];
	    }
	    return total;
	  
}
public static double  SumRows(double sales [][],int Index) {
	 
	 double total = 0.0;
	    for (int j = 0; j < sales[Index].length; j++) {
	        total += sales[Index][j];
	    }
	return total;
	 
}


}


