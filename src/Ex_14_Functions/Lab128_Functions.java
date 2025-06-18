package Ex_14_Functions;

import java.util.Scanner;

public class Lab128_Functions {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1st number (a):");
        int a = scanner.nextInt();

        System.out.println("Enter 2nd number (b):");
        int b = scanner.nextInt();

        //  Built In Functions
        // Created by the Java Guys
        //Math is nuild in function

        int result = Math.min(a,b);
        System.out.println("Minimum number is: " +result);
    }
}
