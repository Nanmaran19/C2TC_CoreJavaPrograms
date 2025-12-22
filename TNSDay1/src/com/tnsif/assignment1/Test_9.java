package com.tnsif.assignment1;

class C3 {
    final void show() {
        System.out.println("C3 show method");
    }
}

class D3 extends C3 {
    // ❌ Cannot override show() because it is final
    // void show() { }
}

public class Test_9 {
    public static void main(String[] args) {
        C3 obj = new D3();  // Upcasting
        obj.show();
    }
}
