package com.us;

 class Rahul {
	void run(){System.out.println("running");}

}
class Debu extends Rahul{
	void run(){System.out.println("Rahul...........");}
	public static void main(String args[]) {
	 Rahul r = new Debu();
		r.run();
	}
}
