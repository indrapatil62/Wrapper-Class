package wrapperclass;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

class CompareYear implements Comparator<BoxOfficeCollection> {

	@Override
	public int compare(BoxOfficeCollection o1, BoxOfficeCollection o2) {
		if (o1.year < o2.year)
			return -1;
		else if (o1.year > o2.year)
			return 1;
		else
			return 0;
	}

}

class CompareBOC implements Comparator<BoxOfficeCollection> {

	@Override
	public int compare(BoxOfficeCollection o1, BoxOfficeCollection o2) {
		if (o1.BOC < o2.BOC)
			return -1;
		else if (o1.BOC > o2.BOC)
			return 1;
		else
			return 0;
	}

}

class Compareratings implements Comparator<BoxOfficeCollection> {

	@Override
	public int compare(BoxOfficeCollection o1, BoxOfficeCollection o2) {
		if (o1.ratings < o2.ratings)
			return -1;
		else if (o1.ratings > o2.ratings)
			return 1;
		else
			return 0;
	}
}

public class BoxOfficeCollection {

	int year;
	double BOC;
	float ratings;
	String Name;

	public BoxOfficeCollection(String Name, int year, double BOC, float ratings) {
		this.year = year;
		this.Name = Name;
		this.BOC = BOC;
		this.ratings = ratings;
	}

	public String toString() {
		return this.Name + " " + this.BOC + " " + this.ratings + " " + this.year;
	}

	public static void main(String[] args) {
		BoxOfficeCollection C1 = new BoxOfficeCollection("SOTY", 2014, 50000000, 7.8f);
		BoxOfficeCollection C2 = new BoxOfficeCollection("SOTY2", 2018, 40000000, 8.8f);
		BoxOfficeCollection C3 = new BoxOfficeCollection("Bahubali", 2016, 90000000, 9.8f);
		BoxOfficeCollection C4 = new BoxOfficeCollection("Dangal", 2018, 80000000, 8.8f);
		BoxOfficeCollection C5 = new BoxOfficeCollection("Jay Ho", 2017, 4000000, 5.8f);

		Vector<BoxOfficeCollection> vector1 = new Vector<>();
		vector1.add(C1);
		vector1.add(C2);
		vector1.add(C3);
		vector1.add(C4);
		vector1.add(C5);
		Vector<BoxOfficeCollection> vector2 = new Vector<>();
		vector2.add(C1);
		vector2.add(C2);
		vector2.add(C3);
		vector2.add(C4);
		vector2.add(C5);
		Vector<BoxOfficeCollection> vector3 = new Vector<>();
		vector3.add(C1);
		vector3.add(C2);
		vector3.add(C3);
		vector3.add(C4);
		vector3.add(C5);

		System.out.println("List on basis of BOC :");
		Collections.sort(vector1, new CompareBOC());
		Iterator<BoxOfficeCollection>Itr1=vector1.iterator();
		while(Itr1.hasNext()) {
			System.out.println(Itr1.next());
		}
		
		System.out.println("\n List on basis of Year :");

		Collections.sort(vector2, new CompareYear());
		Iterator<BoxOfficeCollection>Itr2=vector2.iterator();
		while(Itr2.hasNext()) {
			System.out.println(Itr2.next());
		}
		
		System.out.println("\n List on basis of Ratings :");

		Collections.sort(vector3, new Compareratings());
		Iterator<BoxOfficeCollection>Itr3=vector3.iterator();
		while(Itr3.hasNext()) {
			System.out.println(Itr3.next());
		}

	}

}
