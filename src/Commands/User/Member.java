package Commands.User;

import Commands.Command;
import Commands.EnterStore;

public class Member implements Command
{
    Client client;
    EnterStore enterStore;
    public Member(String name, boolean premium, String payment)
    {
        this.client = new Client(name,premium,payment);
        EnterStore.clients.add(client);
    }
    @Override
    public void execute() {
        System.out.println(this.client.getName() + " has been added to the party");
        System.out.println("The party total is at: " + EnterStore.clients.size());
    }
}
