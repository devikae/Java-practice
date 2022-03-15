package submit2.submit02;

import java.util.Comparator;

public class Product implements Comparable {
	private String name;
	private int price;

	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public Integer getPriceAsInteger() {
        return this.price;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product" + "[name= " + name + ", 가격: " + price + "]\n";
	}


	
	    @Override
	    public int compareTo(Object o) {
	    	Product e = (Product) o;
	    	 return  this.price -e.getPrice() ;
	    }

	
}
