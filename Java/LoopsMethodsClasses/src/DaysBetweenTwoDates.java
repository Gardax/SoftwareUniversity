import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class DaysBetweenTwoDates {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String startDate= reader.nextLine();
		String endDate = reader.nextLine();

		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");	
		Date start=null;
		Date end=null;
		try {
			start = format.parse(startDate);
			end = format.parse(endDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		long difference = end.getTime() - start.getTime();
		long days = difference / (24 * 60 * 60 * 1000);
		System.out.println(days);			

	}

}
