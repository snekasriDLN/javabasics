package org.java;

public class Car {

	public static void main(String[] args) {
		Car car = null;
		//Car car=new Car();
	    //System.out.println(car);
	    if(car == null) {
	    	System.out.println("NULL");
	    	
	    	car= new Car();
	    } else {
	    	System.out.println("NOT NULL");
	    }
	    
	    if(car == null) {
	    	System.out.println("NULL");
	    	
	    	car= new Car();
	    } else {
	    	System.out.println("NOT NULL");
	    }
	}
}
