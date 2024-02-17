package learning;

public class IsVowelPresent {
	
	public static boolean isVowelPresent(String str) throws Exception{
		
		if (str == null)
			throw new Exception("Input is invalid");

		str= str.toLowerCase();
		
		char[] chars = str.toCharArray();
		for(int i=0; i<=chars.length-1;  i++){
			if(chars[i] == ('a') || chars[i] ==('e')
			|| chars[i]==('i') || chars[i]==('o')
			|| chars[i]==('u'))
				return true;
			
		}
		
		return false;
		
	}
	public static void main(String[] args) throws Exception{
		String input = "qwrt";
		System.out.println(isVowelPresent(input));
	}

}
