package assignment6;

public class BookDTO {
	public String title;
	public String author;
	private int ID;
	public int price=500;
	static int totalBooks=7;
	
	
	String getTitle() {
		return title;
	}
	void setTitle(String title) {
		this.title=title;
	}
	String getAuthor() {
		return author;
	}
	void setAuthor(String author) {
		this.author=author;
	}
	int getID() {
		return ID;
	}
	void setID(int id) {
		this.ID=id;
	}
	
	public static void main(String[] args) {
		BookDTO obj=new BookDTO();
		obj.setTitle("Harry Potter");
		obj.setAuthor("J.K.Rowling");
		obj.setID(256);
		System.out.println("Book Title: "+obj.getTitle());
		System.out.println("Author: "+obj.getAuthor());
		System.out.println("Book ID: "+obj.getID());
		System.out.println("Number of Series of books: "+totalBooks);
		System.out.println("Price for each book: "+obj.price);
	}

}
