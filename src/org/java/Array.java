package org.java;

public class Array {
	public static void main(String args[]) {
		int N=78945;
		int t = N;
		int arry[] =new int[10];
		int i=0;
		while(t > 0)
		{ 
			int remainder = t % 10;
			arry[i] = remainder;
			i++;
			t = t / 10;
		}
			for(i=0; i < 10; i++) {
			System.out.println(arry[i]);
		
			}
		
		
		
	}

}
