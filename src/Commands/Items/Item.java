package Commands.Items;

import java.util.ArrayList;

public abstract class Item
{
    private String name;
    private double price;
    private boolean sold;
    private int ID;
    private ArrayList<Item> itemList = new ArrayList<>();

    private Item(String name, double price, boolean sold, int ID)
    {
        this.name = name;
        this.price = price;
        this.sold = sold;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isSold() {
        return sold;
    }

    public void setSold(boolean sold) {
        this.sold = sold;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public ArrayList<Item> getItemList() {
        return itemList;
    }

    public void setItemList(ArrayList<Item> itemList) {
        this.itemList = itemList;
    }
}
