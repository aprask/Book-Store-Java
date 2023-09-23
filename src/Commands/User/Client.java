package Commands;

public class Client implements CustomerDetails{
    private String name;
    private int ID = 1000;
    private boolean orderStatus;
    private String membershipType;
    private Register register;
    public Client(String name, String membershipType)
    {
        this.name = name;
        this.ID = ID++;
        this.orderStatus = true; // call checkoutitems.java
        this.membershipType = membershipType;
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
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }
}
