package Items;

import java.util.LinkedList;
import java.util.Scanner;

public class DVD extends Item
{
    private LinkedList<DVD> DVDs = new LinkedList<DVD>();
    private Scanner scan = new Scanner(System.in);
    public DVD()
    {
        System.out.println("Enter the name of the DVD: ");
        String dvdName = scan.next();
        setItemName(dvdName);
        System.out.println("How much does " + dvdName + " cost? ");
        float dvdCost = scan.nextFloat();
        setItemPrice(dvdCost);
        System.out.println("How many seconds does " + dvdName + " contain? ");
        float dvdLength = scan.nextFloat();
        setItemLength(dvdLength);
        DVDs.add(new DVD(dvdName,dvdCost,dvdLength));
        for(int i = 0; i <= DVDs.size(); i++)
        {
            System.out.println("Name: " + DVDs.get(i).getItemName());
            System.out.println("Price: " + DVDs.get(i).getItemPrice());
            System.out.println("Pages: " + DVDs.get(i).getItemLength());
            System.out.println();
        }
    }
    public DVD(String name, float cost, float len)
    {

    }
    public LinkedList<DVD> getDVDs() {
        return DVDs;
    }
    public void setBooks(LinkedList<DVD> DVDs) {
        this.DVDs = DVDs;
    }

}
