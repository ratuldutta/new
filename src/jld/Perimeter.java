package com.jld;

class PerimeterArea {

	int length;
	int width;

	PerimeterArea() {
		length = 0;
		width = 0;
	}

	PerimeterArea(int x, int y) {
		length = x;
		width = y;
	}

	void cal_perimeter() {
		int peri = 2 * (length + width);
		System.out.println("The perimeter of the rectangle is:" + peri);
	}
}

class Perimeter {
	public static void main(String args[]) {
		PerimeterArea p1 = new PerimeterArea();
		PerimeterArea p2 = new PerimeterArea(20, 15);
		p1.cal_perimeter();
		p2.cal_perimeter();
	}
}

