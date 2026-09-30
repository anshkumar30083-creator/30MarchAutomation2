package loopandarray;

import java.util.Scanner;

public class Reversesentence_wordArray {
	
	public void reversesen(String sen)
	{
		String[] set = sen.split(" ");
		String out = "";
		for (int i=set.length-1 ; i>=0 ; i--)
		{
			char[] ch = set[i].toCharArray();
			for(int j=ch.length-1 ; j>=0 ; j--)
			{
				out = out+ ch[j] ;
				
			}
			out = out + " ";
		}
		System.out.println(out.trim());
	}
	
	public static void main(String[] args) {
		Reversesentence_wordArray ob = new Reversesentence_wordArray();
		Scanner sc =  new Scanner(System.in);
		System.out.println("Please enter the input");
		String sen = sc.nextLine();
		ob.reversesen(sen);
	}

}
