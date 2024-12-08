package org.tnsif.capgemini.c2tc.ArrayDemo;

class Book
{
	String title;
	String author;
	double price;
	
	public Book(String title, String author, double price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	void display()
	{
		System.out.println("Title: "+title+", Author: "+author+", Price: "+price);
	}
}

public class ArrayOfObject {

	public static void main(String[] args) {
		Book[] books = new Book[3];
		
		books[0] = new Book("Java","Vishnu", 1000);
		books[1] = new Book("C++","Indu", 3000);
		books[2] = new Book("Python","Anusha", 2500);
        
		for(Book book : books) {
			book.display();
		}
		

	}

}
