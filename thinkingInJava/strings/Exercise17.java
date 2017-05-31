import java.io.*;
import java.util.*;

public class Exercise17 {
	ArrayList<String> comments = new ArrayList<String>();

	private void readComments(String path) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader(path));
		String currentLine = null;
		while ((currentLine = br.readLine()) != null) {
			if (currentLine.matches(".*//.*")) {
				comments.add(currentLine);
			}
		}
	}

	public ArrayList<String> getComments() {
		return comments;
	}

	public static void main(String[] args) throws Exception {
		Exercise17 e = new Exercise17();
		e.readComments(args[0]);
		System.out.println(e.getComments());
	}
}