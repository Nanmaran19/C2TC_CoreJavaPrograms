package com.tnsif.assignment1;

class C1 {
	
}

class D1 extends C1 {
	
}

public class Test_7 {

	public static void main(String[] args) {
		C1 obj = new D1();   // change this
        C1 b = (C1) obj;
        System.out.println("Casting successful");
    }

}
