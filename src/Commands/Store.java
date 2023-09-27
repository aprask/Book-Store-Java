package Commands;
import Commands.Items.Inventory;
import Commands.User.Client;

import java.util.*;
public class Store
{
    private final Inventory inventory = new Inventory();
    private final Register register = new Register();
    private static Scanner scan = new Scanner(System.in);
    private final static ArrayList<String> storeNames = new ArrayList<>();
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
                    if(storeNames.contains(this.register.enter.getClient().getName()))
                    {
                        this.register.proceedWithOrder();
                        this.register.handleBankInteraction
                                (this.inventory.getCDPrice(selectedID),this.register.enter.getClient());
                    }
                    this.register.addToTotal(this.inventory.getBookPrice(selectedID));
                    this.inventory.removeBook(selectedID);
                }
                break;
            }
            case 2 -> {
                System.out.println("Which CD? Select by ID ");
                System.out.println(inventory);
                int selectedID = scan.nextInt();
                if(selectedID < 5 && selectedID > 0)
                {
                    if(storeNames.contains(this.register.enter.getClient().getName()))
                    {
                        this.register.proceedWithOrder();
                        this.register.handleBankInteraction
                                (this.inventory.getCDPrice(selectedID),this.register.enter.getClient());
                    }
                    this.register.addToTotal(this.inventory.getCDPrice(selectedID));
                    this.inventory.removeCD(selectedID);
                }
                break;
            }
            case 3 -> {
                System.out.println("Which DVD? Select by ID ");
                System.out.println(inventory);
                int selectedID = scan.nextInt();
                if(selectedID < 5 && selectedID > 0)
                {
                    if(storeNames.contains(this.register.enter.getClient().getName()))
                    {
                        this.register.proceedWithOrder();
                        this.register.handleBankInteraction(this.inventory.getDVDPrice(selectedID),this.register.enter.getClient());
                    }
                    this.register.addToTotal(this.inventory.getDVDPrice(selectedID));
                    this.inventory.removeDVD(selectedID);
                }
                break;
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

    public void handleUser()
    {
        while(true)
        {
            System.out.println("Who will be making this purchase? ");
            String userPurchaseName = scan.next();
            storeNames.add(this.register.enter.getClient().getName());
            if(this.register.handleOrder(userPurchaseName))
            {
                System.out.println(userPurchaseName + " will be making this purchase");
                userBank(this.register.enter.getClient().getID());
                System.out.println();
                break;
            }
        }
    }
    public void userBank(int ID)
    {
        if(this.register.enter.purchaseItem(ID))
        {
            System.out.println("\nCustomer: " + this.register.enter.getClient().getName());
            System.out.println("Would you like a CD, DVD, or a Book? ");
            var = this.register.createItems(this.inventory);
            this.inventory.setSelectionID(var);
            while(true)
            {
                menu();
                if(scan.hasNextLine())
                {
                        System.out.println("Order Total: $" + this.register.getOrderTotal());
                        System.out.println("Would you like to add more items to your cart? Type \"1\": ");
                        if(this.register.getPartyTotal() > 1)
                        {
                            System.out.println("Or would you like to move on to the next customer in your party? or \"2\"");
                        }
                        System.out.println("Or would you like to checkout? Type \"-1\"");
                        String cartChoice = scan.next();
                        if(cartChoice.equalsIgnoreCase("-1"))
                        {
                            handleCheckout();
                            break;
                        }
                        else if(cartChoice.equalsIgnoreCase("1"))
                        {
                            continue;
                        }
                        else if(cartChoice.equalsIgnoreCase("2"))
                        {
                            handleUser();
                        }
                        else
                        {
                            System.out.println("Error");
                        }
                }
            }
        }
    }

    public Scanner getScan() {
        return scan;
    }

    public void setScan(Scanner scan) {
        Store.scan = scan;
    }
}