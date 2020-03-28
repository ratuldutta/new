package com.us;



class C extends A{
	public static void main(String args[]) {
		C obj = new C();
		obj.msg();
	}
}

class A {
	void msg() {
		System.out.println("Hello");
	}
}

