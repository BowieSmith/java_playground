public class Exercise8 {
	public static void throwException() throws MyException4 {
		throw new MyException4("Thrown-from-Exercise5.throwException()");
	}
	public static void main(String[] args) {
		try {
			throwException();
		} catch (MyException4 e) {
			System.out.println(e.getMyString());
			e.printStackTrace();
		}
	}
}