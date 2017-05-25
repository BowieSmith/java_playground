import java.util.*;

class MyClass {
	private static Random rand = new Random();
	private final int id = rand.nextInt(20);
	public String toString() {
		return "MyClass " + id;
	}
}

public class Exercise7 {
	public static void main(String[] args) {
		MyClass[] myClassArray = new MyClass[10];
		List<MyClass> myClassList = new ArrayList<MyClass>();
		Collections.addAll(myClassList, myClassArray);

		System.out.println(myClassArray);
		System.out.println(myClassList);
		myClassList.clear();

		for (int i = 0; i < 10; i++) {
			myClassArray[i] = new MyClass();
		}
		Collections.addAll(myClassList, myClassArray);
		System.out.println(myClassList);

		List<MyClass> subMyClassList = new ArrayList<MyClass>(myClassList.subList(2,5));
		System.out.println(myClassList);
		System.out.println(subMyClassList);

		myClassList.removeAll(subMyClassList);
		System.out.println(myClassList);
		System.out.println(subMyClassList);
	}
}