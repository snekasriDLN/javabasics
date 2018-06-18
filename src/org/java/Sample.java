package org.java;

public class Sample {
	public boolean ismultiple(int one,int two)
{
	return two % one == 0 ? true : false;
}
public boolean isEven(int one) {
	return one % 2 == 0 ? true : false;
}
public double celsius(int farenheit,double celsius) {
	celsius = 5.0/9.0 * (farenheit -32);
	return celsius;
}
public double farenheit(double celsius) {
	double farenheit = 9.0 / 5.0 *(celsius + 32);
	return farenheit;

}
public boolean inPerfect(int number) {
	int sum = 0;
	for(int i=1; i<=number/2 ; i++) {
		sum = sum +((number % i == 0) ? i : 0);
	}
		return(number == sum) ? true : false;
		}
public int reverse (int numeric)
	{
	int value =0,i;
	while(numeric!=0) {
		i=numeric%10;
		value=(value*10)+i;
		numeric=numeric/10;
	}
	return value;
	}
public static void main(String args[]) {
	Sample p =new Sample();
	System.out.println("The given boolean is" +p.ismultiple(5,6));
	System.out.println("The given boolean is" +p.isEven(9));
	System.out.println("The given boolean is" +p.inPerfect(4));
	System.out.println("The reverse of number is" +p.reverse(1234));
	System.out.println("The celsius is" +p.celsius(35,45.0));
	System.out.println("The farenheit is" +p.farenheit(65));
}
}
