import interfaces.ThreeMethodInterface;

class Implementor implements ThreeMethodInterface {
	public void methodOne() { System.out.println("Implementor.methodOne()"); }
	public void methodTwo() { System.out.println("Implementor.methodTwo()"); }
	public void methodThree() { System.out.println("Implementor.methodThree()"); }
}

public class Exercise5 {
	public static void main(String[] args) {
		Implementor i = new Implementor();
		i.methodOne();
		i.methodTwo();
		i.methodThree();
	}
}