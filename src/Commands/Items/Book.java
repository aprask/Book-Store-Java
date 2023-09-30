package Commands.Items;

public class Book {
    private final String itemName;
    private double itemPrice;
    private int pages;
    private int bookID;
    private boolean status;
    public Book(String itemName, boolean status)
    {
        this.itemName = itemName;
        this.status = status;
    }
    public Book(String itemName, double itemPrice, int pages, int bookID, boolean status) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.pages = pages;
        this.bookID = bookID;
        this.status = status;
    }

    public String getItemName() {
        return itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }
    public int getPages() {
        return pages;
    }
    @Override
    public String toString() {
        return "Name: " + getItemName() + "\nPrice: " + getItemPrice() + "\nPage Count: " + getPages();
    }

    public int getBookID() {
        return bookID;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
