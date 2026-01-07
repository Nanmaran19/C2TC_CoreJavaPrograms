package com.tnsif.oops.inheritance;

class A { // Super/Parent
	void display(){
		System.out.println("Hello World");
	}
}
class B extends A { // Child/Subclass	
}
class C extends A {	
}
public class InheritanceDemo {
	public static void main(String[] args) {
		B obj = new B();
		obj.display();
	}
}
