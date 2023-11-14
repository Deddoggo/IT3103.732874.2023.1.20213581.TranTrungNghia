package hust.soict.dsai.aims;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

import java.text.DecimalFormat;

public class Aims {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("##.##");
        //Create a new cart
        Cart anOrder = new Cart();
        //Creat new DVD objects and add them to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation", "Roger Allers",87,19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction", "George Lucas",87,24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation",18.99f);

        anOrder.addDigitalVideoDisc(dvd1);
        anOrder.addDigitalVideoDisc(dvd2);
        anOrder.addDigitalVideoDisc(dvd3);
        System.out.println("Total cost of the cart: $" + df.format(anOrder.totalCost()));

        anOrder.removeDigitalVideoDisc(dvd1);
        anOrder.removeDigitalVideoDisc(dvd2);

        System.out.println("Total cost of the cart after removal: $" + df.format(anOrder.totalCost()));
    }
}