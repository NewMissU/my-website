
package Class;

import java.util.ArrayList;

public class Book {
    //task2
    public String isbn;
    public String title;
    public String type;
    public double price;
    //task3
    public Book(String isbn, String title, String type, double price){  //public Book = constructor , (??) = signature/parameter
        //task4
        this.isbn = isbn; //this.isbn = from public String isbn;  ||  isbn = isbn form parameter 
        this.title = title;
        this.type = type;
        this.price = price;
    }
 
}
//task6
class BookStore{
        ArrayList<Book> books = new ArrayList<Book>();
        //task7
        public void addBook(String isbn, String title, String type, double price){
            Book b = new Book(isbn,title,type,price);
            books.add(b);
        }
}
