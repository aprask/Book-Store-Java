package Items;

import java.util.*;
public class CD extends Item
{
    private static LinkedList<CD> CDs = new LinkedList<CD>();
    static Scanner scan = new Scanner(System.in);
    public CD()
    {

    }
    public CD(String name, float cost, float len)
    {

    }
    public void addCD(String name, float cost, float len)
    {
        CDs.add(new CD(name, cost, len));
    }
    public ArrayList<CD> listCDs(ArrayList<CD> cd)
    {
        return cd;
    }
    public LinkedList<CD> getCDs() {
        return CDs;
    }
    public void setCDs(LinkedList<CD> CDs) {
        CD.CDs = CDs;
    }
}
