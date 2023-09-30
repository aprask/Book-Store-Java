package Commands;

public class CheckOutItems implements Command
{
    public Register register;

    /**
     *
     * @param newOrder takes in an instance of Register.java
     */
    public CheckOutItems(Register newOrder)
    {
        this.register = newOrder;
    }
    @Override
    public void execute() {
        this.register.checkOut();
    }
}
