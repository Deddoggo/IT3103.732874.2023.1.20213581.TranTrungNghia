package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.media.Media;

import java.util.ArrayList;

public class Cart {
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();

    // Thêm một Media vào giỏ hàng
    public void addMedia(Media d) {
        itemsOrdered.add(d);
        System.out.println("The media has been added!");
    }

    // Thêm một danh sách Media vào giỏ hàng
    public void addMedia(Media[] dList) {
        for (Media disc : dList) {
            addMedia(disc);
        }
    }

    // Thêm hai Media vào giỏ hàng
    public void addMedia(Media d1, Media d2) {
        addMedia(d1);
        addMedia(d2);
    }

    // Xóa một Media khỏi giỏ hàng
    public void removeMedia(Media d) {
        try {
            itemsOrdered.remove(d);
            System.out.println("The media is removed!");
        } catch (Exception e) {
            System.out.println("Media has not been added yet!");
            return;
        }
    }

    // Tính tổng chi phí của các Media trong giỏ hàng
    public float totalCost() {
        float total = 0;
        for (int i = 0; i < itemsOrdered.size(); i++) {
            total += itemsOrdered.get(i).getCost();
        }
        return total;
    }

    // In thông tin giỏ hàng
    public void print() {
        System.out.println("***********************CART***********************");
        for (int i = 0; i < this.itemsOrdered.size(); i++) {
            System.out.println(i + 1 + ". " + itemsOrdered.get(i));
        }
        System.out.println("Total cost: " + totalCost() + "$");
        System.out.println("**************************************************");
    }

    // Lấy danh sách Media trong giỏ hàng
    public ArrayList<Media> getItemsOrdered() {
        return itemsOrdered;
    }

    // Tìm kiếm Media theo ID trong giỏ hàng
    public void searchId(int id) {
        for (Media item : itemsOrdered) {
            if (item.getId() == id) {
                System.out.println(item);
                return;
            }
        }
        System.out.println("No media is matched!");
    }

    // Tìm kiếm Media theo tiêu đề trong giỏ hàng
    public void searchTitle(String title) {
        for (Media item : itemsOrdered) {
            if (item.getTitle().equals(title)) {
                System.out.println(item);
                return;
            }
        }
        System.out.println("No media is matched!");
    }
}
