package OOP;

import java.util.Date;

public class BookIndex {
	private static String author;
	private static String title;
	private int copies;
	private int copyright;
	
  public BookIndex(String title , String author,int copies ,int copyright) {
		    this.title = title;
	        this.author = author;
	        this.copies = copies;
	        this.copyright = copyright;
	}
	public BookIndex( ) {
	   
         }

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getCopies() {
		return copies;
	}

	public void setCopies(int copies) {
		this.copies = copies;
	}

	public int getCopyright() {
		return copyright;
	}

	public void setCopyright(int copyright) {
		this.copyright = copyright;
	}

	@Override
	public String toString() {
		return "BookIndex [author=" + author + ", title=" + title + ", copies=" + copies + ", copyright=" + copyright + "]";
	}

}
