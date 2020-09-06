package encapsulationPrograms;

public class Book {

	
	private String Bookname;
	private String author;
	private int price;
	
	public Book(String Bookname,String author,int price)
	{
		
		this.Bookname=Bookname;
		this.author=author;
		this.price=price;
		
			
	}
	public String getName()
	{
		return Bookname;
	}
	
	public String getAuthor() {
		
		return author;
	}
	
	public int getPrice() {
		
		return price;
	}
	
	
	
}
