import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;


public class Ex1_SortArrayOfNumbers {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int countOfNumbers=input.nextInt();
		int[] numbers=new int[countOfNumbers];
		for (int i = 0; i < countOfNumbers; i++) {
			numbers[i]=input.nextInt();
		}
		
		Arrays.sort(numbers);
		
		for (int i = 0; i < countOfNumbers; i++) {
			System.out.print(numbers[i]+" ");
		}
		

	}

}
