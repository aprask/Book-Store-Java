package Commands.User;
import java.util.*;
import Commands.Command;

public class Upgrade implements Command
{
    protected Scanner scan = new Scanner(System.in);
    Client client = new Client();
    public Upgrade(Client client)
    {
        this.client = client;
    }
    @Override
    public void execute() {
        System.out.println("Premium Membership Purchased!");
        this.client.setPremiumMember(true);

        System.out.println("We need to verify your purchase: \n");
        this.client.membershipDueDate();
        System.out.println("PRESS ENTER");
        if(scan.hasNextLine())
        {
            System.out.println("WELCOME TO THE STORE\n\n");
        }
    }
}
