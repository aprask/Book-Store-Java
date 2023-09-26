package Commands.User;
import java.util.*;
import Commands.Command;
import Commands.EnterStore;

public class Upgrade implements Command
{
    protected Scanner scan = new Scanner(System.in);
    Client client = new Client();
    EnterStore enterStore = new EnterStore(client);
    private final String payment;
    private final String name;
    public Upgrade(Client client, String payment, String name)
    {
        this.client = client;
        this.payment = payment;
        this.name = name;
    }
    @Override
    public void execute() {
        System.out.println("Premium Membership Activated!!!!!!!");
        this.client.setPremiumMember(true);
        System.out.println("We need to verify your purchase: \n");
        this.client.membershipDueDate();
        this.enterStore.clients.add(new Client(name,true,payment));
    }
    public void doNotExecute()
    {
        System.out.println("Standard Membership Activated.");
        this.client.setPremiumMember(false);
        this.enterStore.clients.add(new Client(name,false,payment));
    }
    public void displayCustomers() // TODO: Fix null (we need customer list with ID)
    {
        System.out.println(enterStore.additionalExecute());
    }
}
