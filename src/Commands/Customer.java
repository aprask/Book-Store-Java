package Commands;

import Commands.User.Client;

public interface Customer
{
    public void enterStore(Client client);
    public void checkOut();
    public void refundOrder();
    public boolean purchasePremiumMembership(boolean purchase);
    public void generateOrder();
    public boolean isOrderDone(boolean status);

}
