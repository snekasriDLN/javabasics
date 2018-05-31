package org.java;

public class Details {
	public static void main(String args[])
	{
		Employee e1 = new Employee();
		e1.setFirstname("sneks");
		e1.setLastname("devarajan");
        e1.setSalary(1000000);
        Employee e2 = new Employee();
        e2.setFirstname("latha");
        e2.setLastname("devarajan");
        e2.setSalary(5000000);
        System.out.println(e1.getFirstname());
        System.out.println(e1.getLastname());
        double salary = e1.getSalary();
        salary = salary+100;
        System.out.println(e1.getSalary());
        System.out.println(e2.getFirstname());
        System.out.println(e2.getLastname());
        System.out.println(e2.getSalary());
        System.out.println(e1.getSalary());
	}

}
