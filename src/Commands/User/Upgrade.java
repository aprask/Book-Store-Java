package Commands.User;
import java.util.*;
import Commands.Command;
import Commands.EnterStore;

public class Upgrade implements Command
{
    protected Scanner scan = new Scanner(System.in);
    public Client client = new Client();
    public EnterStore enterStore = new EnterStore(client);
    private String payment;
    private String name;
    public Upgrade()
    {
        
    }
    public Upgrade(Client client, String name)
    {
        this.client = client;
        this.name = name;
    }
    @Override
    public void execute() {
        System.out.println("Premium Membership Activated.");
        this.client.setPremiumMember(true);
        System.out.println("We need to verify your purchase: \n");
        this.client.membershipDueDate();
        System.out.println("How will you be paying for your purchases and for the membership? ");
        String payment = scan.next();
        EnterStore.clients.add(new Client(name,true,payment));
    }
    public void doNotExecute()
    {
        System.out.println("Standard Status Activated.");
        System.out.println("How will you be paying for your purchases today? ");
        String payment = scan.next();
        EnterStore.clients.add(new Client(name,false,payment));
    }
    public void displayCustomers()
    {
        System.out.println("\nCURRENT PARTY MEMBERS: ");
        System.out.println(enterStore.executeListBuilder());
        if(scan.hasNextLine())
        {
            System.out.println("\n");
        }
    }
}
