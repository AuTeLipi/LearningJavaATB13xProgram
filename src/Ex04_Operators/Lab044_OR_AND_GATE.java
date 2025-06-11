package Ex04_Operators;

public class Lab044_OR_AND_GATE {
    public static void main(String[] args) {

        // || - OR gate

        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);
        System.out.println();
        // T || T -> T
        // T || F -> T
        // F || T -> T
        // F || F -> F


        //  && - AND gate

        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        // T && T -> T
        // T && F -> F
        // F && T -> F
        // F && F -> F
    }
}
