package ex_13_Functions;

public class Lab130_Simple_Method {

    static void pramod_f1() {
        System.out.println("No Return");
    }

    static int return_int() {
        System.out.println("This is a normal function which returns something.");
        System.out.println("This is a normal function which returns something.");
        System.out.println("This is a normal function which returns something.");
        return 10;
    }

    static boolean return_boolean() {
        return true;
    }

    static float return_float_pi_value() {
        return 3.14f;
    }

    static long return_long() {
        return 10L;
    }

    static String return_String() {
        return "Pramod";
    }

    public static void main(String[] args) {
        // Call all functions here
        pramod_f1();

        int intValue = return_int();
        System.out.println("Returned int: " + intValue);

        boolean boolValue = return_boolean();
        System.out.println("Returned boolean: " + boolValue);

        float floatValue = return_float_pi_value();
        System.out.println("Returned float: " + floatValue);

        long longValue = return_long();
        System.out.println("Returned long: " + longValue);

        String stringValue = return_String();
        System.out.println("Returned String: " + stringValue);
    }
}
