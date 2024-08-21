/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hms.model;

/**
 *
 * @author Bakhtiar Mazrur
 */
public class RadioLogicalTest extends LabTest{
   
    private String plateDimension;
    
    public RadioLogicalTest(String title, String plateDimension, double cost, boolean isAvailable) {
        this.title = title;
        this.plateDimension = plateDimension;
        this.cost = cost;
        this.isAvailable = isAvailable;
    }

    public RadioLogicalTest() {
        System.out.println("This is the default Constructor");
    }

    public String returnLabTestInfo() {
        String output = "Test name: " + this.getTitle() + " "
                + "Test Type: " + this.getPlateDimension()+ " "
                + "Cost: " + this.getCost() + " "
                + "Availability: " + this.isIsAvailable();
        return output;
    }
    
    public RadioLogicalTest(String plateDimension) {
        this.plateDimension = plateDimension;
    }

    public String getPlateDimension() {
        return plateDimension;
    }

    public void setPlateDimension(String plateDimension) {
        this.plateDimension = plateDimension;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    
}

