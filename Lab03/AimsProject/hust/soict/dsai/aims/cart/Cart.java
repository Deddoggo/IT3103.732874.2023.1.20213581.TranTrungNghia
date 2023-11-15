package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import java.text.DecimalFormat;

public class Cart {
    private DigitalVideoDisc itemsOrdered[];
    private int qtyOrdered;
    private static final int MAX_NUMBERS_ORDERED = 20; // Max number of DVDs in cart is 20

    // Constructor
    public Cart() {
        itemsOrdered = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
        qtyOrdered = 0;
    }

    // Method to add a single DVD to the cart
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added.");
        } else {
            System.out.println("The cart is almost full.");
        }
    }

    // Overloading method to add multiple DVDs to the cart using an array
    public void addDigitalVideoDisc(DigitalVideoDisc... dvdList) {
        if ((qtyOrdered + dvdList.length) < MAX_NUMBERS_ORDERED) {
            for (DigitalVideoDisc disc : dvdList) {
                itemsOrdered[qtyOrdered] = disc;
                qtyOrdered++;
            }
            System.out.println("List of DVDs has been added to the cart.");
        } else {
            System.out.println("The cart is almost full.");
        }
    }


    // Overloading method to add two DVDs to the cart
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        if ((qtyOrdered + 2) <= MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = dvd1;
            itemsOrdered[qtyOrdered + 1] = dvd2;
            qtyOrdered += 2;
            System.out.println("2 DVDs have been added to the cart.");
        } else {
            System.out.println("The cart is almost full.");
        }
    }

    // Method to remove a DVD from the cart
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i] == disc) {
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                itemsOrdered[qtyOrdered - 1] = null;
                qtyOrdered--;
                System.out.println("The disc has been removed.");
                return;
            }
        }
        System.out.println("The disc was not found in the cart.");
    }

    // Method to calculate the total cost of items in the cart
    public double totalCost() {
        double total = 0.0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }

    // Method to print items in the cart and their total cost
    public void print() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");

        int index = 1;
        float totalCost = 0;

        for (int i = 0; i < qtyOrdered; i++) {
            DigitalVideoDisc dvd = itemsOrdered[i];
            if (dvd != null) {
                System.out.println(index + ". " + dvd.toString());
                totalCost += dvd.getCost();
                index++;
            }
        }

        System.out.println("Total cost: " + totalCost);
        System.out.println("***************************************************");
    }

    // Method to search for a DVD in the cart by its ID
    public void searchById(int id) {
        for (DigitalVideoDisc dvd : itemsOrdered) {
            if (dvd.getId() == id) {
                System.out.println("Found DVD: " + dvd.toString());
                return;
            }
        }
        System.out.println("No match found for ID: " + id);
    }

    // Method to search for a DVD in the cart by its title
    public void searchByTitle(String title) {
        boolean found = false;

        for (DigitalVideoDisc dvd : itemsOrdered) {
            if (dvd != null && dvd.isMatch(title)) {
                System.out.println("Found DVD: " + dvd.toString());
                found = true;
            }
        }

        if (!found) {
            System.out.println("No match found for title: " + title);
        }
    }
}
