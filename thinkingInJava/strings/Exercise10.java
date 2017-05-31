import java.util.regex.*;

public class Exercise10 {
	public static void main(String[] args) {
		String[] regexArray = new String[] {
			"^Java", "\\breg.*", "n.w\\s+h(a|i)s", "s?",
			"s*", "s+", "s{4}", "S{1}", "s{0,3}"
		};
		String test = "Java now has regular expressions";

		for (String regex : regexArray) {
			Pattern p = Pattern.compile(regex);
			Matcher m = p.matcher(test);
			System.out.println("Looking for matches with regex expression: \"" + regex + "\"");
			while (m.find()) {
				System.out.println("\tMatch \"" + m.group() + "\" at: " + m.start() + "-" + (m.end() - 1));
			}
		}
	}
}