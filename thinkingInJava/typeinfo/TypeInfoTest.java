import java.lang.reflect.*;

class A {
	static { System.out.println("Loading Class A"); }
}

class B extends A {
	static { System.out.println("Loading Class B"); }
}

public class TypeInfoTest {
	public static void printClassInfo(Class c) {
		System.out.println();
		System.out.println("Class Name: " + c.getName());
		System.out.println("Superclass Name: " + c.getSuperclass());
		System.out.println("Fields:");
		for (Field f : c.getFields()) {
			System.out.println("\t" + f);
		}
		System.out.println("Methods:");
		for (Method m : c.getMethods()) {
			System.out.println("\t" + m);
		}
	}
	public static void main(String[] args) {
		Object obj = new B();
		Class classObj = obj.getClass();

		while (classObj != null) {
			printClassInfo(classObj);
			classObj = classObj.getSuperclass();
		}
	}
}
