public class Exercise2 {
	public static void printObjectName(Object o) {
		System.out.println(o.toString());
	}
	public static void main(String[] args) {
		try {
			Object obj = null;
			printObjectName(obj);
		} catch (Exception e) {
			System.out.println("Null object!");
		}
	}
}
