package Commands;

import Commands.User.Client;

public interface Customer
{
    public void enterStore(Client client);
    public void checkOut();
    public void refundOrder();
    public boolean isOrderDone(boolean status);

}
