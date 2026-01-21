package com.tnsif.interfacedemo;

public class FunctionalDemo {

	public static void main(String[] args) {
		//Lambda Expression
		Interface1 nm = () -> 
		System.out.println("Hello Everyone, I'm Nanmaran");	
		nm.greet();
	}
}
