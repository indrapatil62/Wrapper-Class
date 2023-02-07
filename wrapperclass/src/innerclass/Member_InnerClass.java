package innerclass;

public class Member_InnerClass {
	int num=10;
	public void Show() {
		System.out.println(num);
		System.out.println("This is method of Outer Class");
	}
	class InnerClass{
		int num;   // we can same  name member in both class
		public void Show() {
			System.out.println(num);
			System.out.println("This is method of Inner Class");
		}
	}

	public static void main(String[] args) {
		Member_InnerClass NN=new Member_InnerClass();
		NN.num=20;
		NN.Show();
		
		Member_InnerClass.InnerClass IN=NN.new InnerClass();
		IN.num=30;
		IN.Show();
		
		
	}

}
