import java.util.Scanner;

public class _4_LongestIncreasingSequence {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		String[] strArr = str.split(" ");
		int[] intArr = new int[strArr.length];
		
		int counter = 1;
		int maxCounter = 1;
		int position = 0;
		
		for (int i = 0; i < strArr.length; i++) {
			intArr[i] = Integer.parseInt(strArr[i]);
		}
		
		for (int i = 1; i < intArr.length; i++) {
			if(intArr[i-1] < intArr[i]) {
				counter++;
				System.out.print(intArr[i-1] + " ");
			}
			else {
				counter = 1;
				System.out.println(intArr[i-1]);
			}
			if(maxCounter < counter) {
				maxCounter = counter;
				position = i - counter + 1;
			}
			if(i == intArr.length) {
				System.out.print(intArr[i]);	
			}
		}
		
		System.out.print("Longest : ");
		for (int i = 0; i < counter; i++) {
			System.out.print(intArr[position + i] + " ");
		}
	}
}
