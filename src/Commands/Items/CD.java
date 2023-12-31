package Commands.Items;

public class CD extends Item {
    private String itemName;
    private double itemPrice;
    private double cdLength;
    private int cdID;
    private boolean status;
    /**
     *
     * @param itemName the item's name
     * @param status the item's status
     */
    public CD(String itemName, boolean status)
    {
        super(itemName,status);
    }

    public CD(String itemName, double itemPrice, int cdID, boolean status) {
        super(itemName,itemPrice,status,cdID);
        this.cdLength = cdLength;
    }
    /**
     *
     * @param itemName the item's name
     * @param itemPrice the item's price
     * @param cdLength the cd's length
     * @param cdID the ID for the item (ex: 0)
     * @param status whether it has been sold
     */
    public CD(String itemName, double itemPrice, double cdLength, int cdID, boolean status) {
        super(itemName,itemPrice,status,cdID);
        this.cdLength = cdLength;
    }
    /**
     *
     * @return return the item's name
     */
    public String getItemName() {
        return itemName;
    }

    /**
     *
     * @return return the item's price
     */
    public double getItemPrice() {
        return itemPrice;
    }

    /**
     *
     * @return return the cd's length
     */
    public double getCdLength() {
        return cdLength;
    }

    /**
     *
     * @return the details of the item
     */
    @Override
    public String toString() {
        return "Name: " + getItemName() + "\nPrice: " + getItemPrice() + "\nCD Length: " + getCdLength();
    }

    /**
     *
     * @return return the cd's ID
     */
    public int getCdID() {
        return cdID;
    }

    /**
     *
     * @return return the item's status
     */
    public boolean isStatus() {
        return status;
    }

    /**
     *
     * @param status set the status of the item
     */
    public void setStatus(boolean status) {
        this.status = status;
    }

}