package homework1;

public class LineItem {
	private int qty ;
	private Product product ;
	
	

	public int getQty() {
		return qty;
	}



	public void setQty(int qty) {
		this.qty = qty;
	}



	public Product getProduct() {
		return product;
	}



	public void setProduct(Product product) {
		this.product = product;
	}

	public double getTotalPrice() {
		//code
		//double price
		//= getQty() * getProduct().getUnitprice() ;
		double price = qty * product.getUnitprice() ;
		return price ;
	}

	public static void main(String[] args) {
		Product p1 = new Product();
		//set description and unit price for toaster
		p1.setDescription("Toaster\n");
		p1.setUnitprice(29.95f);
		
		LineItem l1 = new LineItem() ;
		l1.setProduct(p1);
		l1.setQty(3);
		
		l1.getProduct().print();
		System.out.printf("Total price of l1 : %.2f\n", l1.getTotalPrice()) ;
		
		//create product p2 for hairdryer
		Product p2 = new Product();
		p2.setDescription("Hair Dryer\n");
		p2.setUnitprice(29.95f);
		
		//create line item l2 and reference to product p2
		LineItem l2 = new LineItem();
		l2.setProduct(p2);
		l2.getProduct().print();
		
		l2.setQty(1);
		System.out.printf("Total price of l2 : %.2f\n", l2.getTotalPrice()) ;

	}

}
