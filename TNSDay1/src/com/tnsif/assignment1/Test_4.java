package com.tnsif.assignment1;

class A2 {
    int x = 10;
}

class B2 extends A2 {
    int x = 20;

    public String toString() {
        //System.out.println(x);  
        return "x"+x;
    }
	public static void main(String[] args) {
		B2 b = new B2();
		System.out.println(b.toString());
	
	}

}
