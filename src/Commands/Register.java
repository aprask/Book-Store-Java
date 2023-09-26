package Commands;
import Commands.Items.Inventory;
import Commands.User.Client;

import java.util.*;

public class Register implements Customer {
    private double orderTotal;
    private static int orderID = 1;
    private int selectionID;
    private static Customer customer;
    private static Client client;
    private EnterStore enterStore;
    static Scanner scan = new Scanner(System.in);
    @Override
    public void enterStore(Customer customer, Client client) {
        new EnterStore(customer, client);
    }

    @Override
    public void checkOut() {
        isOrderDone(true);
        System.out.println("Order Total: " + "$" + orderTotal);
    }

    @Override
    public void refundOrder() {
        System.out.println("Your order has been refunded");
        System.out.println("Your $" + getOrderTotal() + " has been returned to your balance"); //TODO: ADD PAYMENT METHOD
    }

    @Override
    public boolean purchasePremiumMembership(boolean purchase) {
        return purchase;
    }
    @Override
    public void generateOrder() {
        fixOrderID();
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
        System.out.println("Type \"1\" to purchase a Book");
        System.out.println("Type \"2\" to purchase a CD");
        System.out.println("Type \"3\" to purchase a DVD");
        return scan.nextInt();
    }


    public void fixOrderID()
    {
        orderID++;
    }

    @Override
    public boolean isOrderDone(boolean status) {
        return status;
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
}
