package com.us;

class Tree {
	final int x = 6;

	void update() {
		int x = 7;
	}

	void display() {

	}
}

class BananaTree {
	int x;
	int y;

	void display() {
		System.out.println("Rahul");
	}
}

class InherTest {
	public static void main(String args[]) {
		BananaTree bn = new BananaTree();
		bn.display();
	}
}
