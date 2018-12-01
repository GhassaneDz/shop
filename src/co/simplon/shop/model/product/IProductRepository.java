package co.simplon.shop.model.product;

import java.util.List;

public interface IProductRepository {
	
	void addProductToCatalog(Product product);
	void removeProductFromCatalog(Product product);
	List<Product> getProductsInCatalog();
	void removeProductFromShops(Product product);
}
