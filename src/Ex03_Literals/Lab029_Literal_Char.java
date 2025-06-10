package Ex03_Literals;

public class Lab029_Literal_Char {
    public static void main(String[] args) {
        char c1 = 'A'; // A to Z, a-z, !@#$%^&*()_+
        char c2 = 'B';
        char c3 = '@';
        char c4 = '_';
        char c5 = '9';
        char c6 = '1';
        char c7 = '(';

        // Escape Char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("LipiDubbaka");
        System.out.println("Lipi"+new_line+"Dubbaka");
        System.out.println("Lipi"+tab_line+"Dubbaka");
        System.out.println("Lipi"+back_space+"Dubbaka");
        System.out.println("Lipi is old"+carriage_return+"Dubbaka");

        System.out.println("Hi, This is a First line"+new_line+"This is second line\nThis is Third line");

        char c10 = 'A';
        //  // ASCII, (limited numbers) - A -> 65

        char c11  = '\u1F60';
        char my_laugh_smily = '\u1f60'; // :)
        System.out.println(my_laugh_smily);
    }
}
