package com.us;
 class Test {
	public static void main(String args[]) {
		Bank hdfc = new Hdfc();
		hdfc.diposite();
		hdfc.withdrad();
		hdfc.calculateInterest();
		
		Bank icici = new Icici();
		icici.diposite();
		icici.withdrad();
		icici.calculateInterest();
	}
}
abstract class  Bank{
	void diposite() {
		System.out.println("diposite");
	}
	
	void  withdrad() {
		System.out.println("withdraw");
	}
	
	public abstract int calculateInterest();
}

 class Hdfc extends Bank{

	@Override
	public int calculateInterest() {
		System.out.println("rahul");
		return 0;
	}
	 
 }
 
 
 class Icici extends Bank{

	@Override
	public int calculateInterest() {
		System.out.println("debu");
		return 0;
	}
	 
 }