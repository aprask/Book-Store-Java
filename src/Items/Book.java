import java.util.*;
public class Book extends Item
{
    private Scanner scan = new Scanner(System.in);
    public Book()
    {
        System.out.println("Enter the name of the book: ");
        String bookName = scan.next();
        setItemName(bookName);
        System.out.println("How much does " + bookName + " cost? ");
        float bookCost = scan.nextFloat();
        setItemPrice(bookCost);
        System.out.println("How many pages does " + bookName + " contain? ");
        float bookLength = scan.nextFloat();
        setItemLength(bookLength);
    }

}
