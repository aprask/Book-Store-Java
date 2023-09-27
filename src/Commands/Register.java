package Commands;
import Commands.Items.Inventory;
import Commands.User.Client;
import Commands.User.Upgrade;

import java.util.*;

public class Register implements Customer {
    private double orderTotal;
    private int selectionID;
    EnterStore enter;
    private int partyTotal;
    static Scanner scan = new Scanner(System.in);
    @Override
    public void enterStore(Client client) {
        this.enter = new EnterStore(client);
    }
    @Override
    public void checkOut() {
        isOrderDone(true);
        System.out.println("Order Total: " + "$" + orderTotal);
    }

    @Override
    public void refundOrder() {
        System.out.println("Your order has been refunded");
        System.out.println("Your $" + getOrderTotal() + " has been returned to your payment method");
    }
    @Override
    public boolean isOrderDone(boolean status) {
        return status;
    }
    public void addToTotal(double val)
    {
        orderTotal += val;
        this.setOrderTotal(orderTotal);
    }

    public int createItems(Inventory inventory) {
        System.out.println();
        inventory.availableBooks();
        inventory.availableCDs();
        inventory.availableDVDs();
        System.out.println("\nType \"1\" to purchase a Book");
        System.out.println("Type \"2\" to purchase a CD");
        System.out.println("Type \"3\" to purchase a DVD");
        return scan.nextInt();
    }
    public void partyTotal(int partyTotal) {
        this.partyTotal = partyTotal;
        int i = 0;
        while (i < partyTotal) {
            int customerNumber = i + 1;
            System.out.println("Customer " + customerNumber + "'s name? ");
            String customerName = scan.next();
            System.out.println("Customer " + customerNumber + "'s payment type? ");
            String customerPayment = scan.next();
            System.out.println("Does this customer want a premium membership? \"Yes\" or \"No\"?");
            String premiumOrNot = scan.next();
            Client customerClient = new Client(customerName, premiumOrNot.equalsIgnoreCase("yes"), customerPayment);
            Upgrade upgrade = new Upgrade(customerClient, customerPayment, customerName);
            if (premiumOrNot.equalsIgnoreCase("yes")) {
                upgrade.execute();
            } else {
                upgrade.doNotExecute();
            }
            this.enterStore(customerClient);
            upgrade.displayCustomers();
            i++;
        }
    }
    public void handleOrder(Client client)
    {

    }
    public double getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(double orderTotal) {
        this.orderTotal = orderTotal;
    }

    public int getSelectionID() {
        return selectionID;
    }

    public void setSelectionID(int selectionID) {
        this.selectionID = selectionID;
    }

    public int getPartyTotal() {
        return partyTotal;
    }

    public void setPartyTotal(int partyTotal) {
        this.partyTotal = partyTotal;
    }
}
