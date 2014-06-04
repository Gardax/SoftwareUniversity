import java.util.Scanner;


public class TriangleArea {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Point firstSide=new Point();
		firstSide.x=input.nextInt();
		firstSide.y=input.nextInt();
		
		Point secondSide=new Point();
		secondSide.x=input.nextInt();
		secondSide.y=input.nextInt();
		
		Point thirdSide=new Point();
		thirdSide.x=input.nextInt();
		thirdSide.y=input.nextInt();
		
		int area = (firstSide.x*(secondSide.y-thirdSide.y) + secondSide.x*(thirdSide.y-firstSide.y)
				+ thirdSide.x*(firstSide.y-secondSide.y))/2;
		
        System.out.println(Math.abs(area));
        
	}

}

class Point{
	int x;
	int y;
}