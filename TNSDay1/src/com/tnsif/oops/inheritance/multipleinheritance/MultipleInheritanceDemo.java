package com.tnsif.oops.inheritance.multipleinheritance;
// two interface Class

interface Inter1{
	void nm();
}
interface Inter2{
	void mn();
}
// Implement the above 2 interface to another class
class Face implements Inter1,Inter2{
	
	@Override
	public void nm() {
		System.out.println("Nanmaran");
	}
	
	@Override
	public void mn() {
		System.out.println("IT Student");
	}
}

public class MultipleInheritanceDemo {

	public static void main(String[] args) {
		Face obj = new Face();
		obj.nm();
		obj.mn();
	}
}
