package Ex02_Java_Variables;

public class Lab023_Local_Variables {
    public static void main(String[] args) {
        int a = 10;
        byte b = 10;
        short s = 10;
        long l = 9876543210L;
        float f = 3.14F;
        double d = 67.8987654567;
        boolean b1 = true;
        char c = 'A';

        int local;
//        System.out.println(local); -> this dont work. For local variables default value is not set. we have to give value compulsary.
        System.out.println("int a = " + a);
        System.out.println("byte b = " + b);
        System.out.println("short s = " + s);
        System.out.println("long l = " + l);
        System.out.println("float f = " + f);
        System.out.println("double d = " + d);
        System.out.println("boolean b1 = " + b1);
        System.out.println("char c = " + c);
    }
}
