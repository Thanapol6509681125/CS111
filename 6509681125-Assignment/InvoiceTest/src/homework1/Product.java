package homework1;

public class Product {
	
	private String description; //ชื่อสินค้า
	
	private float unitPrice ;
	
	public void setDescription(String name) {
		this.description = name ;
	}
	
	public String getDescription() {
		return this.description ;
	}
	
	public void setUnitprice(float price) {
		this.unitPrice = price ;
	}
	
	public float getUnitprice() {
		return this.unitPrice ;
	}
	
	public void print() {
		System.out.printf("Product name %sUnit Price %f\n", description, unitPrice) ;
	}
	
	public static void main(String[] args) {
		Product p1 = new Product() ;
		p1.setDescription("Toaster\n");
		p1.setUnitprice(29.95f);
		p1.print();
		Product p2 = new Product() ;
		p2.setDescription("Hair Dryer\n");
		p2.setUnitprice(24.95f);
		p2.print();
		Product p3 = new Product() ;
		p3.setDescription("Car Vacuum\n");
		p3.setUnitprice(19.99f);
		p3.print();
	}
	
	
}
