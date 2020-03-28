package com.us;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student /* implements Comparable<Student> */{
	
	int rollNo;
	String name;
	Student(int rollNo, String name){
		this.rollNo = rollNo;
		this.name = name;
	}
	/*
	 * @Override public int compareTo(Student obj) { if(rollNo == obj.rollNo) {
	 * return 0; }else if(rollNo > obj.rollNo) { return 1; }else
	 * 
	 * return -1; }
	 */
	
}


class MyNameComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
	
		return o1.name.compareTo(o2.name);
	}
	
}


public class TestComparable {
	public static void main(String args[]) {
		ArrayList<Student> al= new ArrayList<Student>();
		al.add(new Student(100, "ARNAB"));
		al.add(new Student(101, "RAHUL"));
		al.add(new Student(111, "DEBU"));
		Collections.sort(al,new MyNameComparator());
		for(Student s : al) {
			System.out.println("name: " + s.name + " " +"roll: " + s.rollNo);
		}
		
	}

}
