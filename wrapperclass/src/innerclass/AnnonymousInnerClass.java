package innerclass;

interface ABC{
	abstract void show();
}
public class AnnonymousInnerClass {
	public static void main(String[] args) {
		ABC a=new ABC() {

			@Override
			public void show() {
				System.out.println("This is unimplemented method of Annonymous class");
			}
		};// this denote the annonymous class
		a.show();
	}
}
