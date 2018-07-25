package icehs.science.chapter07;

public class ProductTest {
	public static void main(String[] args) {
		Product product = new Product("커피믹스", 12000, 20);
		Product product2 = new Product("종이컵", 3000);
		
		product.printProductInfo();
		product2.printProductInfo();
		
		
	}
}
