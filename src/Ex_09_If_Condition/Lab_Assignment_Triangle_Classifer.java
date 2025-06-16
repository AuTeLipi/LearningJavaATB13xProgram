package Ex_09_If_Condition;

import java.util.Scanner;

public class Lab_Assignment_Triangle_Classifer {
    public static void main(String[] args) {
        /*

        Triangle Classifier :** Write a program that classifies a triangle based on its side lengths. Given three input values representing the lengths of the sides,
        determine if the triangle is equilateral (all sides are equal), isosceles (exactly two sides are equal), or scalene (no sides are equal). Use an if-else statement
        to classify the triangle.

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of side1 of triangle:");
        int side1 = scanner.nextInt();

        System.out.println("Enter the value of side2 of triangle:");
        int side2 = scanner.nextInt();

        System.out.println("Enter the value of side3 of triangle:");
        int side3 = scanner.nextInt();

        if (side1 == side2 && side2 == side3) {
            System.out.println("Triangle is equilateral (all sides are equal)");
        } else if (side1 == side2 || side2 == side3 || side1 == side3) {
            System.out.println("Isosceles (exactly two sides are equal)");
        } else {
            System.out.println("Scalene (no sides are equal)");
        }

    }
}
