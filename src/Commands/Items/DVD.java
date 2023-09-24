package Commands.Items;

public class DVD {
    private String itemName;
    private double itemPrice;
    private double dvdLength;
    public DVD(String itemName, double itemPrice, double dvdLength) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.dvdLength = dvdLength;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public double getDvdLength() {
        return dvdLength;
    }

    public void setDvdLength(double dvdLength) {
        this.dvdLength = dvdLength;
    }
    @Override
    public String toString() {
        return "Name: " + getItemName() + "\nPrice: " + getItemPrice() + "\nDVD Length: " + getDvdLength();
    }
}
