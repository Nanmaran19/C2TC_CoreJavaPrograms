package com.tnsif.assignment1;

class C2 {
    void show(int a) {
        System.out.println("C2 show: " + a);
    }
}

class D2 extends C2 {
    @Override
    void show(int a) {
        System.out.println("D2 show: " + a);
    }
}

public class Test_8 {
    public static void main(String[] args) {
        C2 obj = new D2();   // Upcasting
        obj.show(10);       // Correct method call
    }
}
