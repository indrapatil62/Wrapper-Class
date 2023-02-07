package wrapperclass;

import java.util.TreeSet;

public class Comparable_CompareTo implements Comparable<Comparable_CompareTo>{
	
	int RollNo;
	double Percentage;
	String Name;
	
	public Comparable_CompareTo(String Name,int RollNo,double Percentage) {
		this.RollNo=RollNo;
		this.Name=Name;
		this.Percentage=Percentage;
		
	}
	public String toString() {
		return this.Name+" "+this.RollNo+" "+this.Percentage;
	}

	public static void main(String[] args) {
		Comparable_CompareTo C1=new Comparable_CompareTo("A",1,75.08);
		Comparable_CompareTo C2=new Comparable_CompareTo("B",4,58.88);
		Comparable_CompareTo C3=new Comparable_CompareTo("D",5,91.68);
		Comparable_CompareTo C4=new Comparable_CompareTo("C",3,81.00);
		Comparable_CompareTo C5=new Comparable_CompareTo("E",7,83.09);
	
		TreeSet<Comparable_CompareTo> set=new TreeSet<Comparable_CompareTo>();
		set.add(C1);
		set.add(C2);
		set.add(C3);
		set.add(C4);
		set.add(C5);
		
		System.out.println(set);
	}
	@Override
	public int compareTo(Comparable_CompareTo o) {
		if (Percentage<o.Percentage)
		return -1;
		else if (Percentage>o.Percentage)
			return 1;
		else 
			return 0;
	}

}
