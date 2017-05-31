import java.util.regex.*;

public class Exercise11 {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b");
		String s = "Arline ate eight apples and one orange while Anita hadn’t any";
		Matcher m = p.matcher(s);
		while(m.find()) {
			System.out.println("\tMatch \"" + m.group() + "\" at: " + m.start() + "-" + (m.end() - 1));
		}
	}
}