package Ex_31_Exceptions;

public class Lab233_Throw {
    public static void main(String[] args) {
        int value = Integer.parseInt(args[0]);

        // No try-catch here
        divide(value); // If value is 0, exception is thrown from here
    }

    static void divide(int a) {
        if (a == 0) {
            throw new ArithmeticException("Cannot divide by zero"); // manually throw
        }
        int result = 10 / a;
        System.out.println("Result: " + result);
    }
}