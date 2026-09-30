package loopandarray;

import java.util.Scanner;

public class Reversenumbers {
    public void reversenum(int num) //65897
   {
    	int out = 0;
	while(num>0)
	{
		int remainder=num%10;
		out = out*10+remainder;
		num= num/10;
	}
	System.out.println(out);
    }
	public static void main(String[] args) {
		Reversenumbers ob = new Reversenumbers ();
	
		Scanner ab = new Scanner(System.in);
		System.out.println("Please enter the input");
		int num = ab.nextInt();
		ob.reversenum(num);
	}
}
