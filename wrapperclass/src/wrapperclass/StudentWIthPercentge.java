package wrapperclass;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

class Compareper implements Comparator<StudentWIthPercentge>{

	@Override
	public int compare(StudentWIthPercentge o1, StudentWIthPercentge o2) {
		if (o1.Percentage<o2.Percentage)
			return 1;
			else if (o1.Percentage>o2.Percentage)
				return -1;
			else 
				return 0;
	}
}

public class StudentWIthPercentge {
	
	int RollNo;
	double Percentage;
	String Name;
	
	public StudentWIthPercentge(String Name,int RollNo,double Percentage) {
		this.RollNo=RollNo;
		this.Name=Name;
		this.Percentage=Percentage;
		
	}
	public String toString() {
		return this.Name+" "+this.RollNo+" "+this.Percentage;
	}

	public static void main(String[] args) {
		StudentWIthPercentge C1=new StudentWIthPercentge("A",1,75.88);
		StudentWIthPercentge C2=new StudentWIthPercentge("B",4,58.88);
		StudentWIthPercentge C3=new StudentWIthPercentge("D",5,91.68);
		StudentWIthPercentge C4=new StudentWIthPercentge("C",3,81.00);
		StudentWIthPercentge C5=new StudentWIthPercentge("E",7,83.09);
		
	
		LinkedList<StudentWIthPercentge> set=new LinkedList<>();
		set.add(C1);
		set.add(C2);
		set.add(C3);
		set.add(C4);
		set.add(C5);
		
		Collections.sort(set,new Compareper());
		
		Iterator<StudentWIthPercentge>Itr=set.iterator();
		while(Itr.hasNext()) {
			System.out.println(Itr.next());

		}
	}
}
