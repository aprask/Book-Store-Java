package Commands.User;

import Commands.EnterStore;
import Commands.Register;

public class Bank
{
    Register register = new Register();
    Client userClient;
    EnterStore enterStore;
    protected final int MAX_CLIENTS = EnterStore.clients.size();
    protected int[] banks = new int[MAX_CLIENTS];
    public Bank(EnterStore enterStore, Client userClient)
    {
        this.userClient = userClient;
        this.enterStore = enterStore;
        initializeAccounts(userClient);
    }
    public void initializeAccounts(Client client)
    {
        banks[client.getID()] = 1000;
    }
    public double totalMoneySpent()
    {
        return this.register.getOrderTotal();
    }

    @Override
    public String toString() {
        return
            this.userClient.getName() + "'s Bank Information:\n" +
            "Payment Type: " + this.userClient.getPaymentType() +
            "Balance: " + banks[this.userClient.getID()];
    }
    public void deductFromBank(double payment)
    {
        if(this.register.proceedWithOrder())
        {
            double newBankTotal = banks[userClient.getID()] - payment;
            if(newBankTotal < 0)
            {
                System.out.println("Invalid Payment");
            }
            else if(newBankTotal > 0)
            {
                System.out.println("For Customer: " + userClient.getName());
                System.out.println("New Total: $" + newBankTotal);
            }
            else {
                System.out.println("Something was incorrect with your input");
            }
        }

    }
    public int[] getBanks() {
        return banks;
    }

    public void setBanks(int[] banks) {
        this.banks = banks;
    }
}
