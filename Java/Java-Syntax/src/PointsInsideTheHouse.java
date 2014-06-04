import java.util.Scanner;


public class PointsInsideTheHouse {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        
        double abc = Math.abs(12.5 * (3.5 - 8.5) + 17.5 * (8.5 - 8.5) + 22.5 * (8.5 - 3.5));
        double abp = Math.abs(12.5 * (3.5 - y) + 17.5 * (y - 8.5) + x * (8.5 - 3.5));
        double apc = Math.abs(12.5 * (y - 8.5) + x * (8.5 - 8.5) + 22.5 * (8.5 - y));
        double pbc = Math.abs(x * (3.5 - 8.5) + 17.5 * (8.5 - y) + 22.5 * (y - 3.5));

        boolean isInTriangle = false;
        if (abp + apc + pbc == abc) {
                isInTriangle = true;
        }

        if ((x >= 12.5 && x <= 17.5) && (y <= 13.5 && y >= 8.5)) {
                System.out.println("Inside");
        } else if ((x >= 20 && x <= 22.5) && (y <= 13.5 && y >= 8.5)) {
                System.out.println("Inside");
        } else if (isInTriangle) {
                System.out.println("Inside");
        } else {
                System.out.println("Outside");
        }

	}

}
