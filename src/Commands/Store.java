package Commands;
import Commands.Items.Inventory;
import Commands.User.Client;

import java.util.*;
public class Store
{
    private Inventory inventory = new Inventory();
    private final Register register = new Register();
    private Scanner scan = new Scanner(System.in);
    public void greetingMessage()
    {
        System.out.println("Welcome to the store!");
        System.out.println("Would you like a CD, DVD, or a Book? ");
        menuDisplay();
        }
    public void menuDisplay()
    {
        // TODO: Fix duplication
        int var = this.register.createItems();
        switch (var) {
            case 1 -> {
                System.out.println("Which Book? Select by ID ");
                System.out.println(inventory);
            }
            case 2 -> {
                System.out.println("Which CD? Select by ID ");
                System.out.println(inventory);
            }
            case 3 -> {
                System.out.println("Which DVD? Select by ID ");
                System.out.println(inventory);
            }
            default -> System.out.println("Error");
        }
    }

    public Scanner getScan() {
        return scan;
    }

    public void setScan(Scanner scan) {
        this.scan = scan;
    }
}
