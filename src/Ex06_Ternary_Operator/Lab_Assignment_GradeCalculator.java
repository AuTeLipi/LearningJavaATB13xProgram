package Ex06_Ternary_Operator;

public class Lab_Assignment_GradeCalculator {
    public static void main(String[] args) {
        // Description: Marks 90 = A+, 75 = A, 60 = B, 40 = C, below 40 Fail.

        // input and out
        /*
        input - marks = int
        output - Grade - String
         */

        //Rough Logic
        /*
        Fail = below 40
        C = 40
        B = 41 - 60
        A = 61 - 75
        A+ = 76 - 90
        O = Above 95
         */

        int marks = 99;

        String Grade = (marks < 40) ? "Fail" : (marks <= 40) ? "C" : (marks <= 60) ? "B" : (marks <= 75) ? "A" : (marks <= 90) ? "A+": "O";
        System.out.println(Grade);

    }
}
