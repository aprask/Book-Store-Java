package Commands.User;

import Commands.Command;

public class Membership implements Command
{
    Client client;
    public Membership(Client newUser)
    {
        this.client = newUser;
    }

    @Override
    public void execute() {
        this.client.displayMembershipDetails();
        this.client.membershipDueDate();
    }

}
