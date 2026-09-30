package loopandarray;

import java.util.Scanner;

 

public class FindSmallestnumInArray {
	
	  public void findSmallestnum (int[] numArray)
	  {
	  	int smallest = numArray[0];
	  	for (int i=1 ;  i<5 ; i++)
	  	{
	  		if(smallest>numArray[i])
	  		{
	  			smallest=numArray[i];
	  		}
	  		
	  	}
	  	System.out.println(smallest);
	  }
	
	public static void main(String[] args) {
		FindSmallestnumInArray ob = new FindSmallestnumInArray();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the input");
		int [] numArray = new int[5];
		
		for (int i=0 ; i<5 ; i++)
		{
			numArray[i] = sc.nextInt();
		}
		ob.findSmallestnum(numArray);
		
	}

}
