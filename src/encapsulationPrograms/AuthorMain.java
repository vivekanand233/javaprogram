package encapsulationPrograms;

import java.util.Scanner;

public class AuthorMain {

	public static void main(String[] args) {
		
		
		
		
		Author a=new Author();
		a.setAuthorName("Dr.APJ ABDUL KALAM");
		a.setAge(45);
		a.setPlace("DELHI");
		
		System.out.println("Author name is:"+a.getAuthorName());
		System.out.println("Author age is:"+a.getAge());
		System.out.println("Author place is:"+a.getPlace());
	}

}
