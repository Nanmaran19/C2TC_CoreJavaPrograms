package com.tnsif.nonaccessmodifiers;

final class FinalDemo {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7a77f47a8cae6e4df3ddfb91aaab62c262b83b63
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
<<<<<<< HEAD
=======
=======
	final int Var = 100; 
	final void display() {
		System.out.println("Show the value of max:" + Max);
	}
	public static void main(String[] args) {
		FinalDemo fd = new FinalDemo();
		fd.display();
		fd.Var = 100;
	}
}
// Cannot extend the Final Class
class Child extends FinalDemo {
	void display() {
		System.out.println("Show the Value of Max:" + Max);
	}
}
>>>>>>> 7946c9469519423807ab0890c417622344a267cf
>>>>>>> 7a77f47a8cae6e4df3ddfb91aaab62c262b83b63
