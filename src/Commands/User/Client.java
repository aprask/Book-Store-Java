package Commands.User;

import Commands.Register;
import java.util.*;
public class Client implements CustomerDetails {
    private String name;
    private static int ID = 0;
    private boolean orderStatus;
    private boolean premiumMember;
    static Scanner scan = new Scanner(System.in);
    private String paymentType;
    private static final Register register = new Register();
    public Client()
    {

    }
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
        return this.name;
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
        return this.name;
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
    public void membershipDueDate()
    {
        System.out.println("What month did you purchase your membership? ");
        System.out.println("Type in a number 1-12 to represent the month: ");
        int membershipMonth = scan.nextInt();
        final float premiumPayment = 7.55f;
        switch (membershipMonth) {
            case 1 -> System.out.println("Your membership payment of $" + premiumPayment + " will be due in February");
            case 2 -> System.out.println("Your membership payment of $" + premiumPayment + " will be due in March");
            case 3 -> System.out.println("Your membership payment of $" + premiumPayment + " will be due in April");
            case 4 -> System.out.println("Your membership payment of $" + premiumPayment + " will be due in May");
            case 5 -> System.out.println("Your membership payment of $" + premiumPayment + " will be due in June");
            case 6 -> System.out.println("Your membership payment of $" + premiumPayment + " will be due in July");
            case 7 -> System.out.println("Your membership payment of $" + premiumPayment + " will be due in August");
            case 8 -> System.out.println("Your membership payment of $" + premiumPayment + " will be due in September");
            case 9 -> System.out.println("Your membership payment of $" + premiumPayment + " will be due in October");
            case 10 -> System.out.println("Your membership payment of $" + premiumPayment + " will be due in November");
            case 11 -> System.out.println("Your membership payment of $" + premiumPayment + " will be due in December");
            case 12 -> System.out.println("Your membership payment of $" + premiumPayment + " will be due in January");
            default -> System.out.println("Error");
        }
    }
}
