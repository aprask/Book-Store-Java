package Commands.Items;

public class CD {
    private String itemName;
    private double itemPrice;
    private double cdLength;
    private int ID;
    public CD(String itemName, double itemPrice, double cdLength, int ID) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.cdLength = cdLength;
        this.ID = ID;
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

    public double getCdLength() {
        return cdLength;
    }

    public void setCdLength(double cdLength) {
        this.cdLength = cdLength;
    }
    @Override
    public String toString() {
        return "Name: " + getItemName() + "\nPrice: " + getItemPrice() + "\nCD Length: " + getCdLength();
     }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
