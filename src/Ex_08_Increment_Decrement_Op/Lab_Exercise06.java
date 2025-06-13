package Ex_08_Increment_Decrement_Op;

public class Lab_Exercise06 {
    public static void main(String[] args) {
        int x = 5;
        int y = x++ + ++x + x++ + ++x;
        System.out.println("x = " + x + ", y = " + y);

        // x = 9
        // y = 5 + 7 + 7 + 9 = 28
    }
}
