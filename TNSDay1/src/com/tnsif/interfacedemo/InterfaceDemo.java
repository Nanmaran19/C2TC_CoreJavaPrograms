package com.tnsif.interfacedemo;

interface InterDemo{
	void name();
	void greeting();
}

public class InterfaceDemo implements InterDemo{ 
	
	@Override
	public void name(){
		System.out.println("Nanmaran");
	}
	
	public void greeting() {
		System.out.println("Hi");
	}
	
	public static void main(String[] args) {
		InterDemo obj = new InterfaceDemo();
		obj.name();
		obj.greeting();
	}
} 
