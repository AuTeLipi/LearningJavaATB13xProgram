package Ex_15_Strings;

public class Lab136_String_Creation {
    public static void main(String[] args) {
        // String 2 ways
        String s1 = "Lipi"; // stored in SCP
        String s2 = new String("Lipi"); // stored in OA -> Object Area
        // 2 strings s1 & s2 will be created in different places
        System.out.println(s1);
        System.out.println(s2);
    }
}
