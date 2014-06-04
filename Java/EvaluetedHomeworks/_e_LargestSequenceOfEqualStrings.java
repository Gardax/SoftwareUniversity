import java.util.Arrays;
import java.util.Scanner;


public class _e_LargestSequenceOfEqualStrings {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		String[] splittedArr = str.split(" ");
		Arrays.sort(splittedArr);
		
		int counter = 1;
		int maxCounter = 1;
		int position = 0;
		
		for (int i = 1; i < splittedArr.length; i++) {
			if(splittedArr[i].equals(splittedArr[i-1])) {
				counter++;
			}	
			else {
				counter = 1;
			}
			if(maxCounter < counter) {
				maxCounter = counter;
				position = i;
			}
		}
		
		for (int i = 0; i < counter; i++) {
			System.out.print(splittedArr[position] + " ");
		}
	}

}
