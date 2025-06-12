package Ex05_Type_Casting;

public class Lab_Assignment_Divide_intTodecimal {
    public static void main(String[] args) {
        // Description: int a = 10, int b = 3; now divide 10/3 and store the decimal value in the Result variable and print it.
        int a = 10;
        int b = 3;

        float c = (a/b); // implicit widening
        float d = (float)c; // explicit widening

        System.out.println(c);
        System.out.println(d);
    }
}
