package loopandarray;

import java.util.Scanner;

public class OccurenceofAlphabets {
	
	public String occurence (String inp)
	{
		char[] ch = inp.toCharArray();
		String out = "";
		
		for (int i=0 ; i<ch.length ; i++)
		{
			boolean flag = false ; 
			for (int j=i+1 ; j<ch.length ; j++)
			{
				if (ch[i]==ch[j])
				{
				 flag = true ; 
				}
				
			}
			if (flag == false )
			{
				out = out +ch[i];
			}
		
		}
		return out;
	}
		public void numberrepeat(String inp)
		{
		char[] ch = inp.toCharArray();
		String out = occurence(inp);
		
		char[] ch1 = out.toCharArray();
		for (int i=0;i<ch.length-1;i++)
		
		{
			int count = 0;
			for(int j=0; j<ch.length ; j++)
			{
				if(ch1[i]==ch[j])
				{
					count++;
				}
				
			}
			
			System.out.println(ch1[i] + "-" +count);

		}
		
		}
		
	
	public static void main(String[] args) {
		OccurenceofAlphabets ob = new OccurenceofAlphabets();
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Please enter the input");
		 String inp = sc.next();
		 ob.numberrepeat(inp);
	}

}
