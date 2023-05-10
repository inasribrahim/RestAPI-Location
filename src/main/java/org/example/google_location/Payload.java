package org.example.google_location;

import java.util.ArrayList;
import java.util.List;

public class Payload {
    Dashboard dashboard;
    List<Courses> courses;
    public Payload(Dashboard dashboard, List<Courses> courses) {
        this.dashboard = dashboard;
        this.courses = courses;
    }

    public Dashboard getDashboard() {
        return dashboard;
    }
    public List<Courses> getCourses() {
        return courses;
    }

}
