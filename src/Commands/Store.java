package Commands;
import Commands.User.Client;

import java.util.*;
public class Store
{
    private Item itemMenu;
    private final Register register = new Register();
    private Scanner scan = new Scanner(System.in);
    public void greetingMessage()
    {
        System.out.println("Welcome to the store!");
        this.register.createItems();
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
