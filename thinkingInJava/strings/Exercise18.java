import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Exercise18 {
	ArrayList<String> stringLiterals = new ArrayList<String>();

	private void readStringLiterals(String path) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader(path));
		String currentLine = null;
		Pattern p = Pattern.compile("\\\".*\\\"");
		while ((currentLine = br.readLine()) != null) {
			Matcher m = p.matcher(currentLine);
			while(m.find()) {
				stringLiterals.add(m.group());
			}
		}
	}

	public ArrayList<String> getStringLiterals() {
		return stringLiterals;
	}

	public static void main(String[] args) throws Exception {
		Exercise18 e = new Exercise18();
		e.readStringLiterals(args[0]);
		System.out.println(e.getStringLiterals());
	}
}