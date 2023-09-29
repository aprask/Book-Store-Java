package Commands;
import Commands.Items.Inventory;
import Commands.User.Client;

import java.util.*;
public class Store {
    private final Inventory inventory = new Inventory();
    static int trackOrderAmount = 1;
    private final Register register = new Register();
    private static final Scanner scan = new Scanner(System.in);
    private static int var;

    public static int getVar() {
        return var;
    }

    public static void setVar(int var) {
        Store.var = var;
    }

    public void greetingMessage() {
        System.out.println("Welcome to the store!");
        System.out.println("How many members are in your party? ");
        int partyTotal = scan.nextInt();
        this.register.partyTotal(partyTotal);
        handleUser();

    }

    public void menu() {
        switch (this.inventory.getSelectionID()) {
            case 1 -> {
                System.out.println("Which Book? Select by ID ");
                System.out.println(inventory);
                int selectedID = scan.nextInt();
                if (selectedID < 5 && selectedID > 0) {
                    this.register.proceedWithOrder();
                    double amountSpent = this.inventory.getBookPrice(selectedID);
                    this.register.handleBankInteraction(amountSpent, this.register.enter.getClient());
                    this.inventory.removeBook(selectedID);
                }
                break;
            }
            case 2 -> {
                System.out.println("Which CD? Select by ID ");
                System.out.println(inventory);
                int selectedID = scan.nextInt();
                if (selectedID < 5 && selectedID > 0) {
                    this.register.proceedWithOrder();
                    double amountSpent = this.inventory.getCDPrice(selectedID);
                    this.register.handleBankInteraction(amountSpent, this.register.enter.getClient());
                    this.inventory.removeCD(selectedID);
                }
                break;
            }
            case 3 -> {
                System.out.println("Which DVD? Select by ID ");
                System.out.println(inventory);
                int selectedID = scan.nextInt();
                if (selectedID < 5 && selectedID > 0) {
                    this.register.proceedWithOrder();
                    double amountSpent = this.inventory.getDVDPrice(selectedID);
                    this.register.handleBankInteraction(amountSpent, this.register.enter.getClient());
                    this.inventory.removeDVD(selectedID);
                }
                break;
            }
            default -> System.out.println("Error");
        }
    }

    public void handleUser() {
        for (int i = 0; i < this.register.getPartyTotal(); i++) {
            if (this.register.enter.getClient() == null)
            {
                break;
            }
            userBank(this.register.enter.getClient().getID());
        }
    }

    public void userBank(int ID) {
        do {
            if (this.register.enter.purchaseItem(ID)) {
                String customerName = this.register.handleCustomer();
                // TODO: Fix perpetual loop
                if(customerName == null)
                {
                    messageToCatchDuplicate();
                    CheckOutItems checkOut = new CheckOutItems(register);
                    checkOut.execute();
                    break;
                }
                System.out.println("\n" + customerName + "'s order:");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Would you like a CD, DVD, or a Book? ");
                var = this.register.createItems(this.inventory);
                this.inventory.setSelectionID(var);
                    menu();
                    if (scan.hasNextLine()) {
                        System.out.println("\nWould you like to add another item to your cart? Type \"1\": ");
                        if (this.register.getPartyTotal() > 1) {
                            System.out.println("Or would you like to move on to the next customer in your party? or \"2\"");
                        }
                        if (trackOrderAmount == this.register.getPartyTotal()) {
                            System.out.println("Or would you like to checkout? Type \"-1\"");
                        }
                        String cartChoice = scan.next();
                        if (cartChoice.equalsIgnoreCase("-1")) {
                            System.out.println("Would you like a refund? Type \"yes\" or \"no\"");
                            String refundOption = scan.next();
                            if (refundOption.equalsIgnoreCase("yes")) {
                                RefundItems refundItems = new RefundItems(register);
                                refundItems.execute();
                                break;
                            } else {
                                CheckOutItems checkOut = new CheckOutItems(register);
                                checkOut.execute();
                                break;
                            }
                        } else if (cartChoice.equalsIgnoreCase("2")) {
                            trackOrderAmount++;
                            handleUser();
                        } else if (cartChoice.equalsIgnoreCase("1")) {
                            var = this.register.createItems(this.inventory);
                            this.inventory.setSelectionID(var);
                        }
                    }
                }
            } while (true);
        }
        public void messageToCatchDuplicate()
        {
            System.out.println("What are you doing?");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Your party limit is " + this.register.getPartyTotal());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Time to complete your order...");
        }
    }