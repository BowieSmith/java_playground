class MyException4 extends Exception {
	String myString;
	public MyException4(String str) {
		myString = str;
	}
	public String getMyString() {
		return myString;
	}
}

public class Exercise4 {
	public static void main(String[] args) {
		try {
			throw new MyException4("This-string-argument");
		} catch (MyException4 e) {
			System.out.println(e.getMyString());
			e.printStackTrace();
		}
	}
}