package com.tnsif.nonaccessmodifiers;

final class FinalDemo {
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7a77f47a8cae6e4df3ddfb91aaab62c262b83b63
>>>>>>> db87cc2684d0ee1cf4075436083f4b39c28b3fa2
>>>>>>> 90225bc4a2f6c218b6589e23aab6ade8f04445f8
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
<<<<<<< HEAD
=======
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
>>>>>>> db87cc2684d0ee1cf4075436083f4b39c28b3fa2
>>>>>>> 90225bc4a2f6c218b6589e23aab6ade8f04445f8
