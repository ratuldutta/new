package com.jld;

public class Dimond {
	public static void main(String args[]) {
		int n,i,j;
		n=10;
		for(i=1;i<2*n;i++) {
			for(j=1;j<=Math.abs(n-i);j++)
				System.out.print(" ");
			for(j=1;j<=n-Math.abs(n-i);j++)
			    if(j==n-Math.abs(n-i)||j==1||i==10);
			    	System.out.print("* ");
		}
	}
}
