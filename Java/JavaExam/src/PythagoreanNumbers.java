import java.util.Arrays;
import java.util.Scanner;


public class PythagoreanNumbers {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int countOfNumbers=input.nextInt();
		int[] numbers=new int[countOfNumbers];
		for (int i = 0; i < countOfNumbers; i++) {
			numbers[i]=input.nextInt();
		}
		
		int count=0;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i; j < numbers.length; j++) {
				for (int z = 0; z < numbers.length; z++) {
					int first=numbers[i];
					int second=numbers[j];
					int third=numbers[z];
					
					if (first>second){
						int swap=first;
						first=second;
						second=swap;
					}
					if(first*first+second*second==third*third){
						System.out.println(first+"*"+first+" + "+second+"*"+second
								+" = "+third+"*"+third);
						count++;
					}
				}
				
			}
		}
		if (count==0){
			System.out.println("No");
		}

	}

}
