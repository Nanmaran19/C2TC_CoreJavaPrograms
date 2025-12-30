package com.tnsif.exceptionhandling;

import java.util.Scanner;
import java.util.InputMismatchException;

public class FinallyBlock {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Enter the number : ");
			int number = scanner.nextInt();
			System.out.println(number % 2 == 0 ? number + " is Even" : number + " is Odd");
			return;
		} catch (InputMismatchException e) {
			System.err.println("Invalid input...");
		} finally {
			System.out.println("In Finally....");
			scanner.close();
		}
	}

}
