package Ex_31_Exceptions;

public class Lab219_String_NullPointer {
    public static void main(String[] args) {

        String name= null; // java.lang.NullPointerException
        name.trim();

        /* The trim() method in Java removes leading and trailing whitespace
        String name1= " Lipi Goud "; // java.lang.NullPointerException
        String b = name1.trim();
        System.out.println(b);
         */
    }
}
