package com.us;

class ReturnTest {
	String name = "Rahul";

	void getname() {
		System.out.println("Name =" + name);
	}

	public static void main(String args[]) {
		ReturnTest rt = new ReturnTest();
		rt.getname();
	}
}