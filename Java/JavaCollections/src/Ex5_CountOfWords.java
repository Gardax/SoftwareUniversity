import java.util.Scanner;


public class Ex5_CountOfWords {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		String[] words = text.split("([().,!?:;'\"-]|\\s)+");
		System.out.println(words.length);
	    }
}
