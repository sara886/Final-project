import java.util.*;
public class library {

	public static void main(String[] args) {
		ArrayList<book> books= new ArrayList<book>();
		
	   //books=GetBookInformation();
	   book book1=new book();
	   book book2=new book();
	   book book3=new book();
	   book1.name="sara";
	   book1.auther="habo";
	   book1.copies=3;
	   book2.name="salma";
	   book2.auther="habo";
	   book2.copies=2;
	   book3.name="love";
	   book3.auther="gigi";
	   book3.copies=5;
	   books.add(0,book1);
	   books.add(1,book2);
	   books.add(2,book3);


		ArrayList<user> users= new ArrayList<user>();
		//users=GetUserInformation();
		int operation=0;
		while(operation!=-1){
			System.out.println(" Which one of the flowing operation would you like to do, please press ");
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
			if(operation==1){ InsertBook(books); }
			else if(operation==3){int book_index=BookSearch(books);}
			else if(operation==6){CopyDelete(books);}
		
		}
	
	}
		public static ArrayList<book> GetBookInformation(){
		System.out.println("Welcom, you need first to insert the information of the books already exixst in the library");
		ArrayList<book> books=new ArrayList<book>();
		
		System.out.println("please enter number of books you want to insert");
		Scanner input=new Scanner(System.in);
		int num_book=input.nextInt();
		for(int i=0;i<num_book;i++){
			book book1=new book();
			System.out.println("please enter the book name");
			book1.name=input.next();
			book1.name=book1.name.toLowerCase();
			System.out.println("please enter date of puplish in the format Month/Year");
			book1.date=input.next();
			System.out.println("please enter Auther's name");
			book1.auther=input.next();
			book1.auther=book1.auther.toLowerCase();
            System.out.println("please enter number of copies");
			book1.copies=input.nextInt();
			books.add(book1);
		}
		return books; 
	}
		
		
		public static ArrayList GetUserInformation(){
			ArrayList<user> users=new ArrayList<user>();
			System.out.println("please insert users information");
			System.out.println("please enter number of users you want to insert");
			Scanner input=new Scanner(System.in);
			int num_user=input.nextInt();
			user user1=new user();
			for(int i=0;i<num_user;i++){
			System.out.println("please enter user's ID");
			user1.ID=input.nextInt();
			}
			return users;
			}
		
		
		public static int BookSearch (ArrayList<book> books){
			System.out.println("If you want to search for the book by its name or you are in the process of inserting a new book please enter 1 to make sure the book doesn't already exixt");
			System.out.println("If you want to search for the book by its auther please enter  2");
			Scanner input=new Scanner(System.in);
			int operation=input.nextInt();
			int book_index=-1;
			if(operation==1){
				System.out.println("please enter the book's name");
				String book_name=input.next();
				for(int i=0;i<books.size();i++){
					if(books.get(i).name.equals(book_name.toLowerCase())){
						System.out.println("number of copies of "+book_name+" is "+ books.get(i).copies);
						book_index=i;
						}
					}
			}
			if(operation==2){
				System.out.println("please enter the book's auther");
				String book_auther=input.next();
				for(int i=0;i<books.size();i++){
					if(books.get(i).auther.equals(	book_auther.toLowerCase())){
						System.out.println("number of copies of "+book_auther+"'s "+books.get(i).name+" is "+ books.get(i).copies);
						book_index=i;
					}
				}
			}
			if( book_index==-1) System.out.println("Book is not found");
			
			return book_index;
		}
		
		
		public static void InsertBook(ArrayList<book>books){
			
			System.out.println("please enter number of books you want to insert");
			Scanner input=new Scanner(System.in);
			int num_book=input.nextInt();
			for(int i=0;i<num_book;i++){
				book book1=new book();
				System.out.println("please enter the book name");
				book1.name=input.next();
				int book_index=BookSearch(books);
				if(book_index!=-1){
					books.get(book_index).copies++;
				}else{
				book1.name=book1.name.toLowerCase();
				System.out.println("please enter date of puplish in the format Month/Year");
				book1.date=input.next();
				System.out.println("please enter Auther's name");
				book1.auther=input.next();
				System.out.println("please enter number of copies");
				book1.copies=input.nextInt();
				books.add(book1);
				}
				
				
			}
		}
		
		public static void CopyDelete(ArrayList<book>books){
		Scanner input=new Scanner(System.in);
		System.out.println("please insert name of the book");
		String book_name=input.next();
		for(int i=0;i<books.size();i++){
			if(books.get(i).name.equals(book_name.toLowerCase())){
				if(books.get(i).copies==0){
					System.out.println("The book has no copies in the library right now");
				}else{
					books.get(i).copies--;
					System.out.println("the copy is deleted succsessfully");
				}
				
			}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
