package Commands;
import Commands.Items.Inventory;
import Commands.User.Client;

import java.util.*;

public class Register implements Customer {
    private float orderTotal;
    private static int orderID = 1;
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
        System.out.println("Order Total: " + orderTotal);
    }

    @Override
    public void refundOrder() {
        System.out.println("Order " + orderID + " + is refunded");
    }

    @Override
    public boolean purchasePremiumMembership(boolean purchase) {
        return purchase;
    }
    @Override
    public void generateOrder() {
        fixOrderID();
    }

    public int createItems()
    {
        System.out.println();
        Inventory inventory = new Inventory();
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
        System.out.println("Order: " + orderID + " has been created");
        orderID++;
    }

    @Override
    public boolean isOrderDone(boolean status) {
        return status;
    }

    public float getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(float orderTotal) {
        this.orderTotal = orderTotal;
    }
}
