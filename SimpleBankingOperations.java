package miniproject;

import java.util.Scanner;

public class SimpleBankingOperations 
{
	int balance=10000;
	void operations()
	{
		while(true)
		{
			int withdraw,deposit;
			Scanner sc=new Scanner (System.in);
			System.out.println("SBI BANK");
			System.out.println("choice 1 : withdraw");
			System.out.println("choice 2 : deposit");
			System.out.println("choice 3 : check balance");
			System.out.println("choice 1 : Exit");
			System.out.println("choose operation you want to perform:");
			int a=sc.nextInt();
			switch(a)
			{
			case 1:
				System.out.println("Enter the money to be withdrawn");
				withdraw=sc.nextInt();
				if(balance>=withdraw)
				{
					balance=balance-withdraw;
					System.out.println("withdraw successful");
					System.out.println("Your Balance is: "+balance);
				}
				else
				{
					System.out.println("You have insufficient balance");
				}
				break;
			case 2:
				System.out.println("enter the amount to deposit");
				deposit=sc.nextInt();
				System.out.println("Your money is successfully deposited");
				balance=balance+deposit;
				System.out.println("Your Balance is: "+balance);
				break;
				
			case 3:
				System.out.println("Your balance is: "+balance);
				System.out.println(" ");
				break;
			case 4:
				System.exit(0);
				break;
			case 5:
				System.out.println("Invalid");
			
				
			
				
			
			}
		}
	}

	public static void main(String[] args) 
	{
		
		SimpleBankingOperations SBI=new SimpleBankingOperations();
		SBI.operations();
		

	}

}
