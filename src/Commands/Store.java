package Commands;
import Commands.User.Client;

import java.util.*;
public class Store
{
    private Item itemMenu;
    private Register register = new Register();
    private Scanner scan = new Scanner(System.in);
    public void greetingMessage()
    {
        System.out.println("Welcome to the store!");
        System.out.println("In order to open, we need to create items \n");
        while(true)
        {
            this.register.createItems();
            System.out.println("Would you like to add more items? yes or no ");
            String userContinue = scan.next();
            if(userContinue.equalsIgnoreCase("yes"))
            {
                continue;
            }
            else
            {

                break;
            }
        }

    }
    public void menuDisplay()
    {
        switch (itemMenu) {
            case CD -> System.out.println("Create CD");
            case DVD -> System.out.println("Create DVD");
            case BOOK -> System.out.println("Create Book");
            default -> System.out.println("Not going to work");
        }
    }
}
