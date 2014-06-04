import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Largest3Rectangles {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);

		Pattern p = Pattern.compile("-?\\d+");
		Matcher m = p.matcher(input.nextLine());
		ArrayList<Integer> sides=new ArrayList<Integer>();
		ArrayList<Integer> faces=new ArrayList<Integer>();
		while (m.find()) {
			sides.add(Integer.parseInt(m.group()));
		}
		for (int i = 0; i < sides.size()-1; i+=2) {
			faces.add(sides.get(i)*sides.get(i+1));
		}
		
		int maxFace=0;
		for (int i = 0; i < faces.size()-2; i++) {
			int face=faces.get(i)+faces.get(i+1)+faces.get(i+2);
			if(face>maxFace) maxFace=face;
		}
		
		System.out.println(maxFace);
	}
}
