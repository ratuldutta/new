package com.sta_tic.test;

public class MainClass {

	public static void main(String[] args) {
		Emp e1 = new Emp("Arnab");
		Emp.manager = "xyz";
		Emp e2 = new Emp("Joy");
		Emp.manager = "xyz";
		e1.show();
		e2.show();
	}
}
