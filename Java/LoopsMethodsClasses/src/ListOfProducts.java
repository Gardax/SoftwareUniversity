import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ListOfProducts {

	public static void main(String[] args) {
		BufferedReader br = null;
        BufferedWriter bw = null;
        ArrayList<Product> products = new ArrayList<Product>();

        try {

                String currentLine;

                br = new BufferedReader(new FileReader("inputProducts.txt"));

                while ((currentLine = br.readLine()) != null) {
                       
                        String[] splitLine = currentLine.split(" ");
                       
                        products.add(new Product(splitLine[0], Double.parseDouble(splitLine[1])));

                }
                Collections.sort(products, new ProductCompare());
               
                bw = new BufferedWriter(new FileWriter("output.txt"));
                for(Product product : products){
                        bw.write((double) product.getPrice()  + " " +product.getProduct() + "\r\n");
                }
               
                bw.close();
        } catch (Exception e) {
                System.out.println("Error!" + e);
        }finally {
                try {
                        if (br != null){
                                br.close();
                        }
                } catch (IOException ex) {
                        ex.printStackTrace();
                }
        }
	}

}
