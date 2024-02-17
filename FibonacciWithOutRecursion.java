package learning;

public class FibonacciWithOutRecursion {

	 
	 public static int[] getFSeries(int count){
		int a = 0;
		int b = 1; 
		int c = 0;
		
		int[] output = new int[count];
		output[0]=a;
		output[1]=b;
		
		for (int i=2; i<=count-1; i++){
			c=a+b;
			a=b;
			b=c;
			output[i]=c;		
		}
		
		return output;
		
	 }
	 
	public static void main(String[] args) throws Exception{
		int[] output = getFSeries(10);
		for(int i : output) {
			System.out.println(i + " ");
		}
	}
}

