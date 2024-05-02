package OOP;

public class LibraryCatalog {
     int num=6;
     int counter=0;
	BookIndex[] B = new BookIndex[num];
	
    public LibraryCatalog(){
	 
	}
    
	 
	public void addNewBook(BookIndex b) {
		addNewBook(b,0);//overload
       if(counter<6) {
		 B[counter]=b;
		 counter++;
		}
       else
         System.out.println("OUT OF RANGE");
		
		
		 
	}
	public void addNewBook(BookIndex R,int ncopies) {
		if(counter<6) {
			 R.setCopies(ncopies);
		 B[counter]=R;
		 counter++;
		}
		else
		  System.out.println("OUT OF RANGE");
	}
	public int findInCatalog(String title) {
		//return number of copies of a book
		for(int i=0;i<B.length;i++) {
			if(title==B[i].getTitle())
				return B[i].getCopies();
		}
		return 0;
	}
	public boolean add_copies(String title, int quantity) {
		 
		for(int i=0;i<B.length;i++) {
			if(title.compareToIgnoreCase(B[i].getTitle())==0)
				B[i].setCopies(quantity);
		}
		
		return false;
	}
	public int searchBook(String title) {
		for(int i=0;i<B.length;i++) {
			if(title.compareToIgnoreCase(B[i].getTitle())==0)
				return i;
		}
		return -1;
	}
	public void list_titles() {
		for(int i=0;i<B.length;i++) {
			System.out.printf("The Title of %d is %s",i,B[i].getTitle());
			System.out.println();
			System.out.println("The Number of Copies is "+B[i].getCopies());
			System.out.println("The Author is "+B[i].getAuthor());
			System.out.println("The Copyright is "+B[i].getCopyright());

		}
	}
	public boolean borrowBook(String title) {
		for(int i=0;i<B.length;i++) {
			if(title.compareToIgnoreCase(B[i].getTitle())==0)
				if(B[i].getCopies()>0)
					B[i].setCopies(B[i].getCopies()-1);
			  
		}
		return false;
	}
	public boolean FIND(String title) {
		for(int i=0;i<B.length;i++) {
			if(title.compareToIgnoreCase(B[i].getTitle())==0)
				return true;
			  
		}
		return false;
	}
	public boolean returnBook(String title) {
		for(int i=0;i<B.length;i++) {
			if(title.compareToIgnoreCase(B[i].getTitle())==0)
				B[i].setCopies(B[i].getCopies()+1);
			    return true;
			  
		}
		return false;
	}
}

