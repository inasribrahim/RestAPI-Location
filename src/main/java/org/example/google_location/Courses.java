package org.example.google_location;

public class Courses {
    private String title;
    private int price;
    private int copies;

    public Courses(String title, int price, int copies){
        this.title = title;
        this.price = price;
        this.copies = copies;
    }

    public Courses(){
        this.title = title;
        this.price = price;
        this.copies = copies;
    }
    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public int getCopies() {
        return copies;
    }

    public String setCourseTitle(String title) {
        this.title = title;
        return title;
    }

    public int setCoursePrice(int price) {
        this.price = price;
        return price;
    }

    public int setCourseCopies(int copies) {
        this.copies = copies;
        return copies;
    }
}
