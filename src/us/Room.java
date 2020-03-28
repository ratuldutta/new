 package com.us;

 class KichenRoom
 {
 int length;
 int breadth;
 KichenRoom (int x,int y)
 {
  length=x;
  breadth=y;
  }
 int area()
 {
  return (length * breadth);
  }
  }
 class BedRoom extends KichenRoom
 
 {
 int height;
 BedRoom (int x,int y,int z)
 {
 super (x ,y);
 height =z;
 }
 int volume()
 {
 return (length * breadth * height);
 }
 }
 class Room
 {
 public static void main(String args[])
 {
 BedRoom room1 = new BedRoom(14,12,10);
 int area1 = room1.area();
 int volume1 = room1.volume();
 System.out.println("Area1 = "+area1);
 System.out.println("volume1 ="+volume1);
 }
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 