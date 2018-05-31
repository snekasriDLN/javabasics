package org.java;

import sun.security.util.Length;

public class Rectangle {
 double length;
 double breath;
 
 
 public double getLength() {
	return length;
}
public void setLength(double length) {
	this.length = length;
}
public double getBreath() {
	return breath;
}
public void setBreath(double breath) {
	this.breath = breath;
}
public Rectangle()
 {
	length = 10;
	breath = 20;
	}
 public Rectangle(double length,double breath) {
	 if(length >0.0 && length <20.0 && breath >0.0 && breath <20.0) {
	 this.length=length;
	 this.breath=breath;
 }else {
	 System.out.println("length and breath should within 20");
 }
 }
 public double findAreaofRectangle() {
	 return length * breath;
 }
 public static void main(String args[])
 {
	 Rectangle r1 = new Rectangle(1.2,5.2);
	 Rectangle r2 = new Rectangle(51.5,3.3);
	 System.out.println(r1.findAreaofRectangle());
	 System.out.println(r2.findAreaofRectangle());
	 Rectangle r3 = new Rectangle();
	 System.out.println(r3.getLength());
	 System.out.println(r3.getBreath());
 }
 
	 
 }


