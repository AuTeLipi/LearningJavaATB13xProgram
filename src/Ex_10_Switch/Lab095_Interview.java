package Ex_10_Switch;

public class Lab095_Interview {
    public static void main(String[] args) {
        int a = 11;
        switch (-1){
            default:
                System.out.println("Default");
                break;
            case -1:
                System.out.println("10");
                break;
            case 11:
                System.out.println("9");
                break;

                /*
                The switch is evaluating the expression -1 — not the value of a.
                So, a = 11 is declared but not used in the switch at all.
                 */
        }
    }
}
