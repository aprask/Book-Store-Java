package Commands.User;

import Commands.EnterStore;
import Commands.Register;

public class Bank
{
    Register register = new Register();
    Client client = new Client();
    EnterStore enterStore = new EnterStore(client);
    protected final int MAX_CLIENTS = enterStore.clients.size();
    protected int[] banks = new int[MAX_CLIENTS];
    public Bank()
    {
        initializeAccounts();
    }
    public void initializeAccounts()
    {
        for(int i = 0; i < banks.length-1; i++)
        {
            banks[i] = 1000;
        }
    }
    public double totalMoneySpent()
    {
        return this.register.getOrderTotal();
    }
    public String createStoreBank(Client client)
    {
        return
            this.client.getName() + "'s Bank Information:\n" +
            "Payment Type: " + this.client.getPaymentType() +
            "Balance: " + banks[this.client.getID()];
    }
    public void deductFromBank(double payment)
    {
        if(payment < 0)
        {
            System.out.println("Invalid Payment");
        }
        else if(payment > banks[this.client.getID()])
        {
            double newBankTotal = banks[this.client.getID()] - payment;
            System.out.println("New Total: " + banks[this.client.getID()]);
        }
        else
        {
            System.out.println("Something was incorrect with your input");
        }
    }

    public int[] getBanks() {
        return banks;
    }

    public void setBanks(int[] banks) {
        this.banks = banks;
    }
}
