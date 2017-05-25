import java.util.*;
import java.io.*;

class FilePlay { 
	public static final Set<Character> vowels =
		new HashSet<Character>(Arrays.asList(new Character[] { 'a','e','i','o','u' } ));
	private List<String> fileWordList = new ArrayList<>();
	private Map<String,Integer> wordVowelCount = new TreeMap<>();
	private int fileVowelCount = 0;
	public void readFileIntoWordList(String fileName) throws FileNotFoundException {
		Scanner fileScanner = null;
		String currentLine = null;
		try {
			fileScanner = new Scanner(new File(fileName));
		} catch (FileNotFoundException e) {
			e.getMessage();
		}
		while (fileScanner.hasNextLine()) {
			currentLine = fileScanner.nextLine();
			String[] lineWords = currentLine.split("\\W+");
			for (String s : lineWords) {
				int thisWordVowelCount = 0;
				for (int i = 0; i < s.length(); i++) {
					if (vowels.contains(Character.toLowerCase(s.charAt(i)))) {
						fileVowelCount++;
						thisWordVowelCount++;
					}
				}
				fileWordList.add(s);
				if (!wordVowelCount.containsKey(s)) {
					wordVowelCount.put(s, thisWordVowelCount);
				}
			}
		}
	}
	public List<String> getFileWordList() {
		return fileWordList;
	}
	public int getTotalVowels() {
		return fileVowelCount;
	}
	public Map<String,Integer> getWordVowelCount() {
		return wordVowelCount;
	}
}

public class Exercise16 {
	public static void main(String[] args) throws Exception {
		FilePlay f = new FilePlay();
		System.out.println(f.vowels);

		f.readFileIntoWordList("Exercise16.java");
		System.out.println(f.getFileWordList());

		System.out.println(f.getWordVowelCount());

		System.out.println("\nTotal Vowels in File: " + f.getTotalVowels());
	}

}
