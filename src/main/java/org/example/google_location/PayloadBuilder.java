package org.example.google_location;

import java.util.ArrayList;
import java.util.List;

public class PayloadBuilder {
    Dashboard dashboard = new Dashboard();
    List<Courses> courses = new ArrayList<Courses>();

    public static PayloadBuilder builder(){
        return new PayloadBuilder();
    }

    public PayloadBuilder and(){
        return this;
    }

    public PayloadBuilder with(){
        return this;
    }

    public PayloadBuilder setPurchaseAmount(int purcaseAmount) {
        dashboard.setPurchaseAmount(purcaseAmount);
        return this;
    }

    public PayloadBuilder setWebsite(String website) {
        dashboard.setWebsite(website);
        return this;
    }

    public PayloadBuilder setTitle(String title) {
        new Courses().setCourseTitle(title);
        return this;
    }

    public PayloadBuilder setPrice(int price) {
        new Courses().setCoursePrice(price);
        return this;
    }

    public PayloadBuilder setCopies(int copies) {
        new Courses().setCourseCopies(copies);
        return this;
    }

    public Payload perform(){
        return new Payload(dashboard,courses);
    }
}
