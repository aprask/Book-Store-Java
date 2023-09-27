package Commands;

import Commands.User.Client;

import java.util.ArrayList;

public class EnterStore implements Command {
    private static Client client;
    public static ArrayList<Client> clients;
    public static ArrayList<String> customerNames = new ArrayList<>();
    public EnterStore(Client client)
    {
        EnterStore.client = client;
        clients = new ArrayList<>();
        clients.add(client);
    }
    @Override
    public void execute() {
        System.out.println("Party Total: " + clients.size());
    }
    public ArrayList<String> executeListBuilder() {
        for(int i = 0; i < clients.size(); i++)
        {
            customerNames.add(client.getName());
        }
        return customerNames;
    }
    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        EnterStore.client = client;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public void setClients(ArrayList<Client> clients) {
        EnterStore.clients = clients;
    }
}
