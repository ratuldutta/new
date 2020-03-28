package com.jld;

class MathOperation 
{
	static float mul(float x, float y) 
	{
		return x * y;
	}
	static float div(float x, float y) 
	{
		return x / y;
	}
}
class MathApplication
{
	public static void main(String args[])
	{
		float a = MathOperation.mul(4.0f, 5.0f);
		float b= MathOperation.div(a,2.0f);	
		System.out.println("The Math calculation is ="+b);
	}
}
