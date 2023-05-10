package org.example.google_location;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.path.json.JsonPath;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Courses seleniumCourseContent = new Courses("Selenium Java",60,6);
        Courses cypressCourseContent = new Courses("Robot Framework",40,4);
        Courses RPACourseContent = new Courses("RestAssured testing",45,10);

        List<Courses> courses = new java.util.ArrayList<Courses>(Collections.<Courses>emptyList());
        courses.add(seleniumCourseContent);
        courses.add(cypressCourseContent);
        courses.add(RPACourseContent);

        int totatPrice = 0 ;
        for (Courses cours : courses) {
            totatPrice += cours.getPrice();
        }
        int totalCopies = 0 ;
        for (Courses cours : courses ) {
            totalCopies += cours.getCopies();
        }

        totatPrice = totatPrice * totalCopies;
        Dashboard dashboard = new Dashboard(totatPrice,"udemy.com");

        Payload payload = new Payload(dashboard,courses);

        ObjectMapper objMapper = new ObjectMapper();
        String _json = null ;
        try {
            _json = objMapper.writerWithDefaultPrettyPrinter().writeValueAsString(payload);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        System.out.println(_json);

        //Convert to json
        JsonPath js = new JsonPath(_json);

        // get total courses
        System.out.println("Courses count :" + js.getInt("courses.size()"));

        // get total purchases
        System.out.println("Total courses prices :" + js.getInt("dashboard.purchaseAmount"));

    }

    // build with builder pattern
//    public static void main(String[] args){

//                Courses seleniumCourseContent = new Courses();
////        Courses cypressCourseContent = new Courses("Robot Framework",40,4);
////        Courses RPACourseContent = new Courses("RestAssured testing",45,10);
//        Payload payloadBuilder = PayloadBuilder.builder()
//                .setPurchaseAmount(new Dashboard().setPurchaseAmount(190))
//                .setWebsite(new Dashboard().setWebsite("udemy.com"))
//                .setTitle(seleniumCourseContent.setCourseTitle("Selenium Java"))
//                .setPrice(seleniumCourseContent.setCoursePrice(40))
//                .setCopies(seleniumCourseContent.setCourseCopies(4))
////                .and()
////                .setTitle(new Courses().setTitle("Cypress"))
////                .setPrice(new Courses().setPrice(60))
////                .setCopies(new Courses().setCopies(3))
////                .and()
////                .setTitle(new Courses().setTitle("Robot Framework"))
////                .setPrice(new Courses().setPrice(35))
////                .setCopies(new Courses().setCopies(6))
//                .perform();
//
//
////        List<Courses> courses = new java.util.ArrayList<Courses>(Collections.<Courses>emptyList());
////        courses.add(seleniumCourseContent);
////        courses.add(cypressCourseContent);
////        courses.add(RPACourseContent);
//
//
////        Dashboard dashboard = new Dashboard(totatPrice,"udemy.com");
//
////        Payload payload = new Payload(dashboard,courses);
//
//        ObjectMapper objMapper = new ObjectMapper();
//        String _json = null ;
//        try {
//            _json = objMapper.writerWithDefaultPrettyPrinter().writeValueAsString(payloadBuilder);
//        } catch (JsonProcessingException e) {
//            e.printStackTrace();
//        }
//        System.out.println(_json);
//
//        //Convert to json
////        JsonPath js = new JsonPath(_json);
////
////        // get total courses
////        System.out.println("Courses count :" + js.getInt("courses.size()"));
////
////        // get total purchases
////        System.out.println("Total courses prices :" + js.getInt("dashboard.purchaseAmount"));
//
//    }
}
