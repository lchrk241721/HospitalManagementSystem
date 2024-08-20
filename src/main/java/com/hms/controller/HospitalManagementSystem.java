/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.hms.controller;
import com.hms.model.*;
import com.hms.view.*;

/**
 *
 * @author Bakhtiar Mazrur
 */
public class HospitalManagementSystem {

    public static void main(String[] args) {
        System.out.println("Showing the homepage");
        Home viewHome = new Home();
        viewHome.setVisible(true);
        PathologicalTest pTest = new PathologicalTest("Blood", "CBC", 400, true);
        System.out.println(pTest.returnLabTestInfo());
        pTest.setCost(300);
        System.out.println("The updated cost of CBC is "+ pTest.getCost());
        System.out.println(pTest.returnLabTestInfo());
        
//        PathologyTest viewHome = new PathologyTest();
//        viewHome.setVisible(true);
    }
}