package loopandarray;

import java.util.Scanner;

public class FindGreatestnumArray {
	public void findgreatest (int[] numArray)
	{
		int greatest = numArray[0];
		for(int i=1; i<6; i++)
		{
			if(greatest<numArray[i])
			{
				greatest=numArray[i];
			}
		}
		
		System.out.println(greatest);
		
	}
	
	public static void main(String[] args) {
		FindGreatestnumArray ob = new FindGreatestnumArray();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the input");
		int[] numArray = new int[6];
		
		 
		for(int i=0 ; i<6 ; i++)
		{
			numArray[i] = sc.nextInt();
		}
		ob.findgreatest(numArray);
	}

}
