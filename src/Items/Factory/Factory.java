package Factory;
import Items.*;
import java.util.Scanner;
public class Factory
{
    public Item item(String type)
    {
        Item userItem = null;
        if(type.equalsIgnoreCase("cd"))
        {
            return new CD();
        }
        else if(type.equalsIgnoreCase("book"))
        {
            return new Book();
        }
        else if(type.equalsIgnoreCase("dvd"))
        {
            return new DVD();
        }
        else
        {
            return null;
        }
    }
}
