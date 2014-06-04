import java.text.DecimalFormat;
import java.util.Scanner;


public class SmallestNumber {

	public static void main(String[] args) {
		DecimalFormat format = new DecimalFormat();
	        format.setDecimalSeparatorAlwaysShown(false);
		Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
       
        if (a<b && a<c) {
                System.out.println(format.format(a));
        }else if (b<a && b<c) {
                System.out.println(format.format(b));
        }else {
                System.out.println(format.format(c));
        }
	}

}
