# Book Store w/ Java

## Project for UNCC

###### Author: Andrew Praskala

Function 1 (Registering Members) **finished**
1. Asking for the quantity of party
2. Log the users in a queue
3. I utilized the queue data structure since it is a FIFO data structure.
   4. For the program it makes the most sense
      5. Hence, a store
6. The ability to create a user/client w/ an ID, name, and premium member status is all there
7. Moreover, I allow the user to select premium membership w/ a boolean data type
8. I then encapsulated all this via the Registration.java class
   9. That is essentially where most of the client work is done
10. Also, I log customers w/ the EnterStore class and store even more data types there
    11. The goal was to never "lose track" of the user
        12. Which was a major problem.
        13. My program, for a while, kept returning null

Function 2 (Complete Purchase) **finished**
1. Users can complete a purchase
2. Users can add multiple items
3. Items will be removed from the inventory after purchase
4. I utilized a fixed array, since I was getting IndexOutOfBounds and NullPointerExceptions with lists
   5. I sacrificed elegance for functionality
6. Store.java handles most of this work

Function 3 (Item Creation) **finished**
1. There is a completed set of items in a fixed array
2. Users can buy items
3. I was going to use enums but opted for a switch statement
4. Inventory.java and specifically initializeItems() handles this operation

Function 4 (Banking System) **unfinished**
1. Sadly, I still have bugs w/ the banking system.
2. I do not have **enough time** to fix them prior to the deadline.
   3. I will fix them in the future, as a personal project.
4. But the system still runs, but some of the math is wrong.
   5. When a user adds multiple items the static variable orderTotal should show the appropriate amount
      6. Evidently, it is not.
         7. Sometimes it works and sometimes it doesn't.
   8. Basically, it only logs their initial purchase. It doesn't consider the additional purchases after the user presses "2".

Future:
* I plan on refining this code for my resume
* It is a good concept, just needs to be cleaned up
* I should have started earlier on this, sadly I only spent 5 days on this project