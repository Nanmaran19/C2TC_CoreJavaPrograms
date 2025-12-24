package com.tnsif.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchDemo {
	public static void main(String[] args) {
		System.out.println("I am in main method");
		int numberOne, numberTwo, numberThree;
		Scanner scanner = new Scanner(System.in);

		while (true) {
			try {
				System.out.println("Enter First number: ");
				numberOne = scanner.nextInt();
				System.out.println("Enter Second number: ");
				numberTwo = scanner.nextInt();
				numberThree = numberOne / numberTwo;
				System.out.println("Division is " + numberThree);
				//break;
			} catch (InputMismatchException e) {
				// e.printStackTrace();
				System.out.println("Invalid input. Please enter integers only.");
				scanner.nextLine();
			} catch (ArithmeticException e) {
				System.out.println("Exception caught: " + e.getMessage());
				// break;
			} catch (Exception e) {
				System.out.println("Exception caught: " + e.getMessage());
				// break;
			}
		}
	}
}