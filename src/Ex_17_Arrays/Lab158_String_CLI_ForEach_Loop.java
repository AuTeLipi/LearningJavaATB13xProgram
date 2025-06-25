package Ex_17_Arrays;

public class Lab158_String_CLI_ForEach_Loop {
    public static void main(String[] lipi) {
        // 10 lipi true

        for (int i = 0; i < lipi.length; i++) {
            System.out.println(lipi[i]);
        }

        System.out.println(" -- ");

        for(String arg:lipi){
            System.out.println(arg);
        }
    }
}
