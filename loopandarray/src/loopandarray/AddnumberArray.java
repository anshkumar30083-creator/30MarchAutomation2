package loopandarray;

import java.util.Scanner;

public class AddnumberArray {
	
	public void addnums (int[] numArray) 
	{
		int out =0; 
		for(int a=0 ; a<5 ; a++)
		{
			
			out=out + numArray[a];	
		}
		System.out.println(out);	
		
	}
		
	public static void main(String[] args) {
		 AddnumberArray ob = new  AddnumberArray();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the input");
		int[] numArray  = new int[5];
		ob.addnums(numArray);
		
		for(int a=0 ; a<5 ; a++)
		{
			numArray[a] = sc.nextInt();
			
		}
		
	}

}
