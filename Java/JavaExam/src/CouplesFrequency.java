import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class CouplesFrequency {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		String[] line=input.nextLine().split(" ");
		
		ArrayList<String[]> couples=new ArrayList<String[]>();
		int counter=0;
		for (int i = 0; i < line.length-1; i++) {
			String couple=line[i]+" "+line[i+1];
			boolean isAdded=false;
			for (int j = 0; j < couples.size(); j++) {
				if(couples.get(j)[0].equals(couple)){
					int count=Integer.parseInt(couples.get(j)[1])+1;
					couples.get(j)[1]=Integer.toString(count);
					isAdded=true;
				}
			}
			if(isAdded==false){
				couples.add(new String[]{couple, "1"});
			}
			counter++;
		}
		
		double multiplayer = (double)100 / counter;
		//Collections.sort(couples);
		for(String[] singleCouple: couples){
			System.out.printf("%s -> %.2f%%\n", singleCouple[0], Integer.parseInt(singleCouple[1])*multiplayer);
		}
		
	}

}

//class Sorter implements Comparator<String[]>{
//
//	@Override
//	public int compare(String[] first, String[] second) {
//		if(Integer.parseInt(first[1])>Integer.parseInt(second[1])){
//			return -1;
//		}else if (Integer.parseInt(first[1])<Integer.parseInt(second[1])){
//			return 1;
//		}
//		return 0;
//	}
//}

