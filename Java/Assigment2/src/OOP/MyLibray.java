package OOP;
import java.util.*;
//zainab shaabneh 1182820
public class MyLibray {

	public static void main(String[] args) {
		int choice=0;
		String title;
		int Copyright;
		 int numCopies;
		Scanner input = new Scanner(System.in);
		BookIndex B = new BookIndex();
		BookIndex books[] = new BookIndex[6];
		
		 //edit
	    books[0] = new BookIndex("Calculas", "Alaa ", 10, 2005);
	    books[1] = new BookIndex("Physics", "Ghassan ", 5, 2008);
	    books[2] = new BookIndex("Math", "Batool ", 7, 2002);
	    books[3] = new BookIndex("Ethic", "Abdel Salam ", 3, 2015);
	    books[4] = new BookIndex("RealTime", "Hana ", 2, 2012);
	    books[5] = new BookIndex("Java", "Mohammed ", 8, 2021);
		LibraryCatalog L= new LibraryCatalog();
		 
		 while(choice!=6) {
			 menu();
				System.out.println("Enter Your Choice");
				choice=input.nextInt();

			 if(choice==1) {
				 System.out.println("Enter the title of the book");
				  title=input.next();
				 if(L.FIND(title)) {
					  L.addNewBook(B);
				       System.out.println("Enter how many extra copies s/he would like to add to the library");
					   numCopies=input.nextInt();
					   L.add_copies(title, numCopies);
				 }
				 else {
					  System.out.println("Rest of the information (author, number of copies, and copyright)");
				      System.out.println("Enter the title of the book");
				      title=input.next();
				       B.setTitle(title);
				       System.out.println("Enter Copies s/he would like to add to the library");
			          numCopies=input.nextInt();
				       B.setCopies(numCopies);
				       System.out.println("Enter copyright s/he would like to add to the library");
				       Copyright=input.nextInt(); 
				       B.setCopyright(Copyright);
				 }
					 
				
				 
			 }
			 if(choice==2) {
				 System.out.println("Enter the book's title");
				 title=input.next();
				 if(L.FIND(title)) {
					 B.toString(); 
				 }
				 System.out.println("The Book Is Not Available In The Library");
			 }
			 
			 if(choice==3) {
				 System.out.println("Enter the book's title");
				 title=input.next();
				 if(L.FIND(title)) {
					 B.toString(); 
					 System.out.println(" the book has been successfully loaned to the user and must be returned in 10 days");
				 }
				 System.out.println("the book is not available in the library.");
			 }
			 if(choice==4) {
				 System.out.println("Enter the book's title");
				 title=input.next();
				 if(L.FIND(title)) {
					 System.out.println(" the book has been successfully returned and thank the user for returning the book on time");
				 }
				 System.out.println("a book with the entered title has not been found in the library, and ask the user to re-repeat the search.");
			 }
			 if(choice==5) {
				 L.list_titles();
			 }
		 }

	}
public static void menu() {
	System.out.println("1) Add a book to the Library Catalog\n2) Search a book\n3) Borrow a Book\n4) Return a Book\n5) List all the book titles in Library Catalog\n6) Quit");
}
}
