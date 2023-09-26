package Commands.User;

import Commands.Command;

public class Identification implements Command
{
    Client client;
    public Identification(Client client)
    {
        this.client = client;
    }

    @Override
    public void execute() {
        this.client.identifyUser();
    }
}
