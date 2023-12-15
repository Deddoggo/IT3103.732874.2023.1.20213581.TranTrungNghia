package hust.soict.dsai.aims.disc;

import java.text.DecimalFormat;

public class DigitalVideoDisc {
    private static int nbDigitalVideoDiscs = 0;
    private int id;
    private String title; // Create title of a DVD with String type
    private String category;// Create category of a DVD with String type
    private String director;// Create director of a DVD with String type
    private int length;// Create length of a DVD with integer type
    private float cost;// Create cost of a DVD with float type

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public float getCost() {
        return cost;
    }

    public int getId() { return id; }

    public DigitalVideoDisc(String title) {
        this.title = title;
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        // Assign unique id for each instance
        this.id = ++nbDigitalVideoDiscs;

        // Other assignments
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        // Assign unique id for each instance
        this.id = ++nbDigitalVideoDiscs;

        // Other assignments
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        // Assign unique id for each instance
        this.id = ++nbDigitalVideoDiscs;

        // Other assignments
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isMatch(String title) {
        // Implement the matching rule based on the problem statement
        return this.title.toLowerCase().contains(title.toLowerCase());
    }

    public String toString() {
        return "DVD - Title: " + title + " - Category: " + category +
                " - Director: " + director + " - Length: " + length +
                " - Cost: " + new DecimalFormat("#.##").format(cost) + " $";
    }
}
