package wrapperclass;

import java.util.Comparator;
import java.util.TreeSet;

class DescString implements Comparator<String>{

	
	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
//		return o2.compareTo(o1);
		return -o1.compareTo(o2);
	}
	
}

public class DescendingOrder {

	public static void main(String[] args) {
		DescString set=new DescString();
		
//		TreeSet<String> Color=new TreeSet<String>(set);
		TreeSet<String> Color=new TreeSet<String>(new DescString());
		Color.add("Orange");
		Color.add("Red");
		Color.add("Blue");
		Color.add("Black");
		Color.add("White");
		
		System.out.println(Color);
	}

}
