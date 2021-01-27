//TODO: Import libraries as needed
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

public class SortedCollection {
	// TODO: Add member variables or methods as needed
	private PriorityQueue<Integer> i = new PriorityQueue<Integer>();
	/**
	 * Adds the number n to the collection.
	 * 
	 * @param n the number to add to the collection
	 * @return always returns true
	 */
	public boolean add(int n) {
		// TODO: Implement
		i.add(n);
		return true;
	}

	/**
	 * Removes the smallest number in the collection and returns it.
	 * If the collection is empty, throws a NoSuchElementException.
	 * 
	 * @return the smallest number in the collection
	 */
	public int remove() throws NoSuchElementException {
		// TODO: Implement
		int firstNumber = i.poll();
		return firstNumber;
	}

	/**
	 * Prints usage information.
	 */
	public static void showUsage() {
		System.out.println("Usage: java SortedCollection [num1] [num2] [num3] ...");
	}

	/**
	 * Main method. Receives a list of numbers as commandline arguments and prints
	 * out the list in sorted order from smallest to largest.
	 * 
	 * @param args commandline arguments; see showUsage() for detailed information
	 */
	public static void main(String[] args) {
		SortedCollection collection = new SortedCollection();
		if (args.length == 0) {
			showUsage();
			return;
		}
		try {for (int i = 0; i < args.length; i++)
		 { collection.add(Integer.valueOf(args[i]));
       			}}
       		
       	catch (NumberFormatException e) {
     		 showUsage();}
		
		// TODO: add numbers in commandline arguments to collection using the add(int) method.
		// If any commandline argument is not a number, call showUsage() and return.
		
		System.out.print("sorted: ");
		for (int i = 0; i < args.length; i++) {
			int num = collection.remove();
			System.out.print(num + " ");
		}
		System.out.println();
	}
}
