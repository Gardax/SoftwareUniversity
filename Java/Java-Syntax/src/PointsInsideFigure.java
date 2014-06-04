import java.util.Scanner;


public class PointsInsideFigure {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
        String arr[] = input.split(" ");
        double x = Double.parseDouble(arr[0]);
        double y = Double.parseDouble(arr[1]);
		
		if(x<12.5 || x>22.5 || y<6 || y>13.5 || (y>8.5 && y<13.5 && x>17.5 && x<20)){
			System.out.println("Outside");
		}
		else{
			System.out.println("Inside");
		}
	}
}
