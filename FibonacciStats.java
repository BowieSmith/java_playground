import java.util.*;
import java.math.BigInteger;

/**
FibonacciStats uses memoization and the BigInteger class to calculate
arbitrarily large fibonacci numbers.
When invoking the class, simply pass an integer as an arugment.
*/
public class FibonacciStats {
	/**
	List of BigIntegers to memoize values of fibonacci sequence.
	*/
	private static List<BigInteger> memoArray;

	// Initialize memoArray with seed values
	static {
		memoArray = new ArrayList<BigInteger>();
		memoArray.add(BigInteger.ZERO);
		memoArray.add(BigInteger.ONE);
	}

	/**
	Given an integer n, fib(n) will return the corresponding fibonacci number
	as a BigInteger.  If n < memoArray.size(), simply return the memoized value.
	Otherwise, build fibonacci sequence until target value is reached.
	@param n int argument to ask for the n-th fibonacci value
	@return BigInteger representation of n-th fibonacci number
	*/
	private static BigInteger fib(int n) {
		while (n >= memoArray.size()) {
			memoArray.add(memoArray.get(memoArray.size() - 1).add(
				memoArray.get(memoArray.size() - 2)));
		}
		return memoArray.get(n);
	}

	/**
	Given a BigInteger, printBigIntegerAnalysis() will display the number of digits
	in the given fibonacci number, along with the relative frequency of each digit.
	@param bigInt BigInteger value
	*/
	private static void printBigIntegerAnalysis(BigInteger bigInt) {
		String bigIntString = bigInt.toString();
		int[] decimalCounts = new int[10];
		System.out.println("\nDigits in fibonacci number: " + bigIntString.length());
		for (int i = 0; i < bigIntString.length(); i++) {
			decimalCounts[Character.getNumericValue(bigIntString.charAt(i))]++;
		}
		System.out.println("\nRelative occurence of digits:");
		for (int i = 0; i < 10; i++) {
			System.out.println(i + ": " + decimalCounts[i]);
		}
	}

	/**
	Pass integer argument to class invocation.
	*/
	public static void main(String[] args) {
		BigInteger thisBigInteger;

		if (args.length == 0) {
			System.out.println("\nYou didn't pass any variables!");
		} else {
			try {
				thisBigInteger = fib(Integer.parseInt(args[0]));
				System.out.println("\nFibonacci number " + args[0] + ": " + thisBigInteger.toString());
				printBigIntegerAnalysis(thisBigInteger);
			} catch (NumberFormatException e) {
				System.out.println("ERROR: " + e.getMessage());
				System.out.println("You must pass an integer argument!");
			}
			
		}
	}
}