package loopandarray;

public class PrintArray {
	
	public void arraydemo()
	{
		int[] number =  {4 ,5 ,8 ,9 ,3};
		
		for(int i=0; i<=4 ; i++)
		{
		System.out.println(number[i]);
		}
		
		
		
	}
	
	public static void main(String[] args) {
		PrintArray ob = new PrintArray();
		ob.arraydemo();
		
	}

}
