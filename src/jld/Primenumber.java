package com.jld;

class Primenumber {
	public static void main(String args[]) {
		int i, n = 7, count = 0;
		for (i = 1; i < n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count > 2) {
			System.out.println("Not prime");
		}

		else {
			System.out.println("Prime");
		}
	}
}
