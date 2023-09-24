package Items.Factory;
import Items.*;
import java.util.*;

public class Factory
{
    static Scanner scan = new Scanner(System.in);
    private CD cd = new CD();
    public void item(String type)
    {
        if(type.equalsIgnoreCase("cd"))
        {
            System.out.println("Enter the name of the CD: ");
            String cdName = scan.next();
            System.out.println("How much does " + cdName + " cost? ");
            float cdCost = scan.nextFloat();
            System.out.println("How many seconds does " + cdName + " contain? ");
            float cdLength = scan.nextFloat();
            cd.addCD(cdName,cdCost,cdLength);
        }
        else if(type.equalsIgnoreCase("book"))
        {
            new Book();
        }
        else if(type.equalsIgnoreCase("dvd"))
        {
            new DVD();
        }
    }

    public CD getCd() {
        return cd;
    }

    public void setCd(CD cd) {
        this.cd = cd;
    }
}
