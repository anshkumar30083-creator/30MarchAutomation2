package loopandarray;

import java.util.Scanner;

public class RemoveDuplicate {
	public void duplicateremove (String inp )
	{
		char[] ch = inp.toCharArray(); //g,o,o,d,s
		String out ="";
		for(int i=0 ; i<ch.length ; i++)
		{
			boolean flag = false ;
			for(int j = i+1; j<ch.length ; j++)
			{
				if( ch[i]==ch[j])
				{
					flag = true;
				}
			}
		if(flag == false )
		{
			out = out +ch[i];
		}
		}
		System.out.println(out);
		
	}
	
public static void main(String[] args) {
	RemoveDuplicate ob = new RemoveDuplicate();
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter the input");
	String inp = sc.next();
	ob.duplicateremove(inp);
}
}
