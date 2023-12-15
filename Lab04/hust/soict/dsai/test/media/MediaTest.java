package hust.soict.dsai.test.media;

import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

import java.util.ArrayList;
import java.util.List;

public class MediaTest {

    public static void main(String[] args) {
        List<Media> mediae = new ArrayList<Media>();
        CompactDisc cd = new CompactDisc("MAPPA","Anime","Jujutsu Kaisen",19.00f);
        DigitalVideoDisc dvd = new DigitalVideoDisc("Titanic","Romance Movie","James Cameron",23,12.50f);
        Book book = new Book("Giai tich 3","Sach giao khoa", 1.50f);
        mediae.add(cd);
        mediae.add(dvd);
        mediae.add(book);

        for(Media m: mediae) {
            System.out.println(m.toString());
        }
    }

}
