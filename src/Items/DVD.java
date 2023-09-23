import java.util.Scanner;

public class DVD extends Item
{
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
    }
}
