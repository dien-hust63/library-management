package library;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import java.lang.Math;

public class Library {
	public static final int MAX_NUMBER_BOOKS = 100;
	private String libraryname = "LOCAL library";
	List<Book>  bookList= new ArrayList<Book>();

	public static int nbBooks;
	
	Scanner in = new Scanner(System.in);
	
	public void addNewBook() {
		System.out.println("Enter book's information:");
		
		System.out.println("(1)Book ID: ");
		int bookID =in.nextInt();
		
		System.out.println("(3)Amount: ");
		int amount = in.nextInt();
		
		
		System.out.println("(2)Book Title: ");
		String bookTitle= in.nextLine();
		
		
		bookList.add(new Book(bookID,bookTitle,amount));
		nbBooks = bookList.size();
		System.out.println("Insert sucessfully");
	   
	}
	
	
	public void findBook() {
		int n=0;
		System.out.println("Enter book ID that you want to find: ");
		
		int bookID = in.nextInt();
		
		for(Book book: bookList) {
			
			if(book.getBookID() == bookID) {
				book.showBookInfo();
				break;
			}
			n++;
		}
		if(n == bookList.size()) System.out.println(false);
		
	}
	public void findBook(String keyword) {
		
		int m = 0;
		for(Book book: bookList) {
			if(book.getBookTitle().toLowerCase().contains(keyword.toLowerCase())) {
				System.out.println(true);
				System.out.println(book.getBookTitle());
				m++;
			}
		if(m == 0) System.out.println(false);
		else System.out.println("Number of book Title: " + m);
		
		}
		
		
	}
	public void borrowBook() {
		System.out.print("Enter  book's ID: ");
		
		int bookID =in.nextInt();

		for(Book book: bookList) {
			if(book.getBookID() == bookID) {
				if(book.getAvailable()>0) {
					book.showBookInfo();
					System.out.println();
					System.out.println("This book is borrowed sucessfully");
					book.setAvailable(book.getAvailable()-1);
					book.showBookInfo();
				}
				else System.out.println("Sorry! Don't enough book");
				break;
			}
		}
	}
	public void returnBook() {
		System.out.print("Enter  book's ID: ");
		
		int bookID =in.nextInt();
	
		for(Book book: bookList) {
			if(book.getBookID() == bookID) {
				if(book.getAvailable() < book.getAvailable()) {
					book.setAvailable(book.getAvailable()+1);
					book.showBookInfo();
				}
				
			}
				
			}
		
	}
	public void showLibraryInfo() {
		System.out.println("Library name: " + libraryname);
		System.out.println("number of Book type: "+ nbBooks);
		System.out.println("List of book Title: ");
		for(Book book: bookList) {
			System.out.println(book.getBookTitle());
		}
		
		
	}
	public Book getALuckyBook() {
		int random_int = (int)(Math.random() * (100) + 1);
		
		Book b1 = bookList.get(random_int);
		System.out.println("A lucky book is: "+b1.getBookTitle());
		b1.setAvailable(b1.getAvailable()-1);
		b1.showBookInfo();
		return b1;
		
	}
	
}

