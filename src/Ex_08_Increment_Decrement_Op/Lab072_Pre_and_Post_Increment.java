package Ex_08_Increment_Decrement_Op;


public class Lab072_Pre_and_Post_Increment {
    public static void main(String[] args) {
        //  PRE increment  = Increase first and then prints
        System.out.println("Pre - Increment:");
        int a = 10;
        System.out.println(++a);
        System.out.println(a);

        System.out.println();

        System.out.println("Post - Increment:");
        //  POST increment  = Print first and then increase
        int a_post = 10;
        System.out.println(a_post++);
        System.out.println(a_post);
    }
}
