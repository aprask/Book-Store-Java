package Commands.User;

import Commands.Register;

public class Client implements CustomerDetails {
    private String name;
    private static int ID = 1000;
    private boolean orderStatus;
    private boolean premiumMember;
    private String paymentType;
    private static final Register register = new Register();
    public Client(String name, boolean membershipType, String paymentType)
    {
        this.name = name;
        ID = ID++;
        this.orderStatus = register.isOrderDone(true);
        this.premiumMember = membershipType;
        this.paymentType = paymentType;
    }
    @Override
    public String returnName() {
        return null;
    }

    @Override
    public int returnID() {
        return 0;
    }

    @Override
    public boolean orderStatus() {
        return false;
    }

    @Override
    public String membershipType() {
        return null;
    }

    @Override
    public int nextMonthlyBill() {
        return 0;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        Client.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String displayMembershipDetails()
    {
        if(premiumMember)
        {
            return "Member Type: Premium";
        }
        else
        {
            return "Member Type: Standard";
        }
    }
    public void identifyUser()
    {
        System.out.println("Name: " + getName());
        System.out.println("Payment Type: " + getPaymentType());
        System.out.println("Membership Type: " + displayMembershipDetails());
        System.out.println("User ID Number: " + getID());
    }
    public boolean isOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(boolean orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public boolean isPremiumMember() {
        return premiumMember;
    }

    public void setPremiumMember(boolean premiumMember) {
        this.premiumMember = premiumMember;
    }
}
