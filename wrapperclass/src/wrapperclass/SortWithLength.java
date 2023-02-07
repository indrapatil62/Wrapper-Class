package wrapperclass;

import java.util.Comparator;
import java.util.TreeSet;

class sortstring implements Comparator<String>{
	

	

	@Override
	public int compare(String o1, String o2) {
//		if(o1.length()<o2.length()	)	
//		return -1;
//		else if(o1.length()>=o2.length()	)  Tree set will get repeat value(Duplicate value
//		return 1;
//		else
//		return 0;
//		
		if(o1.length()<o2.length()	)	
			return -1;
			else if(o1.length()>o2.length()	) 
				return 1;
			else
			return o1.compareTo(o2);}
	
}

public class SortWithLength {

	public static void main(String[] args) {

//		TreeSet<String> Color=new TreeSet<String>(set);
		TreeSet<String> Color=new TreeSet<String>(new sortstring());
		Color.add("A");
		Color.add("AB");
		Color.add("CD");
		Color.add("ABCD");
		Color.add("BCD");
		
		System.out.println(Color);

	}

}
