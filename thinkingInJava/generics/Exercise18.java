import java.util.*;

interface Generator<T> {
	public T next();
}

abstract class Fish {
	private final long id;
	public Fish(long id) {
		this.id = id;
	}
	public String toString() {
		return this.getClass().getSimpleName() + " " + id;
	}
}

class BigFish extends Fish {
	private static long count = 0;
	private BigFish() {
		super(++count);
	}
	public static Generator<BigFish> generator =
		new Generator<BigFish>() {
			public BigFish next() {
				return new BigFish();
			}
		};
}

class LittleFish extends Fish {
	private static long count = 0;
	private LittleFish() {
		super(++count);
	}
	public static Generator<LittleFish> generator =
		new Generator<LittleFish>() {
			public LittleFish next() {
				return new LittleFish();
			}
		};
}

class Fishes {
	public static void eat(BigFish b, LittleFish l) {
		System.out.println(b + " eats " + l);
	}
}

public class Exercise18 {
	public static void main(String[] args) {
		ArrayList<BigFish> bf = new ArrayList<>();
		ArrayList<LittleFish> lf = new ArrayList<>();
		Random rand = new Random();

		for (int i = 0; i < 15; i++) {
			lf.add(LittleFish.generator.next());
		}

		for (int i = 0; i < 5; i++) {
			bf.add(BigFish.generator.next());
		}

		for (LittleFish l : lf) {
			Fishes.eat(bf.get(rand.nextInt(bf.size())), l);
		}
	}
}