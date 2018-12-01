package co.simplon.shop.model.shop;

import java.util.List;

import co.simplon.shop.model.product.Product;
import co.simplon.shop.model.shop.Shop;

public interface IShopRepository {
	
	void saveShop();
	void deleteShop();
	List<Shop> getAllShops();
	List<Product> getProductsByShop(Shop shop);
	int getProductAvailability(Product product, Shop shop);
	void addProductsToShop(Product product, Shop shop, int quantity);
	List<Stock> getShopStocks(Shop shop);
}
