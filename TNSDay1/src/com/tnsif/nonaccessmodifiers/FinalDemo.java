package com.tnsif.nonaccessmodifiers;

final class FinalDemo {
    final int MAX = 100;

    final void display() {
        System.out.println("Show the value of MAX: " + MAX);
    }

    public static void main(String[] args) {
        FinalDemo fd = new FinalDemo();
        fd.display();

        // fd.MAX = 200; // ❌ Not allowed (final variable)
    }
}

// ❌ Cannot extend a final class
// class Child extends FinalDemo { }
