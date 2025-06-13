package Ex_09_If_Condition;

public class Lab081_If_Else_Input_CLI {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);

        if(age <= 18){
            System.out.println("Minor!!! I am can't go to Goa!!!");
        }
        else {
            System.out.println("Adult!!! I am can go to Goa!!!");
        }
    }
}
