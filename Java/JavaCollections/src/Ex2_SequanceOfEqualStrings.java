import java.util.Scanner;


public class Ex2_SequanceOfEqualStrings {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String strings=input.nextLine();
		String[] arrayOfStrings=strings.split(" ");
		String previous="";
		for (int i = 0; i < arrayOfStrings.length; i++) {
			if(!arrayOfStrings[i].equals(previous) && i!=0){
				System.out.println();
			}
			System.out.print(arrayOfStrings[i]+" ");
			previous=arrayOfStrings[i];
		}
	}

}
