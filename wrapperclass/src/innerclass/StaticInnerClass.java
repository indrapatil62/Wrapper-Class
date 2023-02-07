package innerclass;

public class StaticInnerClass {
	int num;
	public void Show() {
		System.out.println("This is outer class ");
	}
	static class InnerClass{
		int num;
		public void Show() {

			System.out.println(num);
			System.out.println("This is Inner class ");
		}
	}

	public static void main(String[] args) {
		StaticInnerClass.InnerClass SIC=new StaticInnerClass.InnerClass();
		SIC.Show();
		SIC.num=10;
		
	

	}

}
