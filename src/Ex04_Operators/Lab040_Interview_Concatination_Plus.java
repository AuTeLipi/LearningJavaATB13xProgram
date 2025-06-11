package Ex04_Operators;

public class Lab040_Interview_Concatination_Plus {
    public static void main(String[] args) {
        String first_name = "Pramod";
        String last_name = "Dutta";

        int a = 10;
        int b = 10;

        System.out.println(first_name + last_name + a + b);
        // 1st "+" operater is recoginsed as adding string similarly done for a + b

        System.out.println(a + b + first_name + last_name);

        System.out.println(first_name + last_name + (a + b));

        // BODMAS - Bracket of Div, mul, add, sub
    }
}
