public class Exercise10 {
	public static void main(String[] args) {
		char[] charArr = new char[] {'a','b','c'};
		Class c = charArr.getClass();
		System.out.println(c);
		System.out.println(c.isPrimitive());

		Character ch = 'x';
		Class c2 = ch.getClass();
		System.out.println(c2);
		System.out.println(c2.isPrimitive());
	}
}