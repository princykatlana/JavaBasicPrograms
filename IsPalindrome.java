package learning;

public class IsPalindrome {
	

	 public static boolean isPalindrome(String input) throws Exception
	{	
		if(input == null)
			throw new Exception ("invalid input; String is null");
			
		for(int i=0; i<=input.length()/2; i++){
			if(input.charAt(i) != input.charAt(input.length() - i - 1) )
				return false;
		}
		
		return true;

	}
	 
	public static void main(String[] args) throws Exception{
	  
		System.out.println(isPalindrome("qwertuewq"));
	}

}
