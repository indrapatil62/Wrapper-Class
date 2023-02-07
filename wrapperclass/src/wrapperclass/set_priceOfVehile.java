package wrapperclass;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;

	class ComparePrize implements Comparator<set_priceOfVehile>{
			
			@Override
			public int compare(set_priceOfVehile o1, set_priceOfVehile o2) {
				if (o1.Prize<o2.Prize)
					return -1;
					else if (o1.Prize>o2.Prize)
						return 1;
					else 
						return 0;
			}

			}

	public class set_priceOfVehile {
			double Prize;
			String Name,FuelType,Transmission,ACPresent,VehicleType;
			
			public set_priceOfVehile(String Name,String FuelType,String Transmission,String ACPresent,double Prize,String VehicleType) {
				this.Prize=Prize;
				this.Name=Name;
				this.FuelType=FuelType;
				this.ACPresent=ACPresent;
				this.Transmission=Transmission;
				this.VehicleType=VehicleType;
				
			}
			public String toString() {
				return this.Prize+" "+this.Name+" "+this.FuelType+" "+this.Transmission+" "+this.ACPresent+" "+this.VehicleType;
			}

			public static void main(String[] args) {
				set_priceOfVehile P1=new set_priceOfVehile("Thar", "Petrol", "Manual", "AC", 2300000,"Private");
				set_priceOfVehile P2=new set_priceOfVehile("Traveller", "Disel", "Manual", "AC", 3000000,"Transport");
				set_priceOfVehile P3=new set_priceOfVehile("Verna", "Disel", "Manual", "AC", 2200000,"Private");
				
				
				Set<set_priceOfVehile> Set=new TreeSet<set_priceOfVehile>(new ComparePrize());
				
				Set.add(P1);
				Set.add(P2);
				Set.add(P3);
				
				Iterator<set_priceOfVehile>itr =Set.iterator();
				while(itr.hasNext()) {
					set_priceOfVehile P=itr.next();
						System.out.print(P.Name+" "+P.Prize+" ");
					
				}
				

			}}

