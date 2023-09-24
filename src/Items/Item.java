package Items;
public abstract class Item {
    private String itemName;
    private float itemPrice;
    private float itemLength;
    public float getItemPrice() {
        return itemPrice;
    }
    public void setItemPrice(float itemPrice) {
        this.itemPrice = itemPrice;
    }
    public String getItemName() {
        return itemName;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public float getItemLength() {
        return itemLength;
    }
    public void setItemLength(float itemLength) {
        this.itemLength = itemLength;
    }

}
