import java.util.Scanner;


public class CountOfEqualBitPairs {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number=input.nextInt();
		
		String binary=Integer.toBinaryString(number);
		int count=0;
		for(int i=0; i<binary.length()-1; i++){
			if(binary.charAt(i)==binary.charAt(i+1)){
				count++;
			}
		}
		System.out.println(count);
		
	}

}
