import java.util.Scanner;


public class Ex6_CountSpecifiedWord {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		String word = scanner.next();
		String[] words = text.split("([().,!?:;'\"-]|\\s)+");
		int count = 0;
		for (String currentWord : words) {
		    if (currentWord.equalsIgnoreCase(word)) {
			count++;
		    }
		}
		System.out.println(count);

	}

}
