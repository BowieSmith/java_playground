import java.math.*;

class GenericMethods {
	public <A,B,C> void f(A a, B b, C c) {
		System.out.println("GenericMethods.f() arg[0]: " + a.getClass().getName() + ", " + a);
		System.out.println("GenericMethods.f() arg[1]: " + b.getClass().getName() + ", " + b);
		System.out.println("GenericMethods.f() arg[2]: " + c.getClass().getName() + ", " + c);
	}
}

public class Exercise9 {
	public static void main(String[] args) {
		GenericMethods gm = new GenericMethods();
		gm.f('a',7,"Poop");
		System.out.println();
		gm.f(BigInteger.valueOf(77), 6.7, 8.9f);
	}
}
