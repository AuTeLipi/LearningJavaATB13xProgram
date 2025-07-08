package Ex_27_Instance_Initialization_Block;

public class Lab203_IIB {
    // ```
    //Instance initialization Block == IIB
    //I will be executed when object is created.
    //```

    public static void main(String[] args) {

        // Here 2 objects are created. So, IIB will be executed times
        A a1 = new A();
        A a2 = new A();

    }

}

class A{

    // Default Constructor
    A(){
        System.out.println("DC");
    }

    // IIB - 1
    {
        System.out.println("Hi, I am IIB");
        System.out.println("If you want to execute or call something when object is created");
        // mysql connection
        // read a csv, xlsx file
        // read json, xml.
        // read a text file or env file

    }

    // IIB - 2
    {
        System.out.println("Hi, I am IIB 2");
    }

    // IIB - 3
    {
        System.out.println("Hi, I am IIB 3");
    }

    // Static function - The 1st function to be executed / read by JVM is static (class A Loaded 1 time)
    static {
        System.out.println("Static");
    }

}
