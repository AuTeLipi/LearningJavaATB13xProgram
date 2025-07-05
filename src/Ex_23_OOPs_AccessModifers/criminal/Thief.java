package Ex_23_OOPs_AccessModifers.criminal;

import Ex_23_OOPs_AccessModifers.police.Cop;

public class Thief {
    public static void main(String[] args) {
        Cop thief = new Cop(100);
        thief.gun = 100;
//        thief.canIShoot();
        // thief.thisDefaultF1();
    }
}
