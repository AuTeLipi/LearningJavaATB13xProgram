package Ex05_Type_Casting;

public class Lab057_TypeCasting {
    public static void main(String[] args) {
        long phone = 9876543210l;
//        short s = phone; // Implicit Narrow not allowed
        short s1 = (short)phone; // Explicit Narrow?
        System.out.println(phone);
    }
}
