package com.tcc.java.programs;
 
import java.util.Scanner;
 
public class VolumeOfCubeFunction {
 
    public static void main(String[] args) {
        double side;
        Scanner scanner;
        scanner = new Scanner(System.in);
        // Take input from user
        System.out.println("Enter Length of Side of Cube");
        side = scanner.nextDouble();
 
        System.out.format("Surface Area of Cube = %.3f\n", 
            getSurfaceArea(side));
        System.out.format("Volume of Cube = %.3f\n", 
            getVolume(side));
    }
 
    public static double getSurfaceArea(double side) {
        /* Total surface area of Cube = 6 X side X side */
        return 6 * side * side;
    }
 
    public static double getVolume(double side) {
        /* Volume of Cube = side X side X side */
        return side * side * side;
    }
}