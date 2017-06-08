import java.util.*;

interface Generator<T> {
	public T next();
}

class StoryCharacter {
	protected static long characterCount = 0;
	protected final long id = characterCount++;
	protected final String name;
	protected final String charType;
	public StoryCharacter(String name, String charType) {
		this.name = name;
		this.charType = charType;
	}
	public String toString() {
		return "Character " + id + ": " + charType + ", " + name;
	}
}

class GoodGuy extends StoryCharacter {
	public GoodGuy(String name) {
		super(name, "GoodGuy");
	}
}

class BadGuy extends StoryCharacter {
	public BadGuy(String name) {
		super(name, "BadGuy");
	}
}

class BreakingBadCharacterGenerator implements Generator<StoryCharacter> {
	private Random rand = new Random();
	private String[] goodGuys = new String[] {
		"Jesse Pinkman",
		"Walter White",
		"Sal Goodman",
		"Skylar White",
		"Flynn White",};
	private String[] badGuys = new String[] {
		"Tucco",
		"Gus",
		"Jack",
		"Sylvia",
		"Todd",};
	private String[] sideCharacters = new String[] {
		"Bicycle Boy",
		"Jesse gf 1",
		"Jesse gf 2",
		"Skylars mistress",
		"Jesse drug friend",};
	public StoryCharacter next() {
		int characterGroupSelection = rand.nextInt(3);
		if (characterGroupSelection == 0) {
			return new GoodGuy(goodGuys[rand.nextInt(goodGuys.length)]);
		} else if (characterGroupSelection == 1) {
			return new BadGuy(badGuys[rand.nextInt(badGuys.length)]);
		} else {
			return new StoryCharacter(sideCharacters[rand.nextInt(sideCharacters.length)],"SideCharacter");
		}
	}
}

public class Exercise8 {
	public static void main(String[] args) {
		BreakingBadCharacterGenerator bb = new BreakingBadCharacterGenerator();
		for (int i = 0; i < 10; i++) {
			System.out.println(bb.next());
		}
	}
}
