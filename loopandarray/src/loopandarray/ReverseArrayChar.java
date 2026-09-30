package loopandarray;

import java.util.Scanner;

public class ReverseArrayChar {
	
	public void reverseword (String inp) //(WORD)
	{
		char[] ch = inp.toCharArray(); //(W,O,R,D)
		String out = "";
		
		for (int i=ch.length-1 ; i>=0 ;i--)
		{
			out = out+ch[i];
			
		}
		System.out.println(out);
	}
	
	public static void main(String[] args) {
		
		ReverseArrayChar ob = new ReverseArrayChar();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the input");
		String inp = sc.next();
		
		ob.reverseword(inp);
	}

}
