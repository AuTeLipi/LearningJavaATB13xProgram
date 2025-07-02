package Tasks_Basic_If_Else_Loop_Programs.Task_02nd_July;

public class Animal_Sound_Simulator {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.meow();
        c1.makeSound();
    }
}

class Animal {
    void makeSound(){
        System.out.println("Parent Animal");
    }
}

class Cat extends Animal{
    void meow() {
        System.out.println("Child");
    }
}