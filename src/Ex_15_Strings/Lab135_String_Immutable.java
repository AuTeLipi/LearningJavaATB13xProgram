package Ex_15_Strings;

public class Lab135_String_Immutable {
    public static void main(String[] args) {
        String name = "Lipi"; // String Constant Pool (SCP)
//        name.toUpperCase();
        name = name.toUpperCase(); // LIPI
        System.out.println(name);
    }
}
