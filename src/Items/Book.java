package Items;

import java.util.*;
public class Book extends Item
{
    private LinkedList<Book> books = new LinkedList<Book>();
    private Scanner scan = new Scanner(System.in);
    public Book()
    {
        System.out.println("Enter the name of the Book: ");
        String bookName = scan.next();
        setItemName(bookName);
        System.out.println("How much does " + bookName + " cost? ");
        float bookCost = scan.nextFloat();
        setItemPrice(bookCost);
        System.out.println("How many pages does " + bookName + " contain? ");
        float bookLength = scan.nextFloat();
        setItemLength(bookLength);
        books.add(new Book(bookName,bookCost,bookLength));
        for(int i = 0; i <= books.size(); i++)
        {
            System.out.println("Name: " + books.get(i).getItemName());
            System.out.println("Price: " + books.get(i).getItemPrice());
            System.out.println("Pages: " + books.get(i).getItemLength());
            System.out.println();
        }
    }
    public Book(String name, float cost, float len)
    {

    }

    public LinkedList<Book> getBooks() {
        return books;
    }

    public void setBooks(LinkedList<Book> books) {
        this.books = books;
    }
}
