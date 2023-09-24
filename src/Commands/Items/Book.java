package Commands.Items;

public class Book {
    private String itemName;
    private double itemPrice;
    private int pages;
    public Book(String itemName, double itemPrice, int pages) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.pages = pages;
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
}
