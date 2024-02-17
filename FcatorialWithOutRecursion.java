package learning;

public class FcatorialWithOutRecursion {
	
	 public static int getFactorail(int n){
		 
		 int fact =1;
	 for (int i = n; i>=1 ; i--){
		fact = fact * i;
	 }
	 
	 return fact;
	 }
	 
	public static void main(String[] args) {
		
		System.out.println((getFactorail(5)));
		
	}

}
