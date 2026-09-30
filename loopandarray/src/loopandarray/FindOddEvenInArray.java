package loopandarray;

import java.util.Scanner;

public class FindOddEvenInArray {
	
	public void findoddeven (int[] numArray)
	{
		for(int x=0 ; x<5 ; x++)
		{
			int remainder = numArray[x]%2;
			if(remainder==0)
			{
				System.out.println(numArray[x] + "It is even");
			}
			else 
			{
				System.out.println(numArray[x] +"It is odd");
			}
			
		}
		
		
	}
	
	
	public static void main(String[] args) {
		FindOddEvenInArray ob = new FindOddEvenInArray();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the input ");
		int[] numArray = new int[5];
		
		for(int x=0 ; x<5 ; x++)
		{
			numArray[x] = sc.nextInt();		
		}
		ob.findoddeven(numArray);
	}

}
