package wrapperclass;

import java.util.Comparator;
import java.util.TreeSet;

class CompareName implements Comparator<Comparator_compare>{

	@Override
	public int compare(Comparator_compare o1, Comparator_compare o2) {
		return o1.Name.compareTo(o2.Name);
//		return o2.Name.compareTo(o1.Name): Descending order insertion and return
	}
	
}
class CompareRollNo implements Comparator<Comparator_compare>{

	@Override
	public int compare(Comparator_compare o1, Comparator_compare o2) {
		if (o1.RollNo<o2.RollNo)
			return -1;
			else if (o1.RollNo>o2.RollNo)
				return 1;
			else 
				return 0;
		}
	
}
class ComparePercentage implements Comparator<Comparator_compare>{

	@Override
	public int compare(Comparator_compare o1, Comparator_compare o2) {
		if (o1.Percentage <o2.Percentage)
			return -1;
			else if (o1.Percentage>o2.Percentage)
				return 1;
			else 
				return 0;
		}
	
}

public class Comparator_compare {
		
		int RollNo;
		double Percentage;
		String Name;
		
		public Comparator_compare(String Name,int RollNo,double Percentage) {
			this.RollNo=RollNo;
			this.Name=Name;
			this.Percentage=Percentage;
			
		}
		public String toString() {
			return this.Name+" "+this.RollNo+" "+this.Percentage;
		}

		public static void main(String[] args) {
			Comparator_compare C1=new Comparator_compare("A",1,75.08);
			Comparator_compare C2=new Comparator_compare("B",4,58.88);
			Comparator_compare C3=new Comparator_compare("D",5,91.68);
			Comparator_compare C4=new Comparator_compare("C",3,81.00);
			Comparator_compare C5=new Comparator_compare("E",7,83.09);
			
			CompareName name=new CompareName();
			CompareRollNo rollno=new CompareRollNo();
			ComparePercentage per=new ComparePercentage();
		
			TreeSet<Comparator_compare> set=new TreeSet<Comparator_compare>(name);
			TreeSet<Comparator_compare> set1=new TreeSet<Comparator_compare>(rollno);
			TreeSet<Comparator_compare> set2=new TreeSet<Comparator_compare>(per);
			set.add(C1);
			set.add(C2);
			set.add(C3);
			set.add(C4);
			set.add(C5);
			
			set1.add(C1);
			set1.add(C2);
			set1.add(C3);
			set1.add(C4);
			set1.add(C5);
			
			set2.add(C1);
			set2.add(C2);
			set2.add(C3);
			set2.add(C4);
			set2.add(C5);
			
			System.out.println(set);
			System.out.println(set1);
			System.out.println(set2.descendingSet());
		}
		

}
