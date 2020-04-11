package library;
import java.util.Scanner;
public class Program {
	public static void showMenu() {
		System.out.println("======== Main menu ========");
		System.out.println("1. Show library infomation");
		System.out.println("2. Add new book");
		System.out.println("3. Find book");
		System.out.println("4. Borrow a book");
		System.out.println("5. Return a book");
		System.out.println("6. Exit");
		System.out.println("===========================");
		int n;
		System.out.println("Enter menu ID (1-6):");
		Scanner in = new Scanner(System.in);
		do {
		n =in.nextInt();
		}
		while(n < 1 || n > 6);
	    switch(n) {
	    case 1: {
	    	Library l1 = new Library();
	    	l1.showLibraryInfo();
	    	showMenu();
	    	break;
	    }
	    case 2: {
	    	Library l1 = new Library();
	    	l1.addNewBook();
	    	showMenu();
	    	break;
	    }
	    case 3: {
	    	Library l1 = new Library();
	    	l1.findBook();
	    	showMenu();
	    	break;
	    }
	    case 4: {
	    	Library l1 = new Library();
	    	l1.borrowBook();
	    	showMenu();
	    	break;
	    }
	    case 5: {
	    	Library l1 = new Library();
	    	l1.returnBook();
	    	showMenu();
	    	break;
	    }
	    case 6: {
	    	System.out.println("Thank you! See you again!");
	    	break;
	    }
	    default:
	    	System.out.println("Wrong option !");
	    	showMenu();
		}
				
		in.close();

	}
	
	public static void main(String[] args) {
		showMenu();

}
}
