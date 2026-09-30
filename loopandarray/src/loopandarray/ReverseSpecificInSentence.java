package loopandarray;

import java.util.Scanner;

public class ReverseSpecificInSentence {

	public void reverseSpecific (String sen , String word )
	{
		String [] str = sen.split(" ");
		String out = ""; 
		boolean flag = false ;

		for(int i=0 ; i<str.length ; i++) {
			
			if(str[i].equals(word))
			{
				flag = true ;
			}
		}
		
		if (flag==true)
		{
		 for(int x=str.length-1 ; x>=0 ; x--)
		 {
			 out = out+str[x] +" ";
		 }
		}
		else 
		{
			char[] ch = word.toCharArray();
			for (int j=ch.length-1 ; j>=0 ; j--)
			{
				out = out +ch[j];
			}
		}
		System.out.println(out.trim());
	}
	public static void main(String[] args) {
		ReverseSpecificInSentence ob = new ReverseSpecificInSentence();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the input");
		String sen = sc.nextLine();
	    System.out.println("Please enter the another input");	
	    String word = sc.next();
	    ob.reverseSpecific(sen, word);
	}
}
