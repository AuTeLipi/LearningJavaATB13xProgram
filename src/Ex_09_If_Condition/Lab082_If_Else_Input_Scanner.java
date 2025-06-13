package Ex_09_If_Condition;

import java.util.Scanner;

public class Lab082_If_Else_Input_Scanner {
    public static void main(String[] args) {

        // Allowed to vote or not
        // If age > 18 -> allowed to vote.
        // else age < >18 -> Not allowed to vote.

        // int age = Integer.parseInt(args[0]);

        System.out.println("Enter Your Age:");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if(age <= 18){
            System.out.println("Minor! I am not eligible to vote!!!");
        }
        else{
            System.out.println("Adult! I am eligible to vote!!!");
        }
    }
}
