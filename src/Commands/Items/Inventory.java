package Commands.Items;

public class Inventory {
    private static Book[] books = new Book[5];
    private static CD[] cds = new CD[5];
    private static DVD[] dvds = new DVD[5];
    public Inventory()
    {
        Book theHobbit = new Book("The Hobbit",3.75,100);
        books[0] = theHobbit;
        Book theLordOfTheRings = new Book("The Lord of the Rings", 5.00,1000);
        books[1] = theLordOfTheRings;
        Book animalFarm = new Book("Animal Farm", 5.00,250);
        books[2] = animalFarm;
        Book theIliad = new Book("The Iliad", 40.25, 800);
        books[3] = theIliad;
        Book nineteenEightyFour = new Book("1984",10.50,95);
        books[4] = nineteenEightyFour;

        CD thriller = new CD("Thriller", 8.95, 250);
        cds[0] = thriller;
        CD hotelCalifornia = new CD("Hotel California",6.95, 100);
        cds[1] = hotelCalifornia;
        CD backInBlack = new CD("Back in Black", 5.50,150);
        cds[2] = backInBlack;
        CD thePlanets = new CD("The Planets", 150.75, 5000);
        cds[3] = thePlanets;
        CD rideOfTheValkyries = new CD("Ride of the Valkyries", 250.25, 250);
        cds[4] = rideOfTheValkyries;

        DVD starWars = new DVD("Star Wars", 9.15,600);
        dvds[0] = starWars;
        DVD theTerminator = new DVD("The Terminator", 10.55, 550);
        dvds[1] = theTerminator;
        DVD starTrek = new DVD("Star Trek", 10.75, 1000);
        dvds[2] = starTrek;
        DVD theGodfather = new DVD("The Godfather", 25.25, 1025);
        dvds[3] = theGodfather;
        DVD theSopranos = new DVD("The Sopranos", 12.55, 1202);
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
}