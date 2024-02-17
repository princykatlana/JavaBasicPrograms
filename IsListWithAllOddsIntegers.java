package learning;

import java.util.List;
import java.util.ArrayList;

public class IsListWithAllOddsIntegers {
	
	 public static boolean onlyOdds(List<Integer> num)
	 {
		for(int i: num)
		{
			if(i%2 == 0)
			 return false;
		}
		
		return true;
	 }
	 
	public static void main(String[] args) throws Exception{
		
		List<Integer> list = new ArrayList();
		list.add(23);
		list.add(23);
		list.add(20);
	  
		System.out.println(onlyOdds(list));
	}

}
