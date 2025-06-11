package Ex02_Java_Variables;

public class Lab024_Example_01 {
    //
//    int i;
//    static int s;
//

    public static void main(String[] args) {
        int a = 10;
        {
            int b = 10;
            System.out.println(b);
        }
        int b = 90;
        System.out.println(b);
    }
}

