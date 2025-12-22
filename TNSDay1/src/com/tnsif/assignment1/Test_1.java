package com.tnsif.assignment1;

class A {
    void show() {
        System.out.println("A");
    }
}

class B extends A {
    void show() {
        System.out.println("B");
    }
}

public class Test_1 {

	public static void main(String[] args) {
		
		 A obj = new B();   
	        obj.show();
	}

}
