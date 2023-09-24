package Commands.Items;

public class CD {
    private String itemName;
    private double itemPrice;
    private double cdLength;
    public CD(String itemName, double itemPrice, double cdLength) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.cdLength = cdLength;
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
}
