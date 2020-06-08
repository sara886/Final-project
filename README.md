# Final-prject
Names of the team members:
Sara Mohammed Abd Al-shafi.  Sec:1    B.N35
Aya Shawky Hassan.                   Sec:1    B.N17
Toqa Mohammed Abu baker.      Sec:1    B.N22

The program allows the user to manage a library. It allows the user to perform the following opperations:
1.	Book insertion.
2.	Book borrow.
3.	Book search by either the book name or the auther name and displaying number of copies.
4.	Book check in.
5.	Member search and displaying the books borrowed by the member.
6.	Deleting a copy of a book.
7.	Deleting a member.

When the user opens the program the first thing should be done is insert the books and members of this library then the user choose the operation that he want to do.

(GetBookInformation) 
This function allows the user to insert books information when he opens the program for the first time. 
This function have one parameter array “ books" and return "array books"
First, insert the numbers of books
Second ,take all information about it (book name, the author, date of puplish and number of copies) and put it in a variable of type book.
Finally, these books are collected in  the array “books”
..
Get member information
This function allow user to insert the members' information when he opens the programm for the first time.  
First ,user enters number of members he wants to add.
Second, insert user ID and Name.
Finally ,these information added in  the array “members” of type member
This function returns the array members 
..
Booksearch
For searching for a book, the user enters 3. Then the method (Booksearch) is used.
This function allows the user to search either with book name or author name.
It have one parameter (array books).
          If user choose searching by book name.
First ,user should insert the book's name. 
Then,  this program compare this name with the name of books in the library (the array books).
If the book is found , the number of copies of this book will be printed  and the book index will be changed to the number of this book in the array
If you choose searching by book author
First you insert book's author.
Then , the program compares this name with the name of authers in the library (the array books).
If the book is found .. all this auther's books with the numbers of copies will be printed and also change variable book_index.
Finally if variable book_index does not change "this book is not found" will be printed.
This function return variable book index (the place of the book in the array that may be used in other functions).
..
InsertBooks:
If the user wants to insert a book he needs to enter 1. 
This function is used when the user needs to add books to the library.
It takes the  array (books) as a parameter.
First insert the number of books.
Then insert the book's name.
The programme will search for it using the function(BookSearch) and if this book is in your library the number's of copies will increase by one. 
If your library doesn't have this book you will insert all information about it.
Finally it add this to your library (array books).
This function return array books.

Deleting a copy:
For deleting a copy the user enters 6. The method “CopyDelete” will be performed. It is a void method and its input is the array ‘books’ that contains the data of the books found in the library. 
First , the user will enter the book name. Second, the program will make sure if the book is found in the library. 
If it is found, the programm will check if the number of the copies of the book is equal to zero if so the scentence “The book has no copies in the library right now” will be printed on the screen. 
If number of copies is not equal to zero a copy of the book will be deleted and the scentence “The copy is deleted successfully and number of copies now is + the number of copies after deleting the copy” will be printed out.
If the book was not found, the scentence “Book is not found” will be printed out.    



Borrowing a book:
For borrowing a book, the user enters 2 and the method “Borrow” will be performed. It is a void function and its input is the arrays ‘Bbooks’ for the borrowed books, ’books’ of all the books in the library and ‘members’ which contain the members information(ID and name) .
First, the user enter number of books.
Second, the user enters the first book name and the first user’s ID. Then, the program makes sure that this member’s ID is found.
If the member is not found the scentence ” member is not found ” will be printed on the screen. 
If the member is found, the function ‘DeleteCopy ’ will be performed as explained before to decrease number of copies of the book that exists in the library.
Then, the user will enter the duration of borrowing and it has to be mare than 0 days and less than or equal 14 days.
Then, the user will enter the date of borrow.Finally, all the data about the borrowd book, book name, member’s ID , duration and date of borrow ,will be saved in the arrray Bbooks. This process is repeated to the number of the books the user wants.  
    
CheckIn:
If user wants to check in a book , he will insert number (4). When the user insert number (4),the function called (checkIn) will run. This function will not return output and its inputs are the array of the borrowed books(Bbooks) and the array ‘books’ . First,  the function asks the user to insert  the member’s ID and  the name of the book he wants to check in. It will  search if this member borrowed this book or not in the array of library books and in the array of borrowed book . If it was there ,it will delete the book which this member borrowed from the array of borrowed book  and increase number of copies of this book  in the array of  books. 
memberSearch :
If the user wants to search for any member , he will insert number (5). When the user insert number (5),the function called (memberSearch) will run. This function will not return output and its inputs are the array of the borrowed books(Bbooks) and the array of members of the library. First, the function asks the user to insert  the ID of the member he wants to search for. Then, the program will  search in the array of members  if this man is one of the library members .If it was there ,the program will search if this member borrowed any book or not by the ID in the array of borrowed books. if it was there, it will print out the name of all books that the member borrows . 
Deletemember:
If the user wants to delete any member , he will insert number (7). when the user inserts number (7),the function called (Deletemember) will run. this function will not return output and its inputs are the array of the borrowed books and the array of members of the library. First, the function asks the user to insert the ID of the member he wants to delete. Then, it will search in the members array and Bbooks array  by this ID.  If it was there , we will delete him from the array of members and delete the books he  borrowed from the array of books.


Exit the program:
To exit the program, the user enter -1.
