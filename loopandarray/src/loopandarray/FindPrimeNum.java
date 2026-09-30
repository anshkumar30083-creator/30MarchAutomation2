package loopandarray;

import java.util.Scanner;

public class FindPrimeNum {
	
	public void findprime(int num)
	{
		if(num==0 || num==1)
		{
			System.out.println("It is not prime number");
		}
		else
		{
		boolean  flag = false ;
		for(int i=2 ; i<num ; i++)
		{
			int remainder = num%i;
			if(remainder==0)
			{
				flag = true ;
				break;
			}
			
		}
		if(flag==false)
		{
			System.out.println("It is prime number");
		}
		else
		{
			System.out.println("It is not prime number");
		}
		}
		
	}
	
	public static void main(String[] args) {
		FindPrimeNum ob = new FindPrimeNum ();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the input");
		int num = sc.nextInt();
		ob.findprime(num);
	}

}
