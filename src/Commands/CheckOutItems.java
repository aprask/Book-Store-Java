package Commands;

public class CheckOutItems implements Command
{
    Register register;
    public CheckOutItems(Register newOrder)
    {
        this.register = newOrder;
    }
    @Override
    public void execute() {
        this.register.checkOut();
    }
}
