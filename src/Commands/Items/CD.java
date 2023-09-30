package Commands.Items;

public class CD {
    private final String itemName;
    private double itemPrice;
    private double cdLength;
    private int cdID;
    private boolean status;
    public CD(String itemName, boolean status)
    {
        this.itemName = itemName;
        this.status = status;
    }
    public CD(String itemName, double itemPrice, double cdLength, int cdID, boolean status) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.cdLength = cdLength;
        this.cdID = cdID;
        this.status = status;
    }

    public String getItemName() {
        return itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }
    public double getCdLength() {
        return cdLength;
    }
    @Override
    public String toString() {
        return "Name: " + getItemName() + "\nPrice: " + getItemPrice() + "\nCD Length: " + getCdLength();
     }

    public int getCdID() {
        return cdID;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
