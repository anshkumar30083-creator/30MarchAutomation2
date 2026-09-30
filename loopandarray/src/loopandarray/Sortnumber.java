package loopandarray;

import java.util.Arrays;
import java.util.Scanner;

public class Sortnumber {
	
	public void sortint (int [] numArray ,int nth)
	{
		for(int i=0 ; i<numArray.length ; i++)
		{
			for(int j=i+1; j<numArray.length; j++)
			{
				if(numArray[i]<numArray[j])
				{
					int abc = numArray[i];
					numArray[i] = numArray[j];
					numArray[j] = abc;
				}
			}
		}
		System.out.println(Arrays.toString(numArray));
		System.out.println(numArray[numArray.length-nth]);
	}
	public static void main(String[] args) {
		
		Sortnumber obj = new Sortnumber();
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter the input");
	int[] numArray = new int[5];
	
	for (int i=0 ; i<numArray.length ; i++)
	{
	    numArray[i] = sc.nextInt();
	}
	System.out.println("Enter the value you're looking for");
	int nth = sc.nextInt();
	obj.sortint(numArray, nth);

	}
}
