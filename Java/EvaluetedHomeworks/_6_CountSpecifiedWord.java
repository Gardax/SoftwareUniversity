import java.util.Locale;
import java.util.Scanner;

public class _6_CountSpecifiedWord {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		String word = scanner.nextLine();
		int counter = 0;
		
		String[] text = str.split(" ");
		
		for(String curWord : text) {
			if(word.equalsIgnoreCase(curWord)) {
				counter++;
			}
		}
		System.out.println(counter);
		
	}
}
