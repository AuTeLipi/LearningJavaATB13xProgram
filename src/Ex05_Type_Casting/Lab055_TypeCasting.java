package Ex05_Type_Casting;

public class Lab055_TypeCasting {
    public static void main(String[] args) {
        byte b = 10;
        int a = b; //  Widening -> Implicit Casting
        int a1 = (int)b; // Widening -> Explicit Casting
        System.out.println(a1);
    }
}
