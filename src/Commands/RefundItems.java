package Commands;

import Commands.Items.Inventory;

public class RefundItems implements Command {
    public Register register;
    public RefundItems(Register newOrder)
    {
        this.register = newOrder;
    }
    @Override
    public void execute() {
        this.register.refundOrder();
    }
}
