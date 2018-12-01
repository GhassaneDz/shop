package co.simplon.shop.model.product;

import co.simplon.shop.model.common.Entity;

public abstract class Product extends Entity{	

	private static final long serialVersionUID = 1L;
	
	private String name;
	private float sellingPrice;
	private float buyingPrice;

	public Product(String name, float sellingPrice, float buyingPrice) {
		this.name = name;
		this.sellingPrice = sellingPrice;
		this.buyingPrice = buyingPrice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(float sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	public float getBuyingPrice() {
		return buyingPrice;
	}

	public void setBuyingPrice(float buyingPrice) {
		this.buyingPrice = buyingPrice;
	}

}
