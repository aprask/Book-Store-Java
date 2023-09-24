package Commands;
import Commands.User.Client;
import Items.Factory.*;

public class Register implements Customer {
    private static Storage storage = new Storage();
    private float orderTotal;
    private static int orderID = 1;
    private static Customer customer;
    private static Client client;
    private EnterStore enterStore;
    public static Storage getStorage() {
        return storage;
    }

    public static void setStorage(Storage storage) {
        Register.storage = storage;
    }

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

    public void createItems()
    {
        storage.createStoreItems();
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
