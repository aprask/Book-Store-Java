package Commands.User;

import Commands.Command;

public class Balance implements Command {
    Bank bank;
    private double paymentAmount;
    public Balance(Bank bank, double paymentAmount)
    {
        this.bank = bank;
        this.paymentAmount = paymentAmount;
    }
    @Override
    public void execute() {
        this.bank.deductFromBank(paymentAmount);
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }
}
