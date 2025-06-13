package Ex_08_Increment_Decrement_Op;

public class Lab_Exercise03 {
    public static void main(String[] args) {
        int x = 5;
        System.out.println(x++ + ++x);

        // a = x++ | Exp = 5 | x = 6
        // +
        // b = ++x | Exp = 6 | x = 7
        // a + b = (x++ + ++x) = 5 + 7 = 12
    }
}
