package Ex06_Ternary_Operator;

public class Lab062_TO_MaxNumberbetween2Nos {
    public static void main(String[] args) {
        // The maximum number between two numbers by using ternary operator.
        int x = 10;
        int y = 20;
//        System.out.println(Math.max(x,y));

        int max = x > y ? x : y;
        System.out.println(max);

    }
}
