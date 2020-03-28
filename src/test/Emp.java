package com.sta_tic.test;

public class Emp {
	
	String name;
	static  String manager;
	
//	static {
//		manager = "abc";
//	}
	public Emp(String name) {
		this.name = name;
		manager = "def";
		System.out.println(manager);
	}
	
	public void show() {
		System.out.println(this.name);
		System.out.println(manager);
	}

}
