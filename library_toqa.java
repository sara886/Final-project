package liberary;

import java.util.ArrayList;
import java.util.Scanner;

public class library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner get =new Scanner(System.in);
		ArrayList< book > books= insertbooks();//insert the books;
		int m=0;
		while(m!=-1){
		int p = chooseoperation();// choosing what the user want to do;
		if(p==1)
		{// insert book;
			for(int i=0;i!=-1;){
			books.add(getbookinfo());
			System.out.println ("if you want to insert other book press 0 if not press 1");
			int e= get.nextInt();
			i= e==0? i++:-1;
			}

		}
		if (p==2)
		{// search about book ;
			System.out.println("if you want to search by the author press 4 or by the book name press 5");
			int w= get.nextInt();
			if (w==5){//search about books by its name;
				book bookinfo = printbookinfo(books);
				System.out.println( "the name of the book is "+bookinfo.name+", the author is "+bookinfo.author+", the date of publishing is "+bookinfo.date+", number of copies "+bookinfo.copies);
			}
		    if(w==4){//search about book by author;
			printauthorsbooks(books);
			}
		}
		if (p==3){//delete the copies of the books;
		book requiredbook =printbookinfo(books);
		System.out.println("how many copies do you want to delete ?");
		int delcopies= get.nextInt();
		requiredbook.copies= requiredbook.copies - delcopies;
		System.out.println("the copies of "+requiredbook.name+" became "+requiredbook.copies);

		}
		}
		}
		
		
		
		
		

 
	
	private static ArrayList<book> insertbooks(){
		ArrayList<book> books =new ArrayList<book>();
		int i=0;
		while(i!=-1){
			books.add(i,getbookinfo());
			Scanner get = new Scanner(System.in);
			System.out.println ("if  you want to insert other book please press 0 if not press 1");
		int p= get.nextInt();
		if (p==1){ i=-1;
		}
		else {i++;}
		}
		return books ;
		
	}
	private static book getbookinfo(){
		book book1 =new book();
		Scanner get = new Scanner(System.in);
		System.out.println("please insert the name of the book");
		book1.name=get.nextLine();
		System.out.println("please insert the author of the book");
		book1.author=get.nextLine();
		System.out.println("please insert the date of publishing of the book");
		book1.date=get.nextLine();
		System.out.println("please insert the copies of the book");
		book1.copies=get.nextInt();
		return book1;


		
	}
	private static int chooseoperation(){
		Scanner get =new Scanner(System.in);
		System.out.println ("welcom mr.user choose what do yo want to do");
        System.out.println ("if you want to insert book press 1 , search about book press 2,delete copie from books press 3");
        int y= get.nextInt();
        return y;
		
		
	}
	private static book printbookinfo(ArrayList<book> books){
		book book1= new book();
		int size= books.size();
		Scanner get =new Scanner(System.in);
		System.out.println ("please insert the name of the book");
		String name= get.nextLine();
		name.toLowerCase();
		int cond = 0;
		for(int i=0;i<size&&cond==0;i++){ 
			if (name.equals(books.get(i).name)){ book1= books.get(i);
			cond=1;
			}
		}
		if(cond==0){System.out.println("this book is not here");}
		return book1;
	}
	private static void printauthorsbooks(ArrayList<book> books){
		int size= books.size();
		Scanner get =new Scanner(System.in);
		System.out.println ("please insert the first name of the author");
		String author = get.nextLine();
		author.toLowerCase();
		int count =0;
		for(int i=0;i<size;i++){
			if (author.equals(books.get(i).author)){
				 System.out.println("the name of the book is "+ books.get(i).name+", the date of the publishing "+books.get(i).date+", number of the copies is "+books.get(i).copies);
			count=1;
			}
		
		}
		if (count==0){System.out.println("this author does not have any book here");}
		
		
		
	}
	
}
