package Ex_15_Strings;

public class Lab140_Interview_P1 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s4 = "Hello";
        String s10 = "Hello";
        // s1, s4, s10 values are same so stored a 1 place only i.e., SCP

        String s2 = new String("Hello");
        String s3 = new String("Hello");
        String s5 = new String("hello");
        // s2, s3, s5 values stored individually as new keyword is used

        // SCP | OA
        // 1 | 3 -> 4

        System.out.println(s1 + s5);
    }
}
