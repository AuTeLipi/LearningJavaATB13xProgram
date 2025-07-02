package Tasks_Basic_If_Else_Loop_Programs.Task_02nd_July;

public class Vehicle_Constructor_Chain {
    public static void main(String[] args) {
        Bike b1 = new Bike();

    }
}

class Vehicle {
    Vehicle(){
        System.out.println("Vehicle is ready");
    }
}

class Bike extends Vehicle {

    Bike() {
        System.out.println("Bike is ready");
    }
}