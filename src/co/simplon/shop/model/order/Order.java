package co.simplon.shop.model.order;

import co.simplon.shop.model.client.Client;
import co.simplon.shop.model.common.Entity;
import co.simplon.shop.model.product.Product;
import co.simplon.shop.model.shop.Shop;

public class Order  extends Entity{	

	private static final long serialVersionUID = 1L;	
	
	private Client client;
	private Shop shop;
	private Product product;
	private int quantity;	
	private boolean delivered;	
	
	public Order(Client client, Shop shop, Product product, int quantity, boolean delivered) {
		this.client = client;
		this.shop = shop;
		this.product = product;
		this.quantity = quantity;
		this.delivered = delivered;
	}
	
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Shop getShop() {
		return shop;
	}
	public void setShop(Shop shop) {
		this.shop = shop;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public boolean isDelivered() {
		return delivered;
	}
	public void setDelivered(boolean delivered) {
		this.delivered = delivered;
	}
}
