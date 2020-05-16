import java.util.*;
public class library {

	public static void main(String[] args) {
		int operation=0;
		while(operation!=-1){
			System.out.println("Welcom, which one of the flowing operation would you like to do, please press ");
			System.out.println("1 for book insertion");
			System.out.println("2 for borrow");
			System.out.println("3 for searching for book");
			System.out.println("4 for check in");
			System.out.println("5 for searching for a user");
			System.out.println("6 for deleting a copy");
			System.out.println("7 for deleting a user");
			System.out.println("-1 to exit the program");
			Scanner input=new Scanner(System.in);
			 operation=input.nextInt();
			if (operation==1) InsertBook();
		}
	
	}
		public static void InsertBook(){
		System.out.println("please enter number of books you want to insert");
		Scanner input=new Scanner(System.in);
		int num_book=input.nextInt();
		book book[]=new book[num_book];
		for(int i=0;i<num_book;i++){
			System.out.println("please enter book name , puplishing date, auther");
			book book1=new book();
			book1.name=input.next();
			book1.date=input.next();
			book1.auther=input.next();
	
		}
		
		
	}

}
