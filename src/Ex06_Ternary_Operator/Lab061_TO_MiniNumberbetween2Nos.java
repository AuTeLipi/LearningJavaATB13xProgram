package Ex06_Ternary_Operator;

public class Lab061_TO_MiniNumberbetween2Nos {
    public static void main(String[] args) {
        // The min number between two numbers by using ternary operator.
        int x = 10;
        int y = 20;
//        System.out.println(Math.max(x,y));

        int min = x < y ? x : y;
        System.out.println(min);
    }
}
