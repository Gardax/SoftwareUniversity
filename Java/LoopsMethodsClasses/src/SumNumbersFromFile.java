import java.io.BufferedReader;
import java.io.FileReader;


public class SumNumbersFromFile {

	public static void main(String[] args) {
		try{
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            String line;
            long sum = 0;
            while ((line = reader.readLine()) != null) {
            int number = Integer.parseInt(line);
             sum+=number;
            }
            System.out.println(sum);
            reader.close();
        }catch(Exception exeption){
            System.out.println("Error");         
        }    
	}

}
