package Commands;
import Commands.Items.Inventory;
import Commands.User.Client;

import java.util.*;
public class Store
{
    private final Inventory inventory = new Inventory();
    private final Register register = new Register();
    private Scanner scan = new Scanner(System.in);
    private static int var;
    public static int getVar() {
        return var;
    }

    public static void setVar(int var) {
        Store.var = var;
    }

    public void greetingMessage()
    {
        System.out.println("Welcome to the store!");
        System.out.println("How many members are in your party? ");
        int partyTotal = scan.nextInt();
        this.register.partyTotal(partyTotal);
        handleUser();
        // TODO Handle user specific purchases

        System.out.println("Would you like a CD, DVD, or a Book? ");
        var = this.register.createItems(this.inventory);
        this.inventory.setSelectionID(var);
        while(true)
        {
            menu();
            if(scan.hasNextLine())
            {
                System.out.println("Order Total: " + this.register.getOrderTotal());
                System.out.println("Would you like to add more items to your cart? Type \"yes\" or \"no\": ");
                String cartChoice = scan.next();
                if(!cartChoice.equalsIgnoreCase("yes"))
                {
                    handleCheckout();
                    break;
                }
            }
        }
    }
    public void menu()
    {
        switch (this.inventory.getSelectionID()) {
            case 1 -> {
                System.out.println("Which Book? Select by ID ");
                System.out.println(inventory);
                int selectedID = scan.nextInt();
                if(selectedID < 5 && selectedID > 0)
                {
                    this.register.addToTotal(this.inventory.getBookPrice(selectedID));
                    this.inventory.removeBook(selectedID);
                }
            }
            case 2 -> {
                System.out.println("Which CD? Select by ID ");
                System.out.println(inventory);
                int selectedID = scan.nextInt();
                if(selectedID < 5 && selectedID > 0)
                {
                    this.register.addToTotal(this.inventory.getCDPrice(selectedID));
                    this.inventory.removeCD(selectedID);
                }
            }
            case 3 -> {
                System.out.println("Which DVD? Select by ID ");
                System.out.println(inventory);
                int selectedID = scan.nextInt();
                if(selectedID < 5 && selectedID > 0)
                {
                    this.register.addToTotal(this.inventory.getDVDPrice(selectedID));
                    this.inventory.removeDVD(selectedID);
                }
            }
            default -> System.out.println("Error");
        }
    }
    public void handleCheckout() {
        System.out.println("Would you like a refund? Type \"yes\" or \"no\"");
        String refundOption = scan.next();
        if (refundOption.equalsIgnoreCase("yes")) {
            RefundItems refundItems = new RefundItems(register);
            refundItems.execute();
        }
        else
        {
            CheckOutItems checkOut = new CheckOutItems(register);
            checkOut.execute();
        }
    }
    public void handleUser() // TODO FINISH
    {
        System.out.println("Who will be making this purchase? ");
        String userPurchaseName = scan.next();
    }

    public Scanner getScan() {
        return scan;
    }

    public void setScan(Scanner scan) {
        this.scan = scan;
    }
}