/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hms.model;

/**
 *
 * @author Bakhtiar Mazrur
 */
public class PathologicalTest {

    String title;
    double cost;
    boolean isAvailable;

    public PathologicalTest(String title, double cost, boolean isAvailable) {
        this.title = title;
        this.cost = cost;
        this.isAvailable = isAvailable;
    }

    public PathologicalTest() {
    }

    String show() {
        String output = "Test name: " + this.title + "<br>"
                + "Cost: " + this.cost + "<br>"
                + "Availability: " + this.isAvailable;
        return output;
    }
}
