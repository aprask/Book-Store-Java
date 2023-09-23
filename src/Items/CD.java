import java.util.*;
public class CD extends Item
{
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
    }
}
