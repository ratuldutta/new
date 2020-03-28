package com.jld;

class Palindrome {
	public static void main(String args[]) {
		int r, n = 454, sum = 0, original = n;
		while (n > 0) {
			r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;
		}
		if (original == sum) {
			System.out.println("palindrome");
		}

		else {
			System.out.println("not palindrome");
		}
	}
}
