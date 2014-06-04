import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class Ex3_LargestSequanceOfEqualStrings {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		String[] tokens = line.split(" ");
		Map<String, Integer> counters = new TreeMap<String, Integer>();
		for (String string : tokens) {
		    Integer count = counters.get(string);
		    if (count == null) {
			count = 0;
		    }
		    counters.put(string, count + 1);
		}
		Map.Entry<String, Integer> maxEntry = null;
		for (Map.Entry<String, Integer> entry : counters.entrySet()) {
		    if (maxEntry == null
			    || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
			maxEntry = entry;
		    }
		}
		for (int i = 0; i < maxEntry.getValue(); i++) {
		    System.out.print(maxEntry.getKey() + " ");
		}
	}

}
