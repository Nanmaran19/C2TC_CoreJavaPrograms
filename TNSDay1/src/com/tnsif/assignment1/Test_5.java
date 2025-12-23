package com.tnsif.assignment1;

class A3 {
    void display() {
        System.out.println("A display");
    }
}

class B3 extends A3 {
    void show() {
        System.out.println("B display");
    }

    public static void main(String[] args) {
        B3 obj = new B3();
        obj.display(); // Calls parent method
        obj.show();    // Calls child method
    }
}
