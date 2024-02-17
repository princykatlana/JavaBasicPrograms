package learning;

public class RemoveWhiteSpaceFromString {
	
	 public static String removeSpace(String input) throws Exception
		{	
			
			if(input == null)
				throw new Exception ("invalid input; String is null");
				
			int l = input.length();
			char[] output = new char[l];
			int j=0;
			
			for(int i=0; i<l; i++){
				if(input.charAt(i) !=  ' ')
					output[j++]=input.charAt(i);
					
			}
			
			return String.valueOf(output);

		}
		 
		public static void main(String[] args) throws Exception{
		  
			System.out.println(removeSpace("is string null ?"));
		}

}
