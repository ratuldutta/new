package com.jld;

class Rectangle {
	int length;
	int breadth;

	void getData(int x, int y) {
		length = x;
		breadth = y;
	}

	int rectArea() {
		int area;
		area = length * breadth;
		return (area);
		
	}
}

class RectArea {
	public static void main(String args[]) {
		Rectangle rect1 = new Rectangle();
		Rectangle rect2 = new Rectangle();
		rect1.length = 20;
		rect1.breadth = 15;
		int area1 = rect1.length * rect1.breadth;
		rect2.getData(15, 15);
		int area2 = rect2.rectArea();
		System.out.println("Area1=" + area1);
		System.out.println("Area2=" + area2);
	}
}
