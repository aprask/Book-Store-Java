package Commands;
import Commands.Items.Inventory;
import Commands.User.Bank;
import Commands.User.Client;
import Commands.User.Upgrade;

import java.util.*;

public class Register implements Customer {
    private static double orderTotal;
    EnterStore enter;
    private static final Queue<String> orderOfCustomers = new LinkedList<>();
    private static int partyTotal;
    Scanner scan = new Scanner(System.in);
    @Override
    public void enterStore(Client client) {
        this.enter = new EnterStore(client);
    }
    @Override
    public void checkOut() {
        isOrderDone(true);
        System.out.println("Order Total: " + "$" + Register.orderTotal);
    }

    @Override
    public void refundOrder() {
        System.out.println("Your order has been refunded");
        System.out.println("Your $" + Register.orderTotal + " has been returned to your payment method");
    }
    @Override
    public boolean isOrderDone(boolean status) {
        return status;
    }
    public static void addToTotal(double val)
    {
        Register.orderTotal += val;
    }
    public boolean proceedWithOrder()
    {
        return true;
    }
    public void handleBankInteraction(double payment,Client client)
    {
        Bank bank = new Bank(enter,client);
        bank.deductFromBank(payment);
        addToTotal(payment);
        System.out.println("Party Order Total: $" + Register.orderTotal);
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
        Register.partyTotal = partyTotal;
        int i = 0;
        while (i < partyTotal) {
            int customerNumber = i + 1;
            System.out.println("Customer " + customerNumber + "'s name? ");
            String customerName = scan.next();
            orderOfCustomers.offer(customerName);
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
    public String handleCustomer(int ID)
    {
        return orderOfCustomers.poll();
    }
    public boolean handleOrder(String name)
    {
        return this.enter.whoPurchased(name);
    }

    public int getPartyTotal() {
        return partyTotal;
    }
}
