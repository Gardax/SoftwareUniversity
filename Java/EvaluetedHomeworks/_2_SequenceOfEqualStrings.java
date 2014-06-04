import java.util.Arrays;
import java.util.Scanner;


public class _2_SequenceOfEqualStrings {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		String[] strArr = str.split(" ");
		Arrays.sort(strArr);
		
		System.out.print(strArr[0] + " ");
		for (int i = 1; i < strArr.length; i++) {
			if(strArr[i].equals(strArr[i-1])) {
				System.out.print(strArr[i] + " ");
			}
			else {
				System.out.println();
				System.out.print(strArr[i] + " ");
			}
		}
		
	}
}
