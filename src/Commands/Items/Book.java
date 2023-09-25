package Commands.Items;

public class Book {
    private String itemName;
    private double itemPrice;
    private int pages;
    private int ID;
    public Book(String itemName, double itemPrice, int pages, int ID) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.pages = pages;
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

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
    @Override
    public String toString() {
        return "Name: " + getItemName() + "\nPrice: " + getItemPrice() + "\nPage Count: " + getPages();
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
