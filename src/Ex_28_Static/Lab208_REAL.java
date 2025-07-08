package Ex_28_Static;

public class Lab208_REAL {

    public static void main(String[] args) {

        ATB a1 = new ATB();               // Triggers IIB (and class is loaded if not already)
        ATB.doAssignment();               //  Static method called with class name
        ATB.joinZoomForClass();           //  Static method called with class name
        a1.howTheyAssignment();           //  Instance method — fixed! called with object


    }
}

class ATB{

    static {
        System.out.println("Load the class?, I will execute");
    }
    {
        System.out.println("IIB - this is called when Object is created!");
        // What is the purpose? -
        // Here you can write code related to
        // start a website or anything before starting the
        // web automation or api automation
        //
    }


    private String name; // non static

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String phone;

    static String courseName = "ATB13x";
    static String mentorName = "Pramod";

    static void doAssignment(){
        //System.out.println(phone); // Staic method can't access the non static variables
        System.out.println("Do Assignment");
    }

    static void joinZoomForClass(){
        System.out.println("Class Joined!");
    }

    void howTheyAssignment(){
        System.out.println("It is different!");
    }

}

