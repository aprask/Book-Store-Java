package Commands.User;
import java.util.*;
import Commands.Command;
import Commands.EnterStore;

public class Upgrade implements Command
{
    protected Scanner scan = new Scanner(System.in);
    Client client = new Client();
    EnterStore enterStore = new EnterStore(client);
    private String payment;
    private String name;
    public Upgrade()
    {
        
    }
    public Upgrade(Client client, String payment, String name)
    {
        this.client = client;
        this.payment = payment;
        this.name = name;
    }
    @Override
    public void execute() {
        System.out.println("Premium Membership Activated");
        this.client.setPremiumMember(true);
        System.out.println("We need to verify your purchase: \n");
        this.client.membershipDueDate();
        EnterStore.clients.add(new Client(name,true,payment));
    }
    public void doNotExecute()
    {
        System.out.println("Standard Membership Activated.");
        this.client.setPremiumMember(false);
    }
    public void displayCustomers()
    {
        System.out.println("\nCURRENT PARTY MEMBERS: ");
        System.out.println(enterStore.executeListBuilder());
        System.out.println("\nPress Enter");
        if(scan.hasNextLine())
        {
            System.out.println("\n");
        }
    }
}
