package encapsulationPrograms;

import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		
		
		
		
		
		Book b=new Book("java", "ratan", 500);
		//b.setPrice();
		
		System.out.println("Book  Name is:"+b.getName());
		System.out.println("Book author is:"+b.getAuthor());
		System.out.println("price of book is:"+b.getPrice());
		
		
		
	}

}
