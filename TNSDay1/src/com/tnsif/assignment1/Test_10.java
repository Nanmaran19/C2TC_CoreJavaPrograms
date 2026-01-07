package com.tnsif.assignment1;


class E1 {
    E1(int x) {
        System.out.println("E1: " + x);
    }
}

class F1 extends E1 {
    F1() {
        super(10);   
    }
}

