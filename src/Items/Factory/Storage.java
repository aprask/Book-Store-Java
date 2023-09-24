package Items.Factory;
import java.util.*;
import Items.Item;

public class Storage
{
    private static Scanner scan = new Scanner(System.in);
    public void createStoreItems()
    {
        Factory factory = new Factory();
        Item item = null;
        System.out.println("What type of item would you like to create? ");
        System.out.println("CD, Book, or DVD");
        String itemSelection = scan.next();
        if(scan.hasNextLine())
        {
            factory.item(itemSelection);
        }
        else {
            System.out.println("Error");
        }

    }
}
