abstract class NoDefaultConstructor {
	private int i;
	NoDefaultConstructor(int i) {
		this.i = i;
	}
	abstract void otherMethod();
}

class OtherFactory {
	NoDefaultConstructor returnOther(int i) {
		return new NoDefaultConstructor(i) {
			void otherMethod() {
				System.out.println("Anonymous otherMethod(), i = " + i);
			}
		};
	}
}

public class Exercise15 {
	public static void main(String[] args) {
		NoDefaultConstructor n = new OtherFactory().returnOther(7);
		n.otherMethod();
	}
}
