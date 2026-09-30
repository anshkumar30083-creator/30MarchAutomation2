package loopandarray;

public class Arraydemo {
	public void arraydemo()
	{
		int[]numArray = new int[5];
		numArray[0] = 5 ;
		numArray[1] = 8 ;
		numArray[2] = 9 ;
		numArray[3] = 3 ;
		numArray[4] = 6 ;
		
		int out = 0;
		for(int a =0; a<5 ; a++ )
		{
			out = out + numArray[a];
		}
		System.out.println(out);
	}
	
	public static void main(String[] args) {
		Arraydemo ob = new Arraydemo();
		ob.arraydemo();
		
	}

}
