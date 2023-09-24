package Commands;

public class RefundItems implements Command {
    Register register;
    public RefundItems(Register newOrder)
    {
        this.register = newOrder;
    }
    @Override
    public void execute() {
        this.register.refundOrder();
    }
}
