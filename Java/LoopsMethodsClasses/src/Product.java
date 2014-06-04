
public class Product {
	private String product;
    private double price;
   
    public Product(String product, double price){
            this.product = product;
            this.price = price;
    }
   
    public String getProduct(){
            return product;
    }
   
    public double getPrice(){
            return price;
    }
   
    public int compareTo(Product other) {
   
    	double otherPrice = ((Product) other).getPrice();

    	if(this.price > otherPrice){
    		return 1;
    	}
    	else if(this.price == otherPrice){
            return 0;
    	}
    	else {
            return -1;
    	}
    }  
}
