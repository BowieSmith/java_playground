public class Exercise8 {
	public static void main(String[] args) {
		String knights = "Then, when you have found the shrubbery, you must " +
						 "cut down the mightiest tree in the forest... " +
						 "with... a herring!";
		for (String s : knights.split("the|you")) {
			System.out.println(s);
		}
	}
}