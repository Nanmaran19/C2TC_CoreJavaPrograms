package com.tnsif.assignment1;


class G1 {
    void show() {
        System.out.println("G1");
    }
}

class H1 extends G1{
    void show() {
        System.out.println("H1");
    }
}

public class Test_12 {

	public static void main(String[] args) {
		 H1 a = new H1();
	        a.show();
	}

}
