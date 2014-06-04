
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Ex9_CombineListOfLetters {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String firstLine = reader.nextLine();
		String secondLine = reader.nextLine();

		List<Character> firstList = new ArrayList<Character>();
		for (int i = 0; i < firstLine.length(); i+=2) {
			firstList.add(firstLine.charAt(i));
		}

		List<Character> secondList = new ArrayList<Character>();
		for (int i = 0; i < secondLine.length(); i+=2) {
			secondList.add(secondLine.charAt(i));
		}

		secondList.removeAll(firstList);

		firstList.addAll(secondList);

		for (Character ch : firstList) {
			System.out.print(ch + " ");
		}
	}

}
