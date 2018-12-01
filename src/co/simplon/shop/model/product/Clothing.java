package co.simplon.shop.model.product;

public class Clothing extends Product {

	
	private static final long serialVersionUID = 1L;
	private ClothingSize size;
	
	public Clothing(String name,float sellingPrice, float buyingPrice, ClothingSize size) {
		super(name, sellingPrice, buyingPrice);
		setSize(size);
	}

	public ClothingSize getSize() {
		return size;
	}

	public void setSize(ClothingSize size) {
		this.size = size;
	}

}
