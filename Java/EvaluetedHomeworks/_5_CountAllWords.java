import java.util.Scanner;


public class _5_CountAllWords {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		String[] words = str.split("\\s+|\\'|\\-");
		System.out.println(words.length);
	}

}
