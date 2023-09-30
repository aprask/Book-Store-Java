package Commands.Items;

public class DVD {
    private final String itemName;
    private double itemPrice;
    private double dvdLength;
    private int dvdID;
    private boolean status;
    public DVD(String itemName, boolean status)
    {
        this.itemName = itemName;
        this.status = status;
    }
    public DVD(String itemName, double itemPrice, double dvdLength, int dvdID, boolean status) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.dvdLength = dvdLength;
        this.dvdID = dvdID;
        this.status = status;
    }

    public String getItemName() {
        return itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public double getDvdLength() {
        return dvdLength;
    }
    @Override
    public String toString() {
        return "Name: " + getItemName() + "\nPrice: " + getItemPrice() + "\nDVD Length: " + getDvdLength();
    }

    public int getDvdID() {
        return dvdID;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
