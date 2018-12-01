package co.simplon.shop.model.shop;

import co.simplon.shop.model.product.Product;

public class Stock {
	
	
	private final Product product;
	private int quantity;
	
	public Stock(Product product, int quantity) {
		this.product = product;
		this.quantity = quantity;
	}	
	
	public Product getProduct() {
		return product;
	}
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
