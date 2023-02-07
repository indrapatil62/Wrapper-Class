package innerclass;

public class Local_InnerClass {
	int num;
	public void Show() {
		System.out.println(num);
		System.out.println("This is method of Inner Class");
		
		class InnerClass{
			int num;   // we can same  name member in both class
			public void Show() {
				System.out.println(num);
				System.out.println("This is method of Inner Class");
			}
		}
		InnerClass IC=new InnerClass();
		IC.num=210;
		IC.Show();
	}


	public static void main(String[] args) {
		Local_InnerClass LC=new Local_InnerClass();
		LC.num=20;
		LC.Show();
		
		
		
	}

}
