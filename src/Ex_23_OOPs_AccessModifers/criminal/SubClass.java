package Ex_23_OOPs_AccessModifers.criminal;

import Ex_23_OOPs_AccessModifers.police.Cop;

public class SubClass extends Cop {
    public SubClass(int bullet) {
        super(bullet); // Call to Cop constructor
    }

    public static void main(String[] args) {
        // SubClass sc = new SubClass(10);
        // sc.thisisDefaultF1(); // This will work only if method is public or in the same package
        // sc.canIShoot();       // This will work only if method is public or protected (with subclass access)
    }
}