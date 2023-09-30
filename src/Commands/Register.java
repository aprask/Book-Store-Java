package Commands;
import Commands.Items.Inventory;
import Commands.User.*;
import java.util.*;
public class Register implements Customer {
    private static double orderTotal;
    public EnterStore enter;
    private static final Queue<String> orderOfCustomers = new LinkedList<>();
    private static int partyTotal;
    public Scanner scan = new Scanner(System.in);
    @Override
    public void enterStore(Client client) {
        this.enter = new EnterStore(client);
    }
    @Override
    public void checkOut() {
        isOrderDone(true);
        System.out.println("\tReceipt: \n");
        for(int i = 0; i < partyTotal; i++)
        {
            System.out.println
                    ("$" + enter.getCustomerPayments().get(i)+ " for: " + EnterStore.customerNames.get(i));
        }
        System.out.println("Party Order Total: " + "$" + Register.orderTotal);
    }

    @Override
    public void refundOrder() {
        System.out.println("Your order has been refunded");
        System.out.println("\tReceipt: \n");
        for(int i = 0; i < partyTotal; i++)
        {
            System.out.println
                    ("$" + enter.getCustomerPayments().get(i)+ " for: " + EnterStore.customerNames.get(i));
        }
        System.out.println("Your party's $" + Register.orderTotal + " has been returned to each of your payment methods");
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
        enter.getCustomerPayments().add(payment);
        addToTotal(payment);
        System.out.println("Party Order Total: $" + Register.orderTotal);
        System.out.println("****************************************************************************");
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
            System.out.println("Customer " + customerNumber + "'s name? (only first name will be recorded)");
            String customerName = scan.next();
            scan.nextLine();
            System.out.println("Does this customer want a premium membership? \"Yes\" or \"No\"?");
            boolean premium = false;
            String premiumOrNot = scan.next();
            if(premiumOrNot.equalsIgnoreCase("yes"))
            {
                premium = true;
            }
            Client customerClient = new Client(customerName, premium);
            orderOfCustomers.offer(customerClient.getName());
            Upgrade upgrade = new Upgrade(customerClient, customerName);
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
    public String handleCustomer()
    {
        if (!orderOfCustomers.isEmpty()) {
            EnterStore.customerNames.add(orderOfCustomers.peek());
            return orderOfCustomers.poll();
        } else
        {
            return "";
        }
    }
    public int getPartyTotal() {
        return partyTotal;
    }
}
