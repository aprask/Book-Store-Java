package Items;

import java.util.*;
public class CD extends Item
{
    private static LinkedList<CD> CDs = new LinkedList<CD>();
    private Scanner scan = new Scanner(System.in);
    public CD()
    {
        System.out.println("Enter the name of the CD: ");
        String cdName = scan.next();
        setItemName(cdName);
        System.out.println("How much does " + cdName + " cost? ");
        float cdCost = scan.nextFloat();
        setItemPrice(cdCost);
        System.out.println("How many seconds does " + cdName + " contain? ");
        float cdLength = scan.nextFloat();
        setItemLength(cdLength);
        CDs.add(new CD(cdName,cdCost,cdLength));
        for(int i = 0; i <= CDs.size(); i++)
        {
            System.out.println("Name: " + CDs.get(i).getItemName());
            System.out.println("Price: " + CDs.get(i).getItemPrice());
            System.out.println("Length: " + CDs.get(i).getItemLength());
            System.out.println();
        }
    }
    public CD(String name, float cost, float len)
    {

    }

    public LinkedList<CD> getCDs() {
        return CDs;
    }

    public void setCDs(LinkedList<CD> CDs) {
        this.CDs = CDs;
    }
}
