package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius = -1;
        double area = -1;
    while(radius < 0) {
        System.out.println("Enter a radius: ");
        if (input.hasNextDouble()) {
            radius = input.nextDouble();
            area = Circle.getArea(radius);
        } else {
            radius = 0;
            area = 0;
        }
    }
        input.close();






    if(area > 0) {
        System.out.println(area);
    } else {
        System.out.println("You have probably entered invalid data");
    }


    }


}


