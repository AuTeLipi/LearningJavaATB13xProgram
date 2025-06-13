package Ex_08_Increment_Decrement_Op;

public class Lab073_Inc_Dec {
    public static void main(String[] args) {
        int a = 10;
        int result = ++a;
        System.out.println(a);
        System.out.println(result);

        // Line No. |  a | Exp
        //  5 |  10 | NA
        //  6 |  11 | 11
        //  7 |  11 | NA
        //  8 | NA | 11
    }
}
