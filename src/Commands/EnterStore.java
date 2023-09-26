package Commands;

import Commands.User.Client;

import java.util.ArrayList;

public class EnterStore implements Command {
    private Client client;
    public ArrayList<Client> clients = new ArrayList<>();
    public EnterStore(Client client)
    {
        this.client = client;
        clients.add(client);
    }
    @Override
    public void execute() {
        System.out.println("Party Total: " + this.clients.size());
    }
    public String additionalExecute()
    {
        for (Client value : clients) {
            return value.getName();
        }
        return null;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }
}
