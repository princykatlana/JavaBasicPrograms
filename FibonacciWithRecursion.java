package learning;

public class FibonacciWithRecursion {


	  static int a = 0;
	  static int b = 1; 
	  static int c = 0;
		
		
	 public static void getFSeries(int count){
		
		if(count>0)
		{
			c=a+b;
			a=b;
			b=c;
			
			System.out.print(" , " + c);  	
			getFSeries(count-1);
		}
	 
	 }
	 
	public static void main(String[] args) throws Exception{
		
		System.out.print((a + " , " + b ) );  
		getFSeries(5);
	}
}
