package Commands.Items;

import Commands.Register;

public class Inventory {
    private static Book[] books = new Book[5];
    private static CD[] cds = new CD[5];
    private static DVD[] dvds = new DVD[5];
    private int numOfBooks = books.length-1;
    private int numOfCDs = books.length-1;
    private int numOfDVDs = books.length-1;
    private final Register register = new Register();

    public Inventory()
    {
        Book theHobbit = new Book("The Hobbit",3.75,100,1);
        books[0] = theHobbit;
        Book theLordOfTheRings = new Book("The Lord of the Rings", 5.00,1000,2);
        books[1] = theLordOfTheRings;
        Book animalFarm = new Book("Animal Farm", 5.00,250,3);
        books[2] = animalFarm;
        Book theIliad = new Book("The Iliad", 40.25, 8000,4);
        books[3] = theIliad;
        Book nineteenEightyFour = new Book("1984",10.50,95,5);
        books[4] = nineteenEightyFour;

        CD thriller = new CD("Thriller", 8.95, 250,1);
        cds[0] = thriller;
        CD hotelCalifornia = new CD("Hotel California",6.95, 100,2);
        cds[1] = hotelCalifornia;
        CD backInBlack = new CD("Back in Black", 5.50,150,3);
        cds[2] = backInBlack;
        CD thePlanets = new CD("The Planets", 150.75, 5000,4);
        cds[3] = thePlanets;
        CD rideOfTheValkyries = new CD("Ride of the Valkyries", 250.25, 250,5);
        cds[4] = rideOfTheValkyries;

        DVD starWars = new DVD("Star Wars", 9.15,600,1);
        dvds[0] = starWars;
        DVD theTerminator = new DVD("The Terminator", 10.55, 550,2);
        dvds[1] = theTerminator;
        DVD starTrek = new DVD("Star Trek", 10.75, 1000,3);
        dvds[2] = starTrek;
        DVD theGodfather = new DVD("The Godfather", 25.25, 1025,4);
        dvds[3] = theGodfather;
        DVD theSopranos = new DVD("The Sopranos", 12.55, 1202,5);
        dvds[4] = theSopranos;
    }

    public static CD[] getCds() {
        return cds;
    }
    public static Book[] getBooks() {
        return books;
    }
    public static DVD[] getDvds() {
        return dvds;
    }

    public static void setBooks(Book[] books) {
        Inventory.books = books;
    }

    public static void setCds(CD[] cds) {
        Inventory.cds = cds;
    }

    public static void setDvds(DVD[] dvds) {
        Inventory.dvds = dvds;
    }
    public void availableBooks()
    {
        System.out.println("Available Books: ");
        for (Book book : books) {
            System.out.println();
            System.out.println("Name: " + book.getItemName());
            System.out.println("Price: $" + book.getItemPrice());
            System.out.println("Pages: " + book.getPages());
        }
    }
    public void availableCDs()
    {
        System.out.println("Available CDs: ");
        for(CD cd : cds)
        {
            System.out.println();
            System.out.println("Name: " + cd.getItemName());
            System.out.println("Price: $" + cd.getItemPrice());
            System.out.println("Length in seconds: " + cd.getCdLength());
        }
    }
    public void availableDVDs()
    {
        System.out.println("Available DVDs: ");
        for(DVD dvd : dvds)
        {
            System.out.println();
            System.out.println("Name: " + dvd.getItemName());
            System.out.println("Price: $" + dvd.getItemPrice());
            System.out.println("Length in seconds: " + dvd.getDvdLength());
        }
    }
    @Override
    public String toString() {
        int var = this.register.createItems();
        if(var == 1)
        {
            return
                    books[0].getItemName() + ": " + books[0].getID() +
                            "\n" +
                    books[1].getItemName() + ": " + books[1].getID() +
                            "\n" +
                    books[2].getItemName() + ": " + books[2].getID() +
                            "\n" +
                    books[3].getItemName() + ": " + books[3].getID() +
                            "\n" +
                    books[4].getItemName() + ": " + books[4].getID();
        }
        else if(var == 2)
        {
           return
                   cds[0].getItemName() + ": " + cds[0].getID() +
                           "\n" +
                   cds[1].getItemName() + ": " + cds[1].getID() +
                           "\n" +
                   cds[2].getItemName() + ": " + cds[2].getID() +
                           "\n" +
                   cds[3].getItemName() + ": " + cds[3].getID() +
                           "\n" +
                   cds[4].getItemName() + ": " + cds[4].getID();
        }
        else if(var == 3)
        {
            return
                    dvds[0].getItemName() + ": " + dvds[0].getID() +
                            "\n" +
                    dvds[1].getItemName() + ": " + dvds[1].getID() +
                            "\n" +
                    dvds[2].getItemName() + ": " + dvds[2].getID() +
                            "\n" +
                    dvds[3].getItemName() + ": " + dvds[3].getID() +
                            "\n" +
                    dvds[4].getItemName() + ": " + dvds[4].getID();
        }
        else return null;
    }

    public int getNumOfBooks() {
        return numOfBooks;
    }

    public void setNumOfBooks(int numOfBooks) {
        this.numOfBooks = numOfBooks;
    }

    public int getNumOfCDs() {
        return numOfCDs;
    }

    public void setNumOfCDs(int numOfCDs) {
        this.numOfCDs = numOfCDs;
    }
    public int getNumOfDVDs() {
        return numOfDVDs;
    }

    public void setNumOfDVDs(int numOfDVDs) {
        this.numOfDVDs = numOfDVDs;
    }
}