package com.tnsif.exceptionhandling;

public class NestedTryBlockDemo {

	public static int divide(int x, int y) {
		int z = 0;
		z = x / y;
		System.out.println("Result of division is z: " + z);
		return z;
	}

	public static void main(String[] args) {
<<<<<<< HEAD
		int x, y, z;
=======
		int x, y,z;
>>>>>>> 90225bc4a2f6c218b6589e23aab6ade8f04445f8
		try {
			x = Integer.parseInt(args[0]); // command line args
			y = Integer.parseInt(args[1]);
			try {
				z=divide(x, y);
			} catch (ArithmeticException ae) {
				System.err.println("Error! A number cannot be divided by 0");
			}
		} catch (NumberFormatException e) {
			System.err.println("Error! Invalid input, number must be an integer.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Error! please pass numbers ");
		}
		System.out.println("I am out of outer catch block");
	}
}
