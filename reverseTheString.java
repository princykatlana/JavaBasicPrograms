package learning;

public class reverseTheString {

	public static String reserveString(String str) throws Exception{
		
		if (str == null)
			throw new Exception("Input is invalid");

		
		char[] chars = str.toCharArray();
		char[] out = new char[chars.length];
		int j=0;
		for(int i= chars.length-1; i>=0 ; i--){
			out[j++]=chars[i];
		}
		
		//return new String(out);
		return String.valueOf(out);
		
	}
	
	
	public static void main(String[] args) throws Exception{
		String input = "qwert";
		System.out.println(reserveString(input));
	}
}
