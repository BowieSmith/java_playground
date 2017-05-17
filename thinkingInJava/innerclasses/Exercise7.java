class PrivateClass {
	private int i;
	private int getValue() {
		return i;
	}
	class InnerClass {
		void changeOuter(int i) {
			PrivateClass.this.i = i;
			System.out.println(getValue());
		}
	}
	public InnerClass returnInner() {
		return new InnerClass();
	}
}

public class Exercise7 {
	public static void main(String[] args) {
		PrivateClass p = new PrivateClass();
		PrivateClass.InnerClass i = p.returnInner();
		i.changeOuter(7);
		i.changeOuter(14);
	}
}