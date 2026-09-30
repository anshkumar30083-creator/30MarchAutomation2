package loopandarray;

import java.util.Scanner;

public class ArraybyScanner {
	
	public void reversestring_demo (String input)
	{
		String out = "";
		char[] ch =input.toCharArray();
		int size = ch.length;
		for(int i=size-1 ; i>=0 ; i--)
		{
			
			out = out+ch[i] + " ";
		}
		System.out.println(out);
		
		
	}
	
	public static void main(String[] args) {
		ArraybyScanner ob = new ArraybyScanner();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the input");
		String input = sc.next();
		ob.reversestring_demo(input);
		
		
	}

}
