package Commands;

import Commands.User.Client;

import java.util.ArrayList;

public class EnterStore implements Command {
    Customer customer;
    private Client client;
    private ArrayList<Client> clients = new ArrayList<>();
    public EnterStore(Customer customer, Client client)
    {
        this.customer = customer;
        this.client = client;
        clients.add(client);
    }
    @Override
    public void execute() {

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
