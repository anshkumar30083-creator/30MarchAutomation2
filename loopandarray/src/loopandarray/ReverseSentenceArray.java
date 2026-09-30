package loopandarray;

import java.util.Scanner;

public class ReverseSentenceArray {
	
	public void sentencereverse (String sen)
	{
		String [] str =sen.split(" ");
		String out = "";
		
		for (int i=str.length-1 ; i>=0 ; i--)
		{
			out =out +str[i] + " ";
			
		}
		
	System.out.println(out.trim());	
	}
	
	public static void main(String[] args) {
		ReverseSentenceArray ob = new ReverseSentenceArray();
		Scanner sc = new Scanner(System.in);
		System.out.println("Type your input");
		String sen = sc.nextLine();
		ob.sentencereverse(sen);
		
	}

}
