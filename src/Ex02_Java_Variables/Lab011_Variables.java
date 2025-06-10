package Ex02_Java_Variables;

public class Lab011_Variables {
    public static void main(String[] args) {
        byte a = 10;
        System.out.println("byte a = " + a);

        printIntValue();
        printFloatValue();
        printDoubleValue();
        printStringValue();
        printBooleanValue();
        printCharValue();
        // Overload main method
    }

    public static void printIntValue() {
        int b = 154;
        System.out.println("int b = " + b);
    }

    public static void printFloatValue() {
        float c = 1762786F;
        System.out.println("float c = " + c);
    }

    public static void printDoubleValue() {
        double d = 98765.4321;
        System.out.println("double d = " + d);
    }

    public static void printStringValue() {
        String e = "Hello World!";
        System.out.println("String e = " + e);
    }

    public static void printBooleanValue() {
        boolean f = false;
        System.out.println("boolean f = " + f);
    }

    public static void printCharValue() {
        char g = 'Y';
        System.out.println("char g = " + g);
    }
}
