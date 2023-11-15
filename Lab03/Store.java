package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
    private DigitalVideoDisc itemsInStore[];
    private static final int MAX_NUMBERS_IN_STORE = 50; // Maximum number of DVDs in the store

    public Store() {
        itemsInStore = new DigitalVideoDisc[MAX_NUMBERS_IN_STORE];
    }

    public void addDVD(DigitalVideoDisc dvd) {
        for (int i = 0; i < MAX_NUMBERS_IN_STORE; i++) {
            if (itemsInStore[i] == null) {
                itemsInStore[i] = dvd;
                System.out.println("DVD added to the store: " + dvd.getTitle());
                return;
            }
        }
        System.out.println("The store is full. Cannot add more DVDs.");
    }

    public void removeDVD(String title) {
        for (int i = 0; i < MAX_NUMBERS_IN_STORE; i++) {
            if (itemsInStore[i] != null && itemsInStore[i].getTitle().equalsIgnoreCase(title)) {
                itemsInStore[i] = null;
                System.out.println("DVD removed from the store: " + title);
                return;
            }
        }
        System.out.println("DVD not found in the store: " + title);
    }
}
