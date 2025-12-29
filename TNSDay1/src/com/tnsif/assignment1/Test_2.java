package com.tnsif.assignment1;

// Parent class
class A1 {
    A1() {
        System.out.println("A Constructor");
    }
}

// Child class
class B1 extends A1 {
    B1() {
        System.out.println("B Constructor");
    }
}

// Main class
public class Test_2 {
    public static void main(String[] args) {
        B1 b = new B1(); // b
    }
}
