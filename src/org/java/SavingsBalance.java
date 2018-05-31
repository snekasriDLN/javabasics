package org.java;

public class SavingsBalance {
	public static double annuaalInterestrate;
	double SavingsAccount;
	public SavingsBalance(double balance)
	{
		this.SavingsAccount = balance;
	}	
		public void MonthlyInterest(){
			double Monthlyinterest = (SavingsAccount*(annuaalInterestrate/100.0))/12;
			SavingsAccount = SavingsAccount + Monthlyinterest;
			System.out.println("The balance is "+SavingsAccount);
		}
		public static void modifyInterest(int newValue) {
			annuaalInterestrate = newValue;
		}
		public static void main(String args[])
		{
			SavingsBalance sa1 = new SavingsBalance(2000);
			SavingsBalance sa2 = new SavingsBalance(3000);
			SavingsBalance.modifyInterest(5);
			sa1.MonthlyInterest();
			sa2.MonthlyInterest();
			SavingsBalance.modifyInterest(4);
			sa1.MonthlyInterest();
			sa2.MonthlyInterest();
			
			
		
			
			
		}
		
}
		
	