import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class RandomHandsOfFiveCards {

	public static void main(String[] args) {
		
		String[] faces={"2", "3","4", "5", "6", "7", "8" ,"9", "10","J", "Q", "K","A"};
		char[] suits={ '♣', '♦', '♥', '♠' };
		
		ArrayList<String> deck=new ArrayList<>();
		for(int i=0; i<faces.length; i++){
			for(int y=0; y<suits.length; y++){
				deck.add(faces[i]+suits[y]);
			}
		}
		
		Scanner input=new Scanner(System.in);
		int numberOfHands=input.nextInt();
		
		Random randomNumber=new Random();
		for(int i=0; i<numberOfHands; i++){
			for(int y=0; y<5; y++){
				int index=randomNumber.nextInt(deck.size());
				System.out.print(deck.get(index)+" ");
				deck.remove(index);
			}
			System.out.println();
		}
	}

}
