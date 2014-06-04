import java.util.Scanner;


public class Generate3LetterWords {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String letters=input.next();
		
		char lettersArray[]=letters.toCharArray();
		int countOfLetters=lettersArray.length;
		if (countOfLetters == 1) {
            System.out.print(Character.toString(lettersArray[0])+lettersArray[0]+lettersArray[0]);

		} else {
            for (int i = 0; i < lettersArray.length; i++) {
                    for (int j = 0; j < lettersArray.length; j++) {
                            for (int j2 = 0; j2 < lettersArray.length; j2++) {
                                    System.out.printf("%s%s%s ", lettersArray[i],
                                    		lettersArray[j], lettersArray[j2]);
                            }
                    }
            }
    }
		
	}

}
