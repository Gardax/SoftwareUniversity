import java.util.Scanner;


public class AngelUnitConverter {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int rows=input.nextInt();
		for(int i=0; i<rows; i++){
			double number=input.nextDouble();
			String unit=input.next();
			if(unit.equals("deg")){
				System.out.printf("%.6f rad", Math.toRadians(number));
			}else{
				System.out.printf("%.6f deg", Math.toDegrees(number));
			}
		}
	}

}
