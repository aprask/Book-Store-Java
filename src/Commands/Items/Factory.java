package Commands.Items;
import java.util.*;

enum ItemType
{
    CD(1),
    BOOK(2),
    DVD(3);
    final int number;
    ItemType(int number){
        this.number = number;
    }
}
public class Factory {
    public Factory() {

    }

    public Item makeItem(String itemName, double itemPrice, int ID, boolean status)
    {
        Scanner scan = new Scanner(System.in);
        Item newItem = null;
        ItemType CD = ItemType.CD;
        ItemType Book = ItemType.BOOK;
        ItemType DVD = ItemType.DVD;
        System.out.println("1 = CD\n2 = Book\n3 = DVD");
        int newItemName = scan.nextInt();
        if(newItemName == CD.number)
        {
            return new CD(itemName,itemPrice,ID,status);
        }
        else if(newItemName == Book.number)
        {
            return null;
        }
        else if(newItemName == DVD.number)
        {
            return null;
        }
        return null;
    }
}
