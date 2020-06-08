import java.util.*;
public class library {

	public static void main(String[] args) {
	   book[] books= new book[10];
	   //books=GetBookInformation(books);
	   member[] members= new member[10];
	   //members=GetmemberInformation(members);
       BorrowedBook[] Bbooks=new BorrowedBook[10];	   
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
	   books[0]=book1;
	   books[1]=book2;
	   books[2]=book3;

        BorrowedBook bbook1=new BorrowedBook();
        BorrowedBook bbook2=new BorrowedBook();
        BorrowedBook bbook3=new BorrowedBook();
        bbook1.name="love";
        bbook1.memberID=20;
        bbook1.duration=6;
        bbook1.date="22/5/2020";
        bbook2.name="sara";
        bbook2.memberID=30;
        bbook2.duration=2;
        bbook2.date="22/5/2020";
        bbook3.name="salma";
        bbook3.memberID=20;
        bbook3.duration=3;
        bbook3.date="22/5/2020";
        Bbooks[0]=bbook1;
        Bbooks[1]=bbook2;
        Bbooks[2]=bbook3;
		
		member member1=new member();
		member member2=new member();
		member member3=new member();
		member1.ID=20;
		member1.name="Ali";
		member2.ID=30;
		member2.name="Mai";
		member3.ID=40;
		member3.name="Sama";
		members[0]=member1;
		members[1]=member2;
		members[2]=member3;
  
		int operation=0;
        while(operation!=-1){
			System.out.println(" Which one of the flowing operation would you like to do, please press ");
			System.out.println("1 for book insertion");
			System.out.println("2 for borrow");
			System.out.println("3 for searching for book");
			System.out.println("4 for check in");
			System.out.println("5 for searching for a member");
			System.out.println("6 for deleting a copy");
			System.out.println("7 for deleting a member");
			System.out.println("-1 to exit the program");
			Scanner input=new Scanner(System.in);
			operation=input.nextInt();
			
			if(operation==1)      { InsertBook(books); }
			else if(operation==6) { CopyDelete(books);}
			else if(operation==7) {Deletemember(members,Bbooks);}
			else if(operation==2) { Borrow(books,members,Bbooks);}
			else if(operation==3) { int book_index=BookSearch(books);}
			else if(operation==4) { CheckIn(Bbooks,books);}
			else if(operation==5) { memberSearch(Bbooks,members);}
			
			
		
		}
	
	}
		public static book[] GetBookInformation(book[] books ){
		System.out.println("Welcom, you need first to insert the information of the books already exixst in the library");
		
		
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
			System.out.println("please enter number of copies");
			book1.copies=input.nextInt();
			System.out.println("please enter Auther's name");
			book1.auther=input.next();
			book1.auther=book1.auther.toLowerCase();
           
			for(int j=0;j<books.length;j++){
				if(books[j]==null){
					books[j]=book1;
					break;
				}
			}
		}
		return books; 
	}
		
		
		public static member[] GetmemberInformation(member[] members){
	        System.out.println("please enter number of members you want to insert");
			Scanner input=new Scanner(System.in);
			int num_member=input.nextInt();
			for(int i=0;i<num_member;i++){
				member member1=new member();
				System.out.println("please enter member's name");
                member1.name=input.next();
                System.out.println("please enter member's ID");
				member1.ID=input.nextInt();
				for(int j=0;j<members.length;j++){
					if(members[j]==null){
						members[j]=member1;
						break;
					}
				}
			}
			return members;
			}
		
		
		public static int BookSearch (book[] books){
			System.out.println("If you want to search for the book by its name or you are in the process of inserting a new book please enter 1 to make sure the book doesn't already exixt");
			System.out.println("If you want to search for the book by its auther please enter  2");
			Scanner input=new Scanner(System.in);
			int operation=input.nextInt();
			int book_index=-1;
			if(operation==1){
				System.out.println("please enter the book's name");

				String book_name=input.next();
				for(int i=0;i<books.length;i++){
					if((books[i]!=null)&&(books[i].name.equals(book_name.toLowerCase()))){
						System.out.println("number of copies of "+book_name+" is "+ books[i].copies);
						book_index=i;
						break;
						}
					}
			}
			if(operation==2){
				System.out.println("please enter the book's auther");
				String book_auther=input.next();
				for(int i=0;i<books.length;i++){
					if(books[i]!=null&&books[i].auther.equals(book_auther.toLowerCase())){
						System.out.println("number of copies of "+book_auther+"'s "+books[i].name+" is "+ books[i].copies);
						book_index=i;
					}
				}
			}
			if( book_index==-1) System.out.println("Book is not found");
			
			return book_index;
		}
		
		
            public static void InsertBook(book[] books){
			
			System.out.println("please enter number of books you want to insert");
			Scanner input=new Scanner(System.in);
			int num_book=input.nextInt();
			for(int i=0;i<num_book;i++){
				book book1=new book();
				System.out.println("please enter the book name");
				book1.name=input.next();
				int book_index=BookSearch(books);
				if(book_index!=-1){
					books[book_index].copies++;
					System.out.println("The book was already found so the the number of copies are increased by one and became "+books[book_index].copies);
				}else{
				book1.name=book1.name.toLowerCase();
				System.out.println("please enter date of puplish in the format Month/Year");
				book1.date=input.next();
				System.out.println("please enter Auther's name");
				book1.auther=input.next();
				book1.auther=book1.auther.toLowerCase();
				System.out.println("please enter number of copies");
				book1.copies=input.nextInt();
				for(int j=0;j<books.length;j++){
					if(books[j]==null){
						books[j]=book1;
						System.out.println("Book is inserted");
						break;
					}
				}
			}
				
				
			}
		}
		
		public static boolean CopyDelete(book[] books){
			Scanner input=new Scanner(System.in);
		    System.out.println("please insert name of the book");
		    String book_name=input.next();
		    boolean book_found=false;
		    for(int i=0;i<books.length&&books[i]!=null;i++){
		    	if(books[i].name.equals(book_name.toLowerCase())){
		    		book_found=true;
					if(books[i].copies==0){
						System.out.println("The book has no copies in the library right now");
						 break;
					        }else{
						       books[i].copies--;
						       System.out.println("the copy is deleted succsessfully and number of copies now is "+books[i].copies);
						        break;
					        
					        }
					     }
		    	}
		   
		    
		    if(book_found==false){
		    	System.out.println("Book is not found");
		    }
		    return book_found;
	    }
		
		public static void Borrow (book[]books,member[]members,BorrowedBook[] Bbooks ){
			Scanner input=new Scanner(System.in);
			BorrowedBook book1=new BorrowedBook();
			System.out.println("please insert number of books you want to borrow");
			
			int book_num=input.nextInt();
			for(int i=0;i<book_num;i++){
				System.out.println("please insert book name");
				book1.name=input.next();
			    book1.name=book1.name.toLowerCase();
			    System.out.println("please insert member's ID");
			    book1.memberID=input.nextInt();
			    boolean member_found=false;
			    for(int j=0;j<members.length;j++){
				    if(members[j]!=null&&book1.memberID==members[j].ID){
					    member_found=true;
					    break;
				    } 
			    }
			    if (member_found==false){
				    System.out.println("member is not found");
			    }
			    else {
			    	CopyDelete(books);
				    System.out.println("please insert duration it has to be less than 14 days");
				    book1.duration=input.nextInt();
				    if(book1.duration>14||book1.duration<=0){
					    System.out.println("Duration has to be less than or equal 14 days and more than 0");
					    System.out.println("please insert duration it has to be less than 14 days");
					    book1.duration=input.nextInt();
				
				    }
				    System.out.println("Please insert the date of borrow in the formate Day/Month/Year");
				    book1.date=input.next();
				   
			        for(int j=0;j<books.length;j++){
				        if(Bbooks[j]==null){
					        Bbooks[j]=book1;
					        System.out.println("Data about the borrowed book is saved");
					        break;
				    }
			     }
			  }
	        } 
        }
		
		public static void CheckIn(BorrowedBook[] Bbooks,book[]books){
			Scanner input=new Scanner(System.in);
			System.out.println("Please insert the book name");
			String book_name=input.nextLine();
			System.out.println("Please insert member's ID");
			int memberID=input.nextInt();
			for(int i=0;i<Bbooks.length;i++){
				if(Bbooks[i]!=null&&Bbooks[i].memberID==memberID&&Bbooks[i].name.equals(book_name.toLowerCase())){
					Bbooks[i]=null;
					 for(int j=0;j<books.length;j++){
				        if(books[j].name.equals(book_name.toLowerCase())){
					        books[j].copies++;
					        System.out.println("Book is checked in");
					        break;
				         }
			         }
			   }
			}
		}
		
		public static void memberSearch(BorrowedBook[]Bbooks,member[] members){
			Scanner input=new Scanner(System.in);
			System.out.println("Please insert member's ID");
			int ID=input.nextInt();
			boolean member_found=false;
			for(int i=0;i<members.length;i++){
				if(members[i]!=null&&ID==members[i].ID){
					member_found=true;
					break;
				}
			}
			if(member_found==false) {System.out.println("Member is not found");}
			int i=0;
			while(member_found&&i<Bbooks.length){
				boolean member_borrow=false;
				for(i=0;i<Bbooks.length;i++){
					if(Bbooks[i]!=null&&ID==Bbooks[i].memberID){
					member_borrow=true;
	                System.out.println("The member with the ID: "+Bbooks[i].memberID+" has borrowed "+Bbooks[i].name+" for "+Bbooks[i].duration+" days starting from "+Bbooks[i].date );
					
				}
			}
			
			if (member_borrow==false){
				System.out.println("There is no books borrowed by the member at the present");
			}
		}
	  }
		
		public static void Deletemember(member[]members,BorrowedBook[]Bbooks){
			Scanner input=new Scanner(System.in);
			System.out.println("Please enter member's ID");
			int ID=input.nextInt();
			boolean member_found=false;
			for(int i=0;i<members.length;i++){
				if(members[i]!=null&&members[i].ID==ID){
					members[i]=null;
					member_found=true;
					System.out.println("Member with ID: "+ID+" is deleted");
					break;
					}
				}
			if(member_found==false) { System.out.println("Member is not found");}
			int i=0;
			while(member_found&&i<Bbooks.length){
			   for(i=0;i<Bbooks.length;i++){
				   if(Bbooks[i]!=null&&Bbooks[i].memberID==ID){
					   Bbooks[i]=null;
				   }
			   }
		   }
		}
}
