package innerclass;

abstract class ABCD{
	abstract void show();
}
public class AbstractAnnonymous {

	public static void main(String[] args) {
		ABCD a=new ABCD() {

			@Override
			void show() {
				System.out.println("This is unimplemented method of Annonymous class");
			}
		};// this denote the annonymous class
		a.show();
	}
}
