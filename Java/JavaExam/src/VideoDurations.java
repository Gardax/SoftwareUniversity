import java.sql.Time;
import java.util.Scanner;


public class VideoDurations {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		String line=input.nextLine();
		long hours=0;
		long minutes=0;
		while(!line.equals("End")){
			String[] times=line.split(":");
			hours+=Integer.parseInt(times[0]);
			minutes+=Integer.parseInt(times[1]);
			line=input.nextLine();
		}
		long extraHours=minutes/60;
		minutes=minutes%60;
		
		hours+=extraHours;
		if(minutes<10){
			System.out.println(hours+":0"+minutes);
		}else {
			System.out.println(hours+":"+minutes);
		}
	}

}
