package Ex_08_Increment_Decrement_Op;

public class Lab_Exercise02 {
    public static void main(String[] args) {
        int i = 1;
        i = i++ + ++i;
        System.out.println(i);

        // a = i++ | Exp = 1 | i = 2
        // +
        // b = ++i | Exp = 3 | i = 3
        // a + b = (i++ + ++i) = 1 + 3 = 4
    }
}
