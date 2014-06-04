import java.util.Scanner;


public class SymmetricsNumbersInRange {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int start=input.nextInt();
		int end=input.nextInt();
		
		for(int i=start; i<=end; i++){
			String numberToString=Integer.toString(i);
			if(numberToString.length()==1){
				System.out.print(numberToString+" ");
			}else if(numberToString.length()==2 && i%11==0){
				System.out.print(numberToString+" ");
			}else if(numberToString.length()==3)
			{
				if(numberToString.charAt(0)==numberToString.charAt(2)){
					System.out.print(numberToString+" ");
				}
			}
		}

	}

}
